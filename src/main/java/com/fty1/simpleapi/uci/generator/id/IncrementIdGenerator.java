package com.fty1.simpleapi.uci.generator.id;

import com.fty1.simpleapi.uci.generator.AutoFillField;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class IncrementIdGenerator implements AutoFillField {


    private static final long serialVersionUID = 3315478741934596605L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreatedBy
    private Long cuuid;

    @LastModifiedBy
    private Long uuuid;

    @CreatedDate
    private Date ctime;

    @LastModifiedDate
    private Date utime;

    @Version
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCuuid() {
        return cuuid;
    }

    public void setCuuid(Long cuuid) {
        this.cuuid = cuuid;
    }

    public Long getUuuid() {
        return uuuid;
    }

    public void setUuuid(Long uuuid) {
        this.uuuid = uuuid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public Serializable cuuid() {
        return this.uuuid;
    }

    @Override
    public Date ctime() {
        return this.ctime;
    }

    @Override
    public Serializable uuuid() {
        return this.uuuid;
    }

    @Override
    public Date utime() {
        return this.utime;
    }

    @Override
    public Long version() {
        return this.version;
    }
}

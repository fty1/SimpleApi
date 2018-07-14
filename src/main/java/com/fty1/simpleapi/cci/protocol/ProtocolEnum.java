package com.fty1.simpleapi.cci.protocol;

public enum ProtocolEnum {

//
//    file 资源是本地计算机上的文件。格式file:///，注意后边应是三个斜杠。
//    ftp 通过 FTP访问资源。格式 FTP://
//    gopher 通过 Gopher 协议访问该资源。
//    http 通过 HTTP 访问该资源。 格式 HTTP://
//    https 通过安全的 HTTPS 访问该资源。 格式 HTTPS://
//    mailto 资源为电子邮件地址，通过 SMTP 访问。 格式 mailto:
//    MMS 通过 支持MMS（流媒体）协议的播放该资源。（代表软件：Windows Media Player）格式 MMS://
//    ed2k 通过 支持ed2k（专用下载链接）协议的P2P软件访问该资源。（代表软件：电驴） 格式 ed2k://
//    Flashget 通过 支持Flashget:（专用下载链接）协议的P2P软件访问该资源。（代表软件：快车） 格式 Flashget://
//    thunder 通过 支持thunder（专用下载链接）协议的P2P软件访问该资源。（代表软件：迅雷） 格式 thunder://
//   news 通过 NNTP 访问该资源。

    FILE,
    FTP,
    HTTP,
    HTTPS
}

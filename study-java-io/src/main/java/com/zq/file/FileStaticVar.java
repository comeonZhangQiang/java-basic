package com.zq.file;

import java.io.File;

/**
 * 介绍File类的静态成员变量
 */
public class FileStaticVar {

    public static void main(String[] args) {
        // 1.文件分隔符：在windows系统下是：反斜杠\  在linux系统下是：正斜杠/
        // 注意：在涉及到路径时，不要把文件分隔符写死了，因为我们的应用程序通常会部署到linux系统下，但也有可能部署到windows系统下
        String separator = File.separator;
        System.out.println(separator);

        // 2.路径分隔符，比如我们在windows下配置的环境变量path，多个路径之间是通过;来分割开的
        // 注意：在涉及到多个文件路劲时，不要把路径分隔符写死了，因为windows下的路径分割符是;   而在linux系统下路径分隔符是:
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

    }
}

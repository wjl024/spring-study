package com.spring.aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class QrCodetest {
    public static void main(String[] args) {
        QrConfig config=new QrConfig(300,300);
        config.setMargin(3);
        config.setImg("d:/timg.jpg");
        Color foreColor=new Color(238,110,115);
        int foreColorRGB=foreColor.getRGB();
        config.setForeColor(foreColorRGB);
        config.setBackColor(Color.white.getRGB());
        QrCodeUtil.generate("https://www.jianshu.com/u/a32873d23481",config,FileUtil.file("D:/qrcode.jpg"));
    }
}

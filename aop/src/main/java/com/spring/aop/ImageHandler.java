package com.spring.aop;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Aspect
public class ImageHandler {
    private static final Logger logger= LoggerFactory.getLogger(ImageHandler.class);
    @Pointcut("execution(* com.spring.aop.ImageCopy.copyImage())")
    public void handleImage(){}
    @Before(value = "handleImage()")
    public void pressTextOnImage() throws IOException {
        logger.info("开始给图片添加水印");
        File srcFile=new File("D:/100.jpg");
        BufferedImage srcImg= ImageIO.read(new FileInputStream(srcFile));
        int height=srcImg.getHeight();
        int width=srcImg.getWidth();
        File destFile=new File("D:/110.jpg");
        Color color =new Color(211,71,38);
        int size=15;
        Font font=new Font("微软雅黑",Font.BOLD,size);
        String text="微信";
        ImageUtil.pressText(srcFile,destFile,text,color,font,width/2-text.length()*size,height/2-size,0.8f);
    }
    @AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始讲图片转成黑白色");
        File srcFile=new File("E:/110.jpg");
        File destFile=new File("E:/112.jpg");
        ImageUtil.gray(srcFile,destFile);
    }
}

//package org.lilly.demo.code;
//
//import org.lilly.core.validate.code.ImageCode;
//import org.lilly.core.validate.code.ValidateGenerator;
//import org.springframework.stereotype.Component;
//
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.util.Random;
//
///**
// * User: Mr.Wang
// * Date: 2020/6/13
// */
//@Component(value = "validateImageGenerator")
//public class ImageCodeGenerator implements ValidateGenerator {
//    @Override
//    public ImageCode generator() {
//        int width = 100;
//        int height = 20;
//        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//        Graphics g = image.getGraphics();
//        Random random = new Random();
//        g.setColor(getRandColor(200, 250));
//        g.fillRect(0, 0, width, height);
//        g.setFont(new Font("Times New Roman", Font.ITALIC, 20));
//        g.setColor(getRandColor(120, 200));
//        for (int i = 0; i < 155; i++) {
//            int x = random.nextInt(width);
//            int y = random.nextInt(height);
//            int xl = random.nextInt(12);
//            int yl = random.nextInt(12);
//            g.drawLine(x, y, x + xl, y + yl);
//        }
//
//        String sRand = "";
//        for (int i = 0; i < 2; i++) {
//            String rand = String.valueOf(random.nextInt(10));
//            sRand += rand;
//            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
//            g.drawString(rand, 13 * i + 6, 16);
//        }
//        g.dispose();
//        return new ImageCode(image, sRand, 60);
//    }
//
//    private Color getRandColor(int fc, int bc) {
//        Random random = new Random();
//        if (fc > 215) {
//            fc = 255;
//        }
//        if (bc > 225) {
//            bc = 255;
//        }
//        int r = fc + random.nextInt(bc - fc);
//        int g = fc + random.nextInt(bc - fc);
//        int b = fc + random.nextInt(bc - fc);
//        return new Color(r, g, b);
//    }
//}
//
//
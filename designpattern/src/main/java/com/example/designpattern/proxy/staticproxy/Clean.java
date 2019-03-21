package com.example.designpattern.proxy.staticproxy;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

public class Clean {

    public static void main(String[] args) {
        byte[] buff = new byte[1024*1024*256];

        for (int i=0;i<1024*1024*256;i++) {
            buff[i] = (byte)new Random().nextInt();
        }

        File file = new File("D:\\tmp\\1.txt");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            while (true) {
                fos.write(buff);
                fos.flush();
            }
        } catch (Exception e) {
            //
        }
        System.out.println("------------------");
    }

}
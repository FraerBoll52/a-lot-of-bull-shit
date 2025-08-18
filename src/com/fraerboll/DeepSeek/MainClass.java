package com.fraerboll.DeepSeek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ThreadPoolExecutor;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
//        Thread1 test = new Thread1(1,5);
//        Thread1 test2 = new Thread1(10,14);
//
//        test.run();
//        test2.run();
        Path relativePath = Paths.get("/Users/kirillzeltov/a-lot-of-bull-shit/test.txt");




        try(FileInputStream file = new FileInputStream(relativePath.toFile())){
            System.out.println(file.available());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Current working directory: " + System.getProperty("user.dir"));

    }

}

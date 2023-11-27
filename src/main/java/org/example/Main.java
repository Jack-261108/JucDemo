package org.example;

/**
 * @author Jack
 * @Desc
 * @Date 2023/11/24/16:17:16
 **/
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = Main.class.getClassLoader();
        classLoader.loadClass("org.example.AQS");
    }
}
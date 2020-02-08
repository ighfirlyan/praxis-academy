package com.project;

public class mainApp{
    public static void main(String[] args) {
        threadSample t1 = new threadSample("THREAD1");
        t1.start();
        threadSample t2 = new threadSample("THREAD2");
        t2.start();
    }   
}
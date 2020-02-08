/*
 * This Java source file was taken from https://www.kurungkurawal.com/2011/04/25/aplikasi-multithread-dengan-java/
 */
package com.project;

public class threadSample extends Thread{
    private String name;
    threadSample(String name){
        this.name = name;
    }
    @Override
    public void start(){ //gunakan void run untuk menampilkan secara seri
        for(int i=1; i<=10; i++){
            System.out.println("th: " + this.name + ", cetak baris ke " + i);
        }
        System.out.println(this.name + "SELESAI");
        System.out.println();
    }
}
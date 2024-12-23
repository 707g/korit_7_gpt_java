package com.korit.main;

import javax.sql.rowset.spi.TransactionalWriter;

public class Main7 {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        System.out.println("첫 번째 반복문 i: " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("프로그램에 오류가 발생함.");
                    }
                }
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Runnable runnable2 = () -> {
            for (int i = 0; i < 100; i++) {
                try {
                    System.out.println("두 번째 반복문 i: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("프로그램 오류가 발생함.");
                }
            }
        };

        Thread t2 = new Thread(runnable2);
        t2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("MAIN Thread i: " + i);
            Thread.sleep(1000);
        }



    }
}

package com.github.nuuttirissanen.oh2vko8.tehtava5;

public class Tulosta implements Runnable{

    private static final int kertaa = 101;
    char c;

    public Tulosta(char c) {
        this.c = c;
    }
    @Override
    public void run() {
        for (int i = 1; i < kertaa; i++) {
            System.out.println(this.c + "" + i);
        }
    }
}

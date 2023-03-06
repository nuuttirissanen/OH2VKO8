package com.github.nuuttirissanen.oh2vko8.tehtava1;


public class Tulosta implements Runnable {
    private String tulostettava;
    private int kertaa;

    public Tulosta(String s, int i) {
        this.tulostettava = s;
        this.kertaa = i;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.kertaa; i++) {
            System.out.println(tulostettava);
        }
    }
}

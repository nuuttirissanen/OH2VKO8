package com.github.nuuttirissanen.oh2vko8.tehtava4;

public class LisaaYksi implements Runnable {
    protected static int luku = 0;

    public synchronized void lisaa() {
        luku++;
    }

    @Override
    public void run() {
        lisaa();
    }
}

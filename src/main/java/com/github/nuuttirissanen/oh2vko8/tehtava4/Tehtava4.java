package com.github.nuuttirissanen.oh2vko8.tehtava4;

public class Tehtava4 {

    public static void main(String[] args) throws InterruptedException {

        LisaaYksi[] oliot = new LisaaYksi[1000];
        Thread[] saikeet = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            oliot[i] = new LisaaYksi();
            saikeet[i] = new Thread(oliot[i]);
        }

        for (Thread t : saikeet) {
            t.start();
        }
        for (Thread t : saikeet) {
            t.join();
        }


        System.out.println(LisaaYksi.luku);
    }
}

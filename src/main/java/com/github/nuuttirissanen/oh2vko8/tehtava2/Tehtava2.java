package com.github.nuuttirissanen.oh2vko8.tehtava2;

public class Tehtava2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable tulostaA = new Tulosta("Ja tulostuu", 100);
        Runnable tulostaB = new Tulosta("Ja tulostuu lisää", 100);
        Runnable tulostaC = new Tulosta("Ja vieläkin lisää", 100);

        Thread t1 = new Thread(tulostaA);
        Thread t2 = new Thread(tulostaB);
        Thread t3 = new Thread(tulostaC);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}


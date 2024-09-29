package InputOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // Tek ve çift sayılar için ortak kullanılan listeler
    private static List<Integer> tekSayilar = Collections.synchronizedList(new ArrayList<>());
    private static List<Integer> ciftSayilar = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            sayilar.add(i);
        }

        List<Integer> part1 = sayilar.subList(0, 2500);
        List<Integer> part2 = sayilar.subList(2500, 5000);
        List<Integer> part3 = sayilar.subList(5000, 7500);
        List<Integer> part4 = sayilar.subList(7500, 10000);

        // Her parçayı işleyecek Thread'leri oluşturuyoruz
        Thread t1 = new NumberProcessor(part1);
        Thread t2 = new NumberProcessor(part2);
        Thread t3 = new NumberProcessor(part3);
        Thread t4 = new NumberProcessor(part4);

        // Thread'leri başlatıyoruz
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Thread'lerin bitmesini bekliyoruz
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("Tek sayılar: " + tekSayilar);
        System.out.println("Çift sayılar: " + ciftSayilar);
    }

    // Sayıları işleyen Thread sınıfı
    static class NumberProcessor extends Thread {
        private List<Integer> sayilar;

        public NumberProcessor(List<Integer> sayilar) {
            this.sayilar = sayilar;
        }

        @Override
        public void run() {
            for (int sayi : sayilar) {
                if (sayi % 2 == 0) {
                    ciftSayilar.add(sayi);
                } else {
                    tekSayilar.add(sayi);
                }
            }
        }
    }
}


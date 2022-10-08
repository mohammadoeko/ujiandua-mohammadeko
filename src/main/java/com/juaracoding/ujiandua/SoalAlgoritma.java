package com.juaracoding.ujiandua;

public class SoalAlgoritma {
    public static void main(String[] args) {

        algoritma(1, 10);
    }

    static void algoritma(int angkaPertama, int angkaTerakhir) {
        for (int i = angkaPertama; i <= angkaTerakhir; i++) {
            if (i < 6) {
                for (int j = i; j <= angkaTerakhir; j++) {
                    if (j+i == 11) {
                        System.out.print("");
                        break;
                    } else if (j % 2 == 1) {
                        System.out.print(j);
                    } else if (j % 2 == 0) {
                        System.out.print("_");
                    }
                }
            }
            System.out.println();
        }
    }
}

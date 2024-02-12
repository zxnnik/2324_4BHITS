package com.company;

public class starter1 {

    public static void method() {
        long g = 209;
        long p = 991;
        int d = 0;
        long erg;

        do {
            erg = (g * d) % p;
            if (erg == 1) {
                System.out.println(d);
            } else {
                d++;
            }
        } while (erg != 1);
    }
}

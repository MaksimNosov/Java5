package ru.netology.sqr;

public class SQRService {
    public int calculate(int intervalStart, int intervalEnd) {

        int z = 0;

        for (int i = 10; (i * i) <= intervalEnd; i++) {

            if ((i * i) < intervalStart) {
                continue;
            }

            if (i > 99) {
                break;
            }

            if ((i * i) <= intervalEnd) {
                z++;
            }

        }
        return z;
    }
}
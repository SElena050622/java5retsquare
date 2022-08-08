package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int min, int max) {
        int count = 0;
        for(int i = 10; i <=99; i++){
            int ii = i * i;
            if(ii >= min) {
                if(ii <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}

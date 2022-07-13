package ru.netology.sqr;

public class SQRService {
    public int CountSquare(int start, int end) {

        int result = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i < start) {
                continue;
            } else if (i * i > end) {
                break;
            } else {
                result++;
            }
        }
        return result;
    }
}

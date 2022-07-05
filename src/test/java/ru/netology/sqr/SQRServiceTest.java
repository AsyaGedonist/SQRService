package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "1,100,101",
            "4,200,300"
    })
    public void testSquareCount(int expected, int start, int end) {
        SQRService service = new SQRService();
        int actual = service.CountSquare(start, end);
        Assertions.assertEquals(expected, actual);
    }
}

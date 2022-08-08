package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testMetodRetSquare1() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMetodRetSquare2() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}

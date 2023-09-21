package ru.netology.HW6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    public void shouldFindSumSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actual);


    }

    @Test
    public void shouldFindMeanSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.meanSales(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindMaxSalesValue() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMounth = 8;
        int actual = service.getMaxMounth(sales);
        Assertions.assertEquals(expectedMaxMounth, actual);


    }

    @Test
    public void shouldFindMinSalesValue() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMounth = 9;
        int actual = service.getMinMounth(sales);
        Assertions.assertEquals(expectedMinMounth, actual);


    }

    @Test
    public void shouldFindUnderMeanMounth() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMounthQua = 5;
        int actual = service.getUnderMean(sales);
        Assertions.assertEquals(expectedMounthQua, actual);

    }

    @Test
    public void shouldFindAboveMeanMounth() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMounthQua = 5;
        int actual = service.getAboveMean(sales);
        Assertions.assertEquals(expectedMounthQua, actual);
    }
}

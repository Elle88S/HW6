package ru.netology.HW6.services;

public class StatService {
    public long sumSales(long[] sales) {
        long summary = 0;
        for (long sale : sales) {
            summary += sale;

        }

        return summary;
    }


    public long meanSales(long[] sales) {
        long mean = sumSales(sales) / 12;
        return mean;
    }

    public int getMaxMounth(long[] sales) {
        int maxMounth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMounth]) {
                maxMounth = i;
            }
        }
        return maxMounth + 1;
    }

    public int getMinMounth(long[] sales) {
        int minMounth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMounth]) {
                minMounth = i;
            }
        }

        return minMounth + 1;
    }

    public int getUnderMean(long[] sales) {
        int underMean = 0;
        long meanSales = meanSales(sales);
        for (long sale : sales) {
            if (sale < meanSales) {
                underMean++;

            }
        }

        return underMean;
    }

    public int getAboveMean(long[] sales) {
        int aboveMean = 0;
        long meanSales = meanSales(sales);
        for (long sale : sales) {
            if (sale > meanSales) {
                aboveMean++;

            }
        }

        return aboveMean;
    }
}
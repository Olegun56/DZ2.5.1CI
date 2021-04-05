package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    class StatisticsServiceTest {

        @Test
        void findMax() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {1,2,3, 4, 5, 6, 7, 8, 9, 10, 11};
            long expected = 11;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

    }
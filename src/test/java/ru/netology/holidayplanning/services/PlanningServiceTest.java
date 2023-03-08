package ru.netology.holidayplanning.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlanningServiceTest {
    @Test
    public void incomeTenThousand() {
        PlanningService service = new PlanningService();

        int expected = 3;

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void incomeHundredThousand() {
        PlanningService service = new PlanningService();

        int expected = 2;

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;


        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }

}


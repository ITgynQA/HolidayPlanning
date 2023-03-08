package ru.netology.holidayplanning.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlanningServiceTest {
    @Test
    public void incomeTenThousand() {
        PlanningService service = new PlanningService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void incomeHundredThousand() {
        PlanningService service = new PlanningService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

}


package ru.netology.holidayplanning.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class PlanningServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/planning.csv")

    public void incomeTenThousand(int expected, int income, int expenses, int threshold) {
        PlanningService service = new PlanningService();


        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}


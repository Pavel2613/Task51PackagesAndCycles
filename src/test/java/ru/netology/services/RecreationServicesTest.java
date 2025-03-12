package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.RecreationServices;

public class RecreationServicesTest {

    @ParameterizedTest
//    @CsvSource({
//            "3, 10000, 3000, 20000",
//            "2, 100000, 60000, 150000"
//    })
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void poorFreelancer(int expected, int income, int expenses, int threshold) {
        RecreationServices service = new RecreationServices();
        //int expected = 3;
        int result = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, result);

    }

//    @Test
//    public void richFreelancer() {
//        RecreationServices service = new RecreationServices();
//        int expected = 2;
//        int result = service.calculate(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, result);
//
//    }
}


package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.RecreationServices;

public class RecreationServicesTest {

    @Test
    public void poorFreelancer() {
        RecreationServices service = new RecreationServices();
        int expected = 3;
        int result = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, result);

    }

    @Test
    public void richFreelancer() {
        RecreationServices service = new RecreationServices();
        int expected = 2;
        int result = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, result);

    }
}


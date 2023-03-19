package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioParameterTest {

    @Test
    public void test() {
        Radio radio = new Radio(10);
        radio.setNumberRadioStation(9);

        int expected = 9;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);

    }
}

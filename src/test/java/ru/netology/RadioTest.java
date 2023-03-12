package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadiostation() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(8);

        int expected = 8;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(-2);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextTest() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevTest() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.prev();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }


}

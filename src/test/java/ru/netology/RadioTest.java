package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadiostation() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(5);
        int expected = 5;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadiostation1() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(0);
        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadiostation2() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(1);
        int expected = 1;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadiostation3() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(-1);
        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadiostation4() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(8);
        int expected = 8;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadiostation5() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(9);
        int expected = 9;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadiostation6() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(10);
        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadiostation7() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(13);
        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadiostation8() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(-5);
        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        int expected = 5;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldSetVolume1() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldSetVolume2() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldSetVolume3() {
        Radio radio = new Radio();
        radio.setVolume(-3);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldSetVolume4() {
        Radio radio = new Radio();
        radio.setVolume(1);
        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldSetVolume5() {
        Radio radio = new Radio();
        radio.setVolume(9);
        int expected = 9;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldSetVolume6() {
        Radio radio = new Radio();
        radio.setVolume(10);
        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldSetVolume7() {
        Radio radio = new Radio();
        radio.setVolume(11);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldSetVolume8() {
        Radio radio = new Radio();
        radio.setVolume(25);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }









    @Test
    public void nextTest() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextTest1() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextTest2() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextTest3() {
        Radio radio = new Radio();
        radio.setNumberRadioStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextTest4() {
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
        radio.setVolume(5);
        radio.prev();
        int expected = 6;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevTest1() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.prev();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevTest2() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.prev();
        int expected = 2;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevTest3() {
        Radio radio = new Radio();
        radio.setVolume(9);
        radio.prev();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevTest4() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.prev();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }



}

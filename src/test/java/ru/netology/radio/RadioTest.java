package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {
    @Test
    public void shouldSetNextStationBorder() {
        Radio radio = new Radio();

        radio.setCurrentStationNum(8);
        radio.next();
        Assertions.assertEquals(9, radio.getCurrentStationNum());
    }
    @Test
    public void shouldSetNextStationZero() {
        Radio radio = new Radio();

        radio.setCurrentStationNum(9);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }
    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNum(5);
        radio.next();
        Assertions.assertEquals(6, radio.getCurrentStationNum());
    }
    @Test
    public void shouldSetPrevStationBorder() {
        Radio radio = new Radio();

        radio.setCurrentStationNum(1);
        radio.prev();
        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }
    @Test
    public void shouldSetPrevStationNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNum(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStationNum());
    }
    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNum(5);
        radio.prev();
        Assertions.assertEquals(4, radio.getCurrentStationNum());
    }
    @Test
    public void shouldDontSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNum(11);
        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }
    @Test
    public void shouldDontSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNum(-1);
        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }
    @Test
    public void shouldStaySameStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNum(5);
        Assertions.assertEquals(5, radio.getCurrentStationNum());
    }

    @Test
    public void shouldUpVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.upVolume();
        Assertions.assertEquals(51, radio.getCurrentVolume());
    }
    @Test
    public void shouldDownVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.downVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());
    }
    @Test
    public void shouldStayMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.upVolume();
        radio.maxVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldStayMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.downVolume();
        radio.minVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldUpOnMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.upVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldDownOnMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.downVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotUpVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.upVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotDownVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.downVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
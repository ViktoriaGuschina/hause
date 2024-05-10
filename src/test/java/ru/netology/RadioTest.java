package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void sholeSetNomberRadioStation() {

        radio.setCurrentRadioStationNumber(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholeSetsoundVolume() {

        radio.setCurrentVolume(56);

        int expected = 56;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStationNumber() {
        radio.setToMaxRadioStationNumber();

        int expected = 9;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStationNumber() {
        radio.setToMinRadioStationNumber();

        int expected = 0;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulSetMaxVolume() {
        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotVolumeAboveMax() {
        radio.setCurrentVolume(110);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotVolumeAboveMin() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMin() {
        radio.setCurrentRadioStationNumber(-1);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        int current = radio.currentVolume;
        radio.increaseVolume();
        int expected = current + 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        int current = radio.currentVolume;
        radio.reduceVolume();
        int expected = current - 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNumber() {
        int current = radio.currentRadioStationNumber;
        radio.increaseRadioStationNumber();
        int expected = current + 1;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceRadioStationNumber () {
        int current = radio.getCurrentRadioStationNumber();
        radio.reduceRadioStationNumber();
        int expected = current - 1;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }
}
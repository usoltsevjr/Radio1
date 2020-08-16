package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldGetRadiostationNumberMax() {
        Radio radio = new Radio(
                15,
                5,
                50,
                true);

        assertEquals(15, radio.getRadiostationNumberMax());
    }

    @Test
    public void shouldGetCurrentRadiostation() {
        Radio radio = new Radio(
                15,
                5,
                50,
                true);

        assertEquals(5, radio.getCurrentRadiostationNumber());
    }

    @Test
    public void shouldGetVolumeMax() {
        Radio radio = new Radio(
                15,
                5,
                50,
                true);
        assertEquals(100, radio.getVolumeMax());
    }

    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio(
                15,
                5,
                40,
                true);
        assertEquals(40, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextRadiostation() {
        Radio radio = new Radio(
                15,
                7,
                50,
                true);
        radio.nextRadiostation();

        assertEquals(8, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation2() {
        Radio radio = new Radio(
                15,
                15,
                50,
                true);

        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation3() {
        Radio radio = new Radio(
                15,
                5,
                50,
                true);
        radio.setCurrentRadiostationNumber(20);
        radio.nextRadiostation();

        assertEquals(15, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation4() {
        Radio radio = new Radio(
                15,
                5,
                50,
                true);
        radio.setCurrentRadiostationNumber(-1);
        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }


    @Test
    public void shouldPrevRadiostation() {
        Radio radio = new Radio(
                15,
                8,
                50,
                true);
        radio.prevRadiostation();

        assertEquals(7, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation2() {
        Radio radio = new Radio(
                15,
                10,
                50,
                true);
        radio.setCurrentRadiostationNumber(0);
        radio.prevRadiostation();

        assertEquals(15, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation3() {
        Radio radio = new Radio(
                15,
                5,
                50,
                true);
        radio.setCurrentRadiostationNumber(20);
        radio.prevRadiostation();

        assertEquals(15, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation4() {
        Radio radio = new Radio(
                15,
                7,
                50,
                true);
        radio.setCurrentRadiostationNumber(-2);
        radio.prevRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldVolumeUp() {
        Radio radio = new Radio(
                15,
                7,
                50,
                true);
        radio.volumeUp();

        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp2() {
        Radio radio = new Radio(
                15,
                7,
                40,
                true);
        radio.setCurrentVolume(101);
        radio.volumeUp();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp3() {
        Radio radio = new Radio(
                15,
                7,
                50,
                true);
        radio.setCurrentVolume(-5);
        radio.volumeUp();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown() {
        Radio radio = new Radio(
                15,
                7,
                50,
                true);
        radio.volumeDown();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown2() {
        Radio radio = new Radio(
                15,
                7,
                111,
                true);
        radio.volumeDown();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown3() {
        Radio radio = new Radio(
                15,
                7,
                -5,
                true);
        radio.volumeDown();

        assertEquals(0, radio.getCurrentVolume());
    }

}
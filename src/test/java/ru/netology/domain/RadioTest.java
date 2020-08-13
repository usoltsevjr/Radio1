package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNextRadiostation1() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(5);
        radio.nextRadiostation();

        assertEquals(6, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation2() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(9);
        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation3() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(11);
        radio.nextRadiostation();

        assertEquals(9, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldNextRadiostation4() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(-1);
        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }


    @Test
    public void shouldPrevRadiostation1() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(5);
        radio.prevRadiostation();

        assertEquals(4, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation2() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(0);
        radio.prevRadiostation();

        assertEquals(9, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation3() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(11);
        radio.prevRadiostation();

        assertEquals(9, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldPrevRadiostation4() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(-2);
        radio.prevRadiostation();

        assertEquals(0, radio.getCurrentRadiostationNumber());

    }

    @Test
    public void shouldVolumeUp1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volumeUp();

        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        radio.volumeUp();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        radio.volumeUp();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVomumeDown1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.volumeDown();

        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldVomumeDown2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumeDown();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVomumeDown3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();

        assertEquals(0, radio.getCurrentVolume());
    }

}
package ru.netology;

import org.junit.jupiter.api.Test;
//import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setIncreaseVolume();
        int expected = 3;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setDecreaseVolume();
        int expected = 1;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setMinVolume () {
        Radio radio = new Radio();
        radio.setMinVolume (0);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setMinStation () {
        Radio radio = new Radio();
        radio.setMinStation (0);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.setNextStation();
        int expected = 8;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setNextRoundStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation ();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.setPrevStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setPrevRoundStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }



}
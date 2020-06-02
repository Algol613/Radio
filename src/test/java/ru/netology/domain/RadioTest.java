package ru.netology.domain;

import org.junit.jupiter.api.Test;

abstract class RadioTest {
    @Test
    public void shouldCreate() {

<<<<<<< HEAD
class RadioTest {
    private Radio radio;

    public RadioTest() {
        this.radio = new Radio(0, 10, 0, 100);
    }

    @Test
    void setCountStation();

    {
        Radio radio2 = new Radio(20);
        radio2.setCurrentStation();
        int expected = 19;
        assertEquals(19, radio2.getMaxStation());
    }

    @Test
    void setCurrentVolume();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(20);
        int expected = 20;
        assertEquals(expected, radio2.getCurrentVolume());
    }

    @Test
    void setIncreaseVolume();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(2);
        radio2.setIncreaseVolume();
        int expected = 3;
        assertEquals(expected, radio2.getCurrentVolume());
    }

    @Test
    void setDecreaseVolume();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(2);
        radio2.setDecreaseVolume();
        int expected = 1;
        assertEquals(expected, radio2.getCurrentVolume());
    }

    @Test
    void setMaxVolume();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(10);
        int expected = 10;
        assertEquals(expected, radio2.getCurrentVolume());
    }

    @Test
    void setMinVolume();

    {
        Radio radio2 = new Radio();
        radio2.setMinVolume(0);
        int expected = 0;
        assertEquals(expected, radio2.getCurrentVolume());
    }

    @Test
    void setAboveMaxVolume();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(11);
        int expected = 0;
        assertEquals(expected, radio2.getCurrentVolume());
    }

    @Test
    void setAboveMinVolume();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, radio2.getCurrentVolume());
    }


    @Test
    void setMinStation();

    {
        Radio radio2 = new Radio();
        radio2.setMinStation(0);
        int expected = 0;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    void setNextStation();

    {
        Radio radio2 = new Radio();
<<<<<<< HEAD
        radio2.setCurrentStation(7);
=======
        radio2.setCurrentStation();
>>>>>>> flexible
        radio2.setNextStation();
        int expected = 8;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    void setNextRoundStation();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentStation();
        radio2.setNextStation();
        int expected = 0;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    void setPrevStation();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentStation();
        radio2.setPrevStation();
        int expected = 1;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    void setPrevRoundStation();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentStation();
        radio2.setPrevStation();
        int expected = 9;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    void setAboveMaxStation() {
        Radio radio2 = new Radio();
        radio2.setCurrentStation();
        int expected = 0;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    public void setAboveMinStation();

    {
        Radio radio2 = new Radio();
        radio2.setCurrentStation();
        int expected = 0;
        assertEquals(expected, radio2.getCurrentStation());
    }

    void setUserFirstStationWhenLast() {
        Radio radio2 = new Radio(20);
        radio2.setCurrentStation();
        radio2.setCurrentStation();
        int expected = 0;
        assertEquals(expected, radio2.getCurrentStation());
    }
}
=======
        Radio radio = new Radio();
    }
}
>>>>>>> a76c20234ef97a8e26a01e49f201d211c98f85f5

package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetMaxRadioStation() {
        Radio cond = new Radio();
        cond.maxNumberRadioStation();
        int expected = 9;
        int actual = cond.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio cond = new Radio();
        cond.minNumberRadioStation();
        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio cond = new Radio();
        cond.setNumberCurrentRadioStation(10);
        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio cond = new Radio();
        cond.setNumberCurrentRadioStation(-1);
        int expected = 9;
        int actual = cond.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased1() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(0);
        cond.valueRadioStationUp();

        int expected = 1;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased2() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(8);
        cond.valueRadioStationUp();

        int expected = 9;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased3() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(9);
        cond.valueRadioStationUp();

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased1() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(0);
        cond.valueRadioStationDown();

        int expected = 9;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased2() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(9);
        cond.valueRadioStationDown();

        int expected = 8;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased3() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(1);
        cond.valueRadioStationDown();

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}

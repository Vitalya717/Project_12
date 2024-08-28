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
    public void theNumberOfTheCurrentRadioStationHasIncreased_1() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(0);
        cond.valueRadioStationUp();

        int expected = 1;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased_2() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(8);
        cond.valueRadioStationUp();

        int expected = 9;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased_3() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(9);
        cond.valueRadioStationUp();

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased_1() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(0);
        cond.valueRadioStationDown();

        int expected = 9;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased_2() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(9);
        cond.valueRadioStationDown();

        int expected = 8;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased_3() {
        Radio cond = new Radio();

        cond.setNumberCurrentRadioStation(1);
        cond.valueRadioStationDown();

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theMaxVolumeShouldBeSet() {
        Radio cond = new Radio();

        cond.maxSoundVolumeRadio();

        int expected = 100;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theMinVolumeShouldBeSet() {
        Radio cond = new Radio();

        cond.minSoundVolumeRadio();

        int expected = 0;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio cond = new Radio();

        cond.setSoundVolumeRadio(101);

        int expected = 100;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio cond = new Radio();

        cond.setSoundVolumeRadio(-1);

        int expected = 0;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theSoundVolumeHasIncreased_1() {
        Radio cond = new Radio();

        cond.setSoundVolumeRadio(99);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theSoundVolumeHasIncreased_2() {
        Radio cond = new Radio();

        cond.setSoundVolumeRadio(0);
        cond.increaseVolume();

        int expected = 1;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theSoundVolumeHasIncreased_3() {
        Radio cond = new Radio();

        cond.setSoundVolumeRadio(100);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeOfTheSoundHasDecreased_1() {
        Radio cond = new Radio();

        cond.setSoundVolumeRadio(1);
        cond.downVolume();

        int expected = 0;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeOfTheSoundHasDecreased_2() {
        Radio cond = new Radio();

        cond.setSoundVolumeRadio(100);
        cond.downVolume();

        int expected = 99;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeOfTheSoundHasDecreased_3() {
        Radio cond = new Radio();

        cond.setSoundVolumeRadio(0);
        cond.downVolume();

        int expected = 0;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
}

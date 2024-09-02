package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio cond = new Radio(20);

    @Test
    public void shouldSetMaxRadioStation() {

        cond.setNumberCurrentRadioStation(20);

        int expected = 20;
        int actual = cond.getMaxNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {

        cond.setNumberCurrentRadioStation(0);

        int expected = 0;
        int actual = cond.getMinNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {

        cond.setNumberCurrentRadioStation(25);

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {

        cond.setNumberCurrentRadioStation(-1);

        int expected = 20;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased_1() {

        cond.setNumberCurrentRadioStation(0);
        cond.valueRadioStationUp();

        int expected = 1;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased_2() {

        cond.setNumberCurrentRadioStation(18);
        cond.valueRadioStationUp();

        int expected = 19;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased_3() {

        cond.setNumberCurrentRadioStation(20);
        cond.valueRadioStationUp();

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased_1() {

        cond.setNumberCurrentRadioStation(0);
        cond.valueRadioStationDown();

        int expected = 20;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased_2() {

        cond.setNumberCurrentRadioStation(20);
        cond.valueRadioStationDown();

        int expected = 19;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased_3() {

        cond.setNumberCurrentRadioStation(1);
        cond.valueRadioStationDown();

        int expected = 0;
        int actual = cond.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theMaxVolumeShouldBeSet() {

        cond.setSoundVolumeRadio(100);

        int expected = 100;
        int actual = cond.getMaxSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theMinVolumeShouldBeSet() {

        cond.setSoundVolumeRadio(0);

        int expected = 0;
        int actual = cond.getMinSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {

        cond.setSoundVolumeRadio(101);

        int expected = 100;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {

        cond.setSoundVolumeRadio(-1);

        int expected = 0;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theSoundVolumeHasIncreased_1() {

        cond.setSoundVolumeRadio(99);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theSoundVolumeHasIncreased_2() {

        cond.setSoundVolumeRadio(0);
        cond.increaseVolume();

        int expected = 1;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theSoundVolumeHasIncreased_3() {

        cond.setSoundVolumeRadio(100);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeOfTheSoundHasDecreased_1() {

        cond.setSoundVolumeRadio(1);
        cond.downVolume();

        int expected = 0;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeOfTheSoundHasDecreased_2() {

        cond.setSoundVolumeRadio(100);
        cond.downVolume();

        int expected = 99;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeOfTheSoundHasDecreased_3() {

        cond.setSoundVolumeRadio(0);
        cond.downVolume();

        int expected = 0;
        int actual = cond.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
}

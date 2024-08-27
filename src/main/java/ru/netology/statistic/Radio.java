package ru.netology.statistic;

public class Radio {
    public int numberCurrentRadioStation;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void maxNumberRadioStation() {
        numberCurrentRadioStation = 9;
    }

    public void minNumberRadioStation() {
        numberCurrentRadioStation = 0;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < 0) {
            newNumberCurrentRadioStation = 9;
        }
        if (newNumberCurrentRadioStation > 9) {
            newNumberCurrentRadioStation = 0;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void valueRadioStationUp() {
        int stationIncrease = numberCurrentRadioStation + 1;
        setNumberCurrentRadioStation(stationIncrease);
    }

    public void valueRadioStationDown() {
        int stationReduction = numberCurrentRadioStation - 1;
        setNumberCurrentRadioStation(stationReduction);
    }

    public int soundVolumeRadio;

    public int getSoundVolumeRadio() {
        return soundVolumeRadio;
    }

    public void maxSoundVolumeRadio() {
        soundVolumeRadio = 100;
    }

    public void minSoundVolumeRadio() {
        soundVolumeRadio = 0;
    }
    public void setSoundVolumeRadio(int newSoundVolumeRadio) {
        if (newSoundVolumeRadio > 100) {
            newSoundVolumeRadio = 100;
        }
        if (newSoundVolumeRadio < 0) {
            newSoundVolumeRadio = 0;
        }
        soundVolumeRadio = newSoundVolumeRadio;
    }
    public void increaseVolume() {
        if (soundVolumeRadio < 100) {
            soundVolumeRadio = soundVolumeRadio + 1;
        }
    }
    public void downVolume() {
        if (soundVolumeRadio > 0) {
            soundVolumeRadio = soundVolumeRadio - 1;
        }
    }
}

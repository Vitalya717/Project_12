package ru.netology.statistic;

public class Radio {


    private int maxNumberRadioStation = 9;

    private int minNumberRadioStation = 0;

    private int numberCurrentRadioStation = maxNumberRadioStation;

    private int maxSoundVolumeRadio = 100;

    private int minSoundVolumeRadio = 0;

    private int soundVolumeRadio;

    public Radio(int numberCurrentRadioStation) {

        this.numberCurrentRadioStation = numberCurrentRadioStation;
        this.maxNumberRadioStation = numberCurrentRadioStation;
    }

    public Radio() {
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public int getSoundVolumeRadio() {
        return soundVolumeRadio;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public int getMaxSoundVolumeRadio() {
        return maxSoundVolumeRadio;
    }

    public int getMinSoundVolumeRadio() {
        return minSoundVolumeRadio;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < minNumberRadioStation) {
            newNumberCurrentRadioStation = maxNumberRadioStation;
        }
        if (newNumberCurrentRadioStation > maxNumberRadioStation) {
            newNumberCurrentRadioStation = minNumberRadioStation;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void setSoundVolumeRadio(int newSoundVolumeRadio) {
        if (newSoundVolumeRadio > maxSoundVolumeRadio) {
            newSoundVolumeRadio = maxSoundVolumeRadio;
        }
        if (newSoundVolumeRadio < minSoundVolumeRadio) {
            newSoundVolumeRadio = minSoundVolumeRadio;
        }
        soundVolumeRadio = newSoundVolumeRadio;
    }

    public void valueRadioStationUp() {
        int stationIncrease = numberCurrentRadioStation + 1;
        setNumberCurrentRadioStation(stationIncrease);
    }

    public void valueRadioStationDown() {
        int stationReduction = numberCurrentRadioStation - 1;
        setNumberCurrentRadioStation(stationReduction);
    }

    public void increaseVolume() {
        if (soundVolumeRadio < maxSoundVolumeRadio) {
            soundVolumeRadio = soundVolumeRadio + 1;
        }
    }

    public void downVolume() {
        if (soundVolumeRadio > minSoundVolumeRadio) {
            soundVolumeRadio = soundVolumeRadio - 1;
        }
    }
}

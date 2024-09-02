package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Radio {

    private int maxNumberRadioStation = 9;

    private int minNumberRadioStation = 0;

    private int numberCurrentRadioStation = maxNumberRadioStation;

    private int maxSoundVolumeRadio = 100;

    private int minSoundVolumeRadio = 0;

    private int soundVolumeRadio;

    public Radio() {
    }

    public Radio(int numberCurrentRadioStation) {
        this.numberCurrentRadioStation = numberCurrentRadioStation;
        this.maxNumberRadioStation = numberCurrentRadioStation;
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
        if (soundVolumeRadio < this.maxSoundVolumeRadio) {
            this.soundVolumeRadio = soundVolumeRadio + 1;
        }
    }

    public void downVolume() {
        if (soundVolumeRadio > this.minSoundVolumeRadio) {
            this.soundVolumeRadio = soundVolumeRadio - 1;
        }
    }
}
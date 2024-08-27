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
}

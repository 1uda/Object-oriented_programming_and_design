package ru.netology;
public class Radio {

    private int numberRadioStation;
    private int volume;
    private int maxStation;


    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int stationCount) {
        this.maxStation = stationCount -1;
    }

    public void next() {
        if (numberRadioStation != maxStation) {
            numberRadioStation++;
        } else {
            numberRadioStation = 0;
        }
    }

    public void prev() {
        if (volume != 10) {
            volume++;
        } else {
            volume = 0;
        }

    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void setNumberRadioStation(int numberRadioStation) {
        if (numberRadioStation < 0) {
            return;
        }
        if (numberRadioStation > maxStation) {
            return;
        }
        this.numberRadioStation = numberRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }
}

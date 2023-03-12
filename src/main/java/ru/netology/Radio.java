package ru.netology;
public class Radio {

    private int numberRadioStation;
    private int volume;

    public void next() {
        if (numberRadioStation != 9) {
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
        if (numberRadioStation > 9) {
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

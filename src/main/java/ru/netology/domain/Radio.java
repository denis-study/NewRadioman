package ru.netology.domain;

public class Radio {

    private int currentVolume = 4;
    int maxVolume = 10;
    int minVolume = 0;
    private int currentRadioStation = 4;
    int maxRadioStation = 9;
    int minRadioStation = 0;


    public int changeTheStationByRemoteControl(int intendedStation) {
        if (intendedStation <= maxRadioStation && intendedStation >= minRadioStation) {
            currentRadioStation = intendedStation;
        }
        return currentRadioStation;
    }


    public void changeTheStationByNextButton() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation += 1;
        }
    }

    public void changeTheStationByPrevButton() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation -= 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume > maxVolume) {
            return;
        }
        if(currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if(currentRadioStation > maxRadioStation) {
            return;
        }
        if(currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }
}

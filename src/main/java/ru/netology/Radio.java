package ru.netology;

public class Radio {
    public int currentRadioStationNumber;
    public int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > 9) {
            newCurrentRadioStationNumber = 0;
        }

        if (newCurrentRadioStationNumber < 0) {
            newCurrentRadioStationNumber = 9;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxRadioStationNumber() {
        currentRadioStationNumber = 9;
    }

    public void setToMinRadioStationNumber() {
        currentRadioStationNumber = 0;
    }



    public void setToMinVolume() {
        currentVolume = 0;

    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume < 100) {
            currentVolume--;
        }
    }
    public void increaseRadioStationNumber() {
        if (currentRadioStationNumber < 100) {
            currentRadioStationNumber++;
        }
        }

    public void reduceRadioStationNumber() {
        if (currentRadioStationNumber < 100) {
            currentRadioStationNumber--;
        }
    }

}

package ru.netology.radio;

public class Radio {
    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStationNumber;
    private int currentVolume ;

    public Radio() {

    }

    public Radio(int numberOfStations) {
        this.maxStationNumber = numberOfStations - 1;

    }

    public int getCurrentStationNumber() {

        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > maxStationNumber) {
            return ;
        }

        if (currentStationNumber < minStationNumber) {
            return ;
        }
        this.currentStationNumber = currentStationNumber;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >  maxVolume ) {
         return;
        }

        if (currentVolume < minVolume) {
         return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxStationNumber) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void increaseStationNumber() {
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber++;
        } else {
            currentStationNumber = minStationNumber;
        }
    }


    public void decreaseStationNumber() {
        if (currentStationNumber > 0) {
            currentStationNumber--;

        } else {
            currentStationNumber = maxStationNumber;
        }
    }
}

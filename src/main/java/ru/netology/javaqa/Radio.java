package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int numberOfStations;


    public Radio() {


        this.numberOfStations = 10;
    }

    public Radio(int numberOfStations) {

        this.numberOfStations = numberOfStations;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setMaxVolume() {


        currentVolume = 100;
    }

    public void setMinVolume() {


        currentVolume = 0;
    }

    public int getCurrentVolume() {


        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100 || newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation >= numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentStation() {


        return currentStation;
    }

    public int getNumberOfStations() {

            return numberOfStations;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < numberOfStations) {
            currentStation = station;
        }
    }
}

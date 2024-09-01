package ru.netology.javaqa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentVolume;
    private int currentStation;
    private int numberOfStations = 10;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void nextStation() {
        if (currentStation >= numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < numberOfStations) {
            currentStation = station;
        }
    }
}

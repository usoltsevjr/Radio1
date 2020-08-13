package ru.netology.domain;

public class Radio {

    private int radiostationNumberMin = 0;
    private int radiostationNumberMax = 9;
    private int currentRadiostationNumber;
    private int volumeMax = 10;
    private int volumeMin = 0;
    private int currentVolume;

    public void nextRadiostation() {
        if (currentRadiostationNumber >= radiostationNumberMin & currentRadiostationNumber < radiostationNumberMax) {
            this.currentRadiostationNumber = currentRadiostationNumber + 1;
        }

        if (currentRadiostationNumber == radiostationNumberMax | currentRadiostationNumber < radiostationNumberMin) {
            this.currentRadiostationNumber = radiostationNumberMin;
        }

        if (currentRadiostationNumber > radiostationNumberMax) {
            this.currentRadiostationNumber = radiostationNumberMax;
        }

    }

    public void prevRadiostation() {
        if (currentRadiostationNumber > radiostationNumberMin & currentRadiostationNumber <= radiostationNumberMax) {
            this.currentRadiostationNumber = currentRadiostationNumber - 1;
        }

        if (currentRadiostationNumber == radiostationNumberMin | currentRadiostationNumber > radiostationNumberMax) {
            this.currentRadiostationNumber = radiostationNumberMax;
        }

        if (currentRadiostationNumber < radiostationNumberMin) {
            this.currentRadiostationNumber = radiostationNumberMin;
        }

    }


    public void volumeUp() {
        if (currentVolume >= volumeMin & currentVolume < volumeMax) {
            this.currentVolume = currentVolume + 1;
        }

        if (currentVolume >= volumeMax) {
            this.currentVolume = volumeMax;
        }

        if (currentVolume < volumeMin) {
            this.currentVolume = volumeMin;
        }

    }

    public void volumeDown() {
        if (currentVolume > volumeMin & currentVolume <= volumeMax) {
            this.currentVolume = currentVolume - 1;
        }

        if (currentVolume <= volumeMin) {
            this.currentVolume = volumeMin;
        }

        if (currentVolume > volumeMax) {
            this.currentVolume = volumeMax;
        }

    }

    public int getCurrentRadiostationNumber() {
        return currentRadiostationNumber;
    }

    public void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        this.currentRadiostationNumber = currentRadiostationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}

package ru.netology.domain;

public class Radio {

    private int radiostationNumberMin = 0;
    private int radiostationNumberMax;
    private int currentRadiostationNumber;
    private int volumeMax = 100;
    private int volumeMin = 0;
    private int currentVolume;
    private boolean on;

    public Radio(int radiostationNumberMax, int currentRadiostationNumber, int currentVolume, boolean on) {
        this.radiostationNumberMax = radiostationNumberMax;
        this.currentRadiostationNumber = currentRadiostationNumber;
        this.currentVolume = currentVolume;
        this.on = on;
    }

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


    public int getRadiostationNumberMax() {
        return radiostationNumberMax;
    }

    public void setRadiostationNumberMax(int radiostationNumberMax) {
        this.radiostationNumberMax = radiostationNumberMax;
    }

    public int getCurrentRadiostationNumber() {
        return currentRadiostationNumber;
    }

    public void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        this.currentRadiostationNumber = currentRadiostationNumber;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}

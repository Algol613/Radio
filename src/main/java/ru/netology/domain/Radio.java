package ru.netology.domain;

public class Radio {
    private String name;
    private int minStation;
    private int maxStation;
    private int currentVolume;
    private int currentStation;
    private int minVolume;
    private int maxVolume;
    private boolean on;
    private int countStation;


    public Radio() {
        this.maxStation = countStation - 1;
    }

    //включение или отключение radio
    public void setOn(boolean on) {
        this.on = on;
    }

    //максимальная устанавливаемая громкость
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    //минимальная устанавливаемая громкость
    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    //максимальная устанавливаемая станция
    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    //минимальная устанавливаемая станция
    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    //установка рабочей станции
    public void setCurrentStation() {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    //установка следующей станции
    public void setNextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        }
        this.currentStation = currentStation + 1;
    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        }
        this.currentStation = currentStation - 1;

    }

    //установка звука
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //установка звука
    public void setIncreaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void setDecreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public Radio(int minStation, int maxStation, int minVolume, int maxVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

}
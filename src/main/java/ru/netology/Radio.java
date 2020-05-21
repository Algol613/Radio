package ru.netology;

public class Radio {
    private String name;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private boolean on;

    //set perametrs
    public void setName(String name) {
        this.name = name;
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
    public void setCurrentStation(int currentStation) {
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
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
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

}
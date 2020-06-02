package ru.netology.domain;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
=======
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
>>>>>>> a76c20234ef97a8e26a01e49f201d211c98f85f5

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

    public Radio(int i, int i1, int i2, int i3) {

<<<<<<< HEAD
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

=======
    public Radio(String name, int minStation, int maxStation, int currentVolume, int currentStation, int minVolume, int maxVolume, boolean on, int countStation) {
        this.name = name;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
        this.currentStation = currentStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.on = on;
        this.countStation = countStation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

>>>>>>> a76c20234ef97a8e26a01e49f201d211c98f85f5
    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getCountStation() {
        return countStation;
    }

    public void setCountStation(int countStation) {
        this.countStation = countStation;
    }
<<<<<<< HEAD

    public void setNextStation() {
    }
=======
>>>>>>> a76c20234ef97a8e26a01e49f201d211c98f85f5
}
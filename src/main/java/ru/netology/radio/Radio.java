package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int soundVolume;

    private int amountRadioStation;

    public Radio() {

    }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;

    }


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getSoundVolume() {

        return soundVolume;
    }

    // Ограничения звука по минимуму и максимуму:
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }

        soundVolume = newSoundVolume;
    }

    // Увеличение звука на 1:
    public void IncreaseSoundVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }

    }

    // Уменьшение звука на 1:
    public void decreaseSoundVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }

    }

    // Ограничения радиостанций по минимуму и максимуму:
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    // Переключение радиостанций кнопкой "слудующая":
    public int nextRadioStation() {
        if (currentRadioStation < 9) {
            return currentRadioStation = currentRadioStation + 1;

        } else {
            return currentRadioStation = 0;

        }

    }

    // Переключение радиостанций кнопкой "предыдущая":
    public int prevRadioStation() {
        if (currentRadioStation > 0) {
            return currentRadioStation = currentRadioStation - 1;

        } else {
            return currentRadioStation = 9;
        }

    }

    // Ограничения радиостанций по минимуму и максимуму:
    public void setCurrentRadioStationDesiredAmount(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > amountRadioStation - 1) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    // Переключение радиостанций кнопкой "слудующая":
    public void nextRadioStationDesiredAmount() {
        if (currentRadioStation < amountRadioStation - 1) {
            currentRadioStation = currentRadioStation + 1;

        } else {
            currentRadioStation = 0;

        }

    }

    // Переключение радиостанций кнопкой "предыдущая":
    public void prevRadioStationDesiredAmount() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;

        } else {
            currentRadioStation = amountRadioStation - 1;
        }

    }
}
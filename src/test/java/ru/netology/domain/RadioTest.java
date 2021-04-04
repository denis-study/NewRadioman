package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldChangeTheStationByRemoteControl() {
        assertEquals(8, radio.changeTheStationByRemoteControl(8));
    }

    @Test
    void shouldChangeTheStationByButtonNextIfQuantityIsChanged() {
        Radio radio = new Radio(15, 15);
        radio.changeTheStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByButtonNext() {
        radio.changeTheStationByNextButton();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByNextButtonIfQuantityIsChanged() {
        Radio radio = new Radio(15, 15);
        radio.changeTheStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByButtonPrev() {
        radio.changeTheStationByPrevButton();
        assertEquals(3, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButtonIfQuantityIsChanged() {
        Radio radio = new Radio(0, 15);
        radio.changeTheStationByPrevButton();
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolumeUnderMax() {
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio(100, 100, 0);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeIfMin() {
        Radio radio = new Radio(0, 100, 0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
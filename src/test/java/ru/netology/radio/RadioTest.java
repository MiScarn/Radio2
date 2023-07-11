package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void shouldMaxStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);        // Максимальный номер станции

        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);  //Минимальный номер станции

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAfterMaxStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);  // Больше максимального номера станции

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeforeMinStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);    // Меньше минимального номера станции

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(4);
        radio.increaseStationNumber();   // Повышает номер станции

        int expected = 5;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(6);
        radio.decreaseStationNumber();  // Понижает номер станции

        int expected = 5;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.increaseStationNumber();     // Повышает макс номер станции

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.decreaseStationNumber();  // Понижает минимальный номер станции

        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBorderRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);   // Граничные значения станции

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNumberBorderNegativeRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);  // нег. граничные значения

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNumberBorderRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(1);   //нижнее граничное значение

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNumberBorderNegativeRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);  //негативное нижнее значение

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();     //максимальное значение громкости

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);      //минимальное значение громкости
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);    //понижает громкость
        radio.increaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);  //повышает громкость
        radio.decreaseVolume();

        int expected = 29;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();    //повышает до макс значения

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();      //понижает до мин значение

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseBelowMinVolume() {
        Radio radio= new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();          //понижает ниже мин. значения

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseAboveMaxVolume() {
        Radio radio= new Radio();
        radio.setCurrentVolume(110);           //повышает выше макс. значения


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseMaxVolume1() {
        Radio radio= new Radio();
        radio.setCurrentVolume(99);           //повышает выше макс. значения
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume2() {
        Radio radio= new Radio();
        radio.setCurrentVolume(1);//повышает выше макс. значения
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNumberBorderVolume() {               //граничные значения громкости 9
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNumberBorderNegativeVolume() {            // граничные значения громкости 11
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNumberBorderVolume1() {               //граничные значения громкости 1
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNumberBorderNegativeVolume1() {            // граничные значения громкости -1
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newNumberRadioStation() {                 // новое радио с новыми условиями, текущая 15
        Radio radio = new Radio(20);

        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void newBorderNumberRadioStation() {           // новое радио с новыми условиями, текущая 19
        Radio radio = new Radio(20);


        radio.setCurrentStationNumber(19);

        int expected = 19;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newBorderNegativeNumberRadioStation() {         // новое радио с новыми условиями, текущая 21
        Radio radio = new Radio(20);


        radio.setCurrentStationNumber(21);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

}

package com.Rachma.LatihanModul1; //package

public class KonversiSuhu { //class

    //Celcius ke Fahrenheit
    public float CF(float suhu) {
        float total = (suhu * 9 / 5) + 32;
        return total;
    }

    //Fahrenheit ke Kelvin
    public float FK(float suhu) {
        float total = (suhu - 32) * 5 / 9 + 273;
        return total;
    }

    //Kelvin ke Reamur
    public float KR(float suhu) {
        float total = (suhu - 273) * 4 / 5;
        return total;
    }

    //Reamur ke Celcius
    public float RC(float suhu) {
        float total = suhu * 5 / 4;
        return total;
    }
}

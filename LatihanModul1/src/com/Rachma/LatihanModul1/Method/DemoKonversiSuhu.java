package com.Rachma.LatihanModul1.Method; //package

import com.Rachma.LatihanModul1.KonversiSuhu; //library

import java.util.Scanner; //library

public class DemoKonversiSuhu { //class
    public static void main(String[] args) { //method
        Scanner scanner = new Scanner(System.in);

        KonversiSuhu konversiSuhu = new KonversiSuhu();

        //Input suhu Celcius
        System.out.print("Celcius\t\t\t\t\t: ");
        float suhu = scanner.nextFloat();

        //Mencetak suhu Celcius ke Fahrenheit
        float suhu1 = konversiSuhu.CF(suhu);
        System.out.println("Celcius ke Fahrenheit\t: " + suhu1);

        //Mencetak Fahrenheit ke Kelvin
        float suhu2 = konversiSuhu.FK(suhu);
        System.out.println("Fahrenheit ke Kelvin\t: " + suhu2);

        //Mencetak Kelvin ke Reamur
        float suhu3 = konversiSuhu.KR(suhu);
        System.out.println("Kelvin ke Reamur\t\t: " + suhu3);

        //Mencetak Reamur ke Celcius
        float suhu4 = konversiSuhu.RC(suhu);
        System.out.println("Reamur ke Celcius\t\t: " + suhu4);
    }
}

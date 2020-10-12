package com.Rachma.LatihanModul1.Class; //package

public class Karyawan { //class
    private static String nama = "Siti Ropeah";
    private static String jenisKel = "Perempuan";
    private static String TTL = "Purwokerto, 29 Februari 2020";
    private static String alamat = "Purwokerto";
    private static String agama = "Islam";
    private static String kewarganegaraan = "Indonesia";
    private static String noHp = "012345678910";

    public static void main(String[] args) { //method
        System.out.println();
        System.out.println("\t\t\t\t\tBIODATA KARYAWAN");
        System.out.println();
        System.out.println("Nama Lengkap\t\t\t: " + nama);
        System.out.println("Jenis Kelamin\t\t\t: " + jenisKel);
        System.out.println("Tempat Tanggal Lahir\t: " + TTL);
        System.out.println("Alamat\t\t\t\t\t: " + alamat);
        System.out.println("Agama\t\t\t\t\t: " + agama);
        System.out.println("Kewarganegaraan\t\t\t: " + kewarganegaraan);
        System.out.println("Nomor HP\t\t\t\t: " + noHp);
    }
}

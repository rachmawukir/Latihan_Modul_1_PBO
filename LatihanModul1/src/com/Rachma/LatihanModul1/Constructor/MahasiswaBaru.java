package com.Rachma.LatihanModul1.Constructor; //package

public class MahasiswaBaru { //class
    String nama, jeniskel, TTL, alamat, agama, kewarganegaraan, prodi, email, namaortu, asalSekolah, noHP;
    int nilai;

    public MahasiswaBaru(String nama, String jeniskel, String TTL, String alamat, String agama,
                         String kewarganegaraan, String prodi, String email, String namaortu,
                         String asalSekolah, String noHP, int nilai) {
        this.nama = nama;
        this.jeniskel = jeniskel;
        this.TTL = TTL;
        this.alamat = alamat;
        this.agama = agama;
        this.kewarganegaraan = kewarganegaraan;
        this.prodi = prodi;
        this.email = email;
        this.namaortu = namaortu;
        this.asalSekolah = asalSekolah;
        this.noHP = noHP;
        this.nilai = nilai;
    }
}

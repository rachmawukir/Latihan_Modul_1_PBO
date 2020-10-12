package com.Rachma.LatihanModul1.Constructor; //package

import java.util.Scanner; //library

public class DemoMahasiswaBaru { //class
    public static void main(String[] args) { //method
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("\t\t\t\t\tPENDAFTARAN MAHASISWA BARU ITTP");
        System.out.println();

        System.out.print("Nama Lengkap\t\t\t: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin\t\t\t: ");
        String jeniskel = scanner.nextLine();

        System.out.print("Tempat Tanggal Lahir\t: ");
        String TTL = scanner.nextLine();

        System.out.print("Alamat\t\t\t\t\t: ");
        String alamat = scanner.nextLine();

        System.out.print("Agama\t\t\t\t\t: ");
        String agama = scanner.nextLine();

        System.out.print("Kewarganegaraan\t\t\t: ");
        String kewarganegaraan = scanner.nextLine();

        System.out.println("Program Studi : ");
        System.out.println("Fakultas Informatika : ");
        System.out.println("S1 Software Engineering");
        System.out.println("S1 Teknik Informatika");
        System.out.println("S1 Sistem Informasi");
        System.out.println("S1 Sains Data");
        System.out.println();
        System.out.println("Fakultas Teknik Telekomunikasi Dan Elektro : ");
        System.out.println("S1 Teknik Telekomunikasi");
        System.out.println("S1 Teknik Elektro");
        System.out.println("S1 Biomedis");
        System.out.println("D3 Teknik Komunikasi");
        System.out.println();
        System.out.println("Fakultas Rekayasa Industri Dan Design : ");
        System.out.println("S1 Design Komunikasi Visual");
        System.out.println("S1 Teknik Industri");
        System.out.println("S1 Sistem Informasi");
        System.out.println();
        System.out.print("Program Studi\t\t\t: ");
        String prodi = scanner.nextLine();

        System.out.print("Email\t\t\t\t\t: ");
        String email = scanner.nextLine();

        System.out.print("Nama Orang Tua\t\t\t: ");
        String namaortu = scanner.nextLine();

        System.out.print("Asal Sekolah\t\t\t: ");
        String asalSekolah = scanner.nextLine();

        System.out.print("Nomor HP\t\t\t\t: ");
        String noHP = scanner.nextLine();

        System.out.print("Nilai\t\t\t\t\t: ");
        int nilai = scanner.nextInt();
        System.out.println();
        System.out.println();

        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru(nama, jeniskel, TTL, alamat, agama, kewarganegaraan, prodi, email, namaortu, asalSekolah, noHP, nilai);
        System.out.println("\t\t\t\t\tDATA MAHASISWA BARU ITTP");
        System.out.println();
        System.out.println("Nama Lengkap\t\t\t: " + mahasiswaBaru.nama);
        System.out.println("Jenis Kelamin\t\t\t: " + mahasiswaBaru.jeniskel);
        System.out.println("Tempat Tanggal Lahir\t: " + mahasiswaBaru.TTL);
        System.out.println("Alamat\t\t\t\t\t: " + mahasiswaBaru.alamat);
        System.out.println("Agama\t\t\t\t\t: " + mahasiswaBaru.agama);
        System.out.println("Kewarganegaraan\t\t\t: " + mahasiswaBaru.kewarganegaraan);
        System.out.println("Program Studi\t\t\t: " + mahasiswaBaru.prodi);
        System.out.println("Email\t\t\t\t\t: " + mahasiswaBaru.email);
        System.out.println("Nama Oang Tua\t\t\t: " + mahasiswaBaru.namaortu);
        System.out.println("Asal Sekolah\t\t\t: " + mahasiswaBaru.asalSekolah);
        System.out.println("Nomor HP\t\t\t\t: " + mahasiswaBaru.noHP);
        System.out.println("Nilai\t\t\t\t\t: " + mahasiswaBaru.nilai);

    }
}

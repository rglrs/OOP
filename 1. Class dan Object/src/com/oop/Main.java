package com.oop;

//class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception{

        //instansiasi / membuat object
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Ragil";
        mhs1.NIM = "3123500016";
        mhs1.jurusan = "Informatika";
        mhs1.IPK = 3.44;
        mhs1.umur = 20;

        System.out.println(mhs1.nama);
        System.out.println(mhs1.NIM);
        System.out.println(mhs1.jurusan);
        System.out.println(mhs1.IPK);
        System.out.println(mhs1.umur);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Fina";
        mhs2.NIM = "3123500017";
        mhs2.jurusan = "Informatika";
        mhs2.IPK = 3.89;
        mhs2.umur = 19;

        System.out.println(mhs2.nama);
        System.out.println(mhs2.NIM);
        System.out.println(mhs2.jurusan);
        System.out.println(mhs2.IPK);
        System.out.println(mhs2.umur);
    }
}
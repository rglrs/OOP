package com.methods;

class Mahasiswa{
    //data member
    String nama;
    String NIM;

    //constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    //method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    //method dengan return dan parameter
    String sayHalo(String message){
        return message + " juga, nama ku adalah " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Ragil", "3123500016");
        //method
        mhs1.show();
        mhs1.setNama("Fina");
        mhs1.show();

        System.out.println(mhs1.getNama());
        System.out.println(mhs1.getNIM());

        String data = mhs1.sayHalo("Halo");
        System.out.println(data);
    }
}
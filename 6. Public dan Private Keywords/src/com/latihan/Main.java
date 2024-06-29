package com.latihan;

class dataDiri{
    String name; //default,dia akan bisa dibaca dan ditulis
    public int umur; //public,dia akan bisa dibaca dan ditulis
    private int gaji; //private,hanya akan bisa dibaca dan ditulis didalam class saja

    dataDiri(String name, int umur, int gaji){
        this.name=name;
        this.umur=umur;
        this.gaji=gaji;
    }

    //default modifier access
    void display(){
        tambahGaji(); //contoh mengakses private methods
        System.out.println("\nName\t: "+ this.name);
        System.out.println("umur\t: "+ this.umur);
        System.out.println("gaji\t: "+ this.gaji);
    }

    //public
    public void ubahNama(String namaBaru){
        this.name=namaBaru;
    }

    //private
    private void tambahGaji(){
        this.gaji += 1200;
    }
}

public class Main {
    public static void main(String[] args) {
        dataDiri data1 = new dataDiri("Ragil",20,10000);

        //default
        System.out.println(data1.name);//membaca data
        //ganti nama
        data1.name = "Fina";//menulis data
        System.out.println(data1.name);//membaca data

        //public
        System.out.println(data1.umur);//membaca data
        data1.umur = 30;//menulis data
        System.out.println(data1.umur);//membaca data

        //private (tidak dapat diakses dari luar)
        //System.out.println(data1.gaji);//membaca data
        //data1.gaji = 20000;//menulis data
        //System.out.println(data1.gaji);//membaca data

        //methods

        //default
        data1.display();

        //public
        data1.ubahNama("Ridho");
        data1.display();

        //private (tidak dapat diakses dari luar
        //data1.tambahGaji();
    }
}
package com.constructor;

//class tanpa cunstructor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

//class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    //constructor dipanggil saat object pertama kali dibuat
    //Mahasiswa(){
        //System.out.println("Ini constructor");
    //}

    //constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) throws Exception{

        Mahasiswa mahasiswa1 = new Mahasiswa("Ragil","3123500016","Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Fina","3123500017","Teknik Informatika");


        //Polos objectPolos = new Polos();
        //objectPolos.dataString = "polosan";
        //objectPolos.dataInteger = 10;

        //System.out.println(objectPolos.dataString);
        //System.out.println(objectPolos.dataInteger);
    }
}
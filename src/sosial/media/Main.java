/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosial.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author yuga
 */
public class Main {
    public static void main(String[] args) {
                
        HashMap<String, ArrayList<Data>> daftar = new HashMap<String, ArrayList<Data>>();
        ArrayList<Data> people = new ArrayList<Data>();
        System.out.println("Daftar Akun Baru");
        System.out.print("Nama Lengkap\t: "); 
        String namaLengkap = new Scanner(System.in).nextLine();
        System.out.print("Jenis Kelamin\t: ");
        String jenisKelamin = new Scanner(System.in).nextLine();
        System.out.print("Jurusan\t\t: "); 
        String jurusan = new Scanner(System.in).nextLine();
        System.out.print("Tanggal Lahir(ex:23 Juli 1997): "); 
        String tanggalLahir = new Scanner(System.in).nextLine();
        System.out.print("Hobby\t\t: "); 
        String hobby = new Scanner(System.in).nextLine();
        people.add(new Data("Yoga Pamungkas","Laki-Laki","Teknik Informatika","12 Januari 1996","Main Gitar"));
        people.add(new Data("Muhamad Ridwan","Laki-Laki","Akuntasni","25 Juni 1997","Membaca"));
        people.add(new Data("Galus Panji","Laki-Laki","Sosiologi","1 Agustus 1998","Basket"));
        people.add(new Data("Hilman","Laki-Laki","Teknik Industri","15 Juli 1997","Karate"));
        people.add(new Data("Khoerunisa","Perempuan","Ilmu Pemerintahan","5 Maret1998","Shopping"));
        people.add(new Data("Alfian","Laki-Laki","Akuntansi","1 Mei 1997","Main Game"));
        people.add(new Data(namaLengkap, jenisKelamin, jurusan, tanggalLahir, hobby));

        ArrayList<Data> pilihOrang = new ArrayList<Data>();
        char pilih='y';
        int i=1;
        int pilihIndeks=1;
        while (pilih == 'y'){
            System.out.println("\n===========Daftar Semua User============");
            for (Data b:people
                    ) {
                System.out.println(i+" "+b.getNamaLengkap());
                i++;
            }
        
}
    }}
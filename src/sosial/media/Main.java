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
}
}

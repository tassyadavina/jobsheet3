/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class sekolah {
    String nmSekolah;
    String nmGuru="";
    
    void cetakSekolah(String namaSekolah){
      nmSekolah=namaSekolah;
      System.out.println("Nama Sekolah : " + nmSekolah);
    }
    
    void cetakGuru(String namaGuru){
        nmGuru=namaGuru;
        System.out.println("Nama Guru : " + nmGuru);
    }
}

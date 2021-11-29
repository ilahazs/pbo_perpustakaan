/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.perpustakaan;

public class Main {
   public static void main(String[] args) {
      Siswa siswa1 = new Siswa("Ilahazs", "XII", "RPL", "1920118111");
      Siswa siswa2 = new Siswa("DIO", "XII", "TKJ", "1920118100");
      // new KeAnggotaan(siswa1);
      siswa1.daftarAnggota(new Keanggotaan(siswa1));
      siswa2.daftarAnggota(new Keanggotaan(siswa2));
      System.out.println(siswa1.anggota.id_anggota);
      System.out.println(siswa2.anggota.id_anggota);

      // EKSEKUSI BUKU
      // Buku buku1 = new Buku("Ksatria Batman", "Diluc", 25, 10);
      // buku1.show();
      // siswa1.anggota.pinjamBuku(buku1);

   }
}
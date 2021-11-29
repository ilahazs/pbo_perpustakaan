package com.pbo.perpustakaan;

import com.pbo.perpustakaan.*;

public class Siswa {
   private String nama, kelas, jurusan, NIS;
   private int usia;
   // boolean status = false;
   Keanggotaan anggota;

   Siswa(String nama, String kelas, String jurusan, String NIS) {
      this.nama = nama;
      this.kelas = kelas;
      this.jurusan = jurusan;
      this.NIS = NIS;
   }

   void profile() {
      // String statusAnggota = (this.status == true ? "terdaftar" : "blm terdaftar");
      System.out.println("\nPROFILE\n========================\n");
      System.out.printf("Nama       : %s\n", this.nama);
      System.out.printf("Kelas      : %s\n", this.kelas);
      System.out.printf("Jurusan    : %s\n", this.jurusan);
      System.out.printf("NIS        : %s\n", this.NIS);
      System.out.printf("Anggota    : %s\n", this.anggota.aktif());
      if (this.anggota.aktif() != false) {
         String statusPinjam = (this.anggota.pinjam() == true ? "Ya" : "Tidak");
         System.out.printf("Pinjam     : %s\n", statusPinjam);
      }
      System.out.println("\n========================");
   }

   void daftarAnggota(Keanggotaan anggota) {
      this.anggota = anggota;
      this.anggota.setKeaktifan(true);
   }

   String getNama() {
      return this.nama;
   }

   String getNIS() {
      return this.NIS;
   }

}

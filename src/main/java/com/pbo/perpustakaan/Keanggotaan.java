package com.pbo.perpustakaan;

import com.pbo.perpustakaan.Siswa;

public class Keanggotaan {
   static int id_anggota = 0;
   private boolean pinjam = false;
   private String nama, NIS;
   private boolean keaktifkan = false;
   // AtomicInteger count = new AtomicInteger(0);

   Keanggotaan(Siswa siswa) {
      this.nama = siswa.getNama();
      this.NIS = siswa.getNIS();
      this.keaktifkan = true;
      this.id_anggota = 1;
   }

   boolean aktif() {
      return this.keaktifkan;
   }

   void setKeaktifan(Boolean value) {
      this.keaktifkan = value;
   }

   boolean pinjam() {
      return this.pinjam;
   }

   void pinjamBuku(Buku buku) {
      buku.kurangStock(1);
      buku.setStock("kurang", 1);
      System.out.printf("\n========================\n %s meminjam buku \n========================\n", this.nama);
      this.pinjam = true;
   }

   void kembalikanBuku(Buku buku) {
      buku.setStock("tambah", 1);
      // if buku.stock
      System.out.printf("\n==============================\n %s mengembalikan buku \n==============================\n",
            this.nama);
      this.pinjam = false;
   }
}

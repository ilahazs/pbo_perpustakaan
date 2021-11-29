package com.pbo.perpustakaan;

public class Buku {
   private String judul, penulis;
   private int jumlah_halaman, stock;

   Buku(String judul, String penulis, int jumlah_halaman, int stock) {
      this.judul = judul;
      this.penulis = penulis;
      this.jumlah_halaman = jumlah_halaman;
      this.stock = stock;
   }

   void show() {
      // String statusAnggota = (this.status == true ? "terdaftar" : "blm terdaftar");
      System.out.println("\nDETAIL BUKU\n========================\n");
      System.out.printf("Judul    : %s\n", this.judul);
      System.out.printf("Penulis  : %s\n", this.penulis);
      System.out.printf("Hal      : %s\n", this.jumlah_halaman + " hal");
      System.out.printf("Stock    : %s\n", this.stock + " item");
      System.out.println("\n========================");
   }

   int getStock() {
      return this.stock;
   }

   void kurangStock(int proses) {
      this.stock -= proses;
   }

   void tambahStock(int proses) {
      this.stock += proses;
   }

   void setStock(String kondisi, int value) {
      this.stock = (kondisi == "tambah" ? this.stock + value : this.stock - value);
   }
}

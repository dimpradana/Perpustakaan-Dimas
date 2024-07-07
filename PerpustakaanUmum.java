
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dimasperpustakaan;

/**
 *
 * @author USER
 */
public class PerpustakaanUmum implements Perpustakaan {
    private String[] daftarBuku = {"Buku A", "Buku B", "Buku C"};

    @Override
    public void pinjamBuku(String judulBuku) {
        System.out.println("Meminjam buku: " + judulBuku);
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println("Mengembalikan buku: " + judulBuku);
    }

    @Override
    public void lihatDaftarBuku() {
        System.out.println("Daftar buku di perpustakaan:");
    for (String buku : daftarBuku) {
        System.out.println("- " + buku);
    }
}
    }
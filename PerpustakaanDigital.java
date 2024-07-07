/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dimasperpustakaan;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USER
 */
public class PerpustakaanDigital implements Perpustakaan {
    private final HashMap<String, Boolean> daftarBuku;

    public PerpustakaanDigital() {
        this.daftarBuku = new HashMap<>();
        this.daftarBuku.put("Buku A", true);
        this.daftarBuku.put("Buku B", true);
        this.daftarBuku.put("Buku C", true);
    }

    @Override
    public void pinjamBuku(String judulBuku) {
        if (this.daftarBuku.get(judulBuku)) {
        this.daftarBuku.put(judulBuku, false);
        System.out.println("Meminjam buku: " + judulBuku);

        } else {
            System.out.println("Buku " + judulBuku + " sedang dipinjam.");
        }
    }
    @Override
    public void kembalikanBuku(String judulBuku) {
    if (!this.daftarBuku.get(judulBuku)) {
        this.daftarBuku.put(judulBuku, true);
        System.out.println("Mengembalikan buku: " + judulBuku);
    } else {
        System.out.println("Buku " + judulBuku + " sudah dikembalikan.");
    }
    }

    @Override
    public void lihatDaftarBuku() {
        System.out.println("Daftar buku di perpustakaan digital:");
        this.daftarBuku.entrySet().forEach((entry) -> {
            String buku = entry.getKey();
            boolean tersedia = entry.getValue();
            System.out.println("- " + buku + " (Tersedia: " + tersedia + ")");
        });
    }
}
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
public interface Perpustakaan {
    void pinjamBuku(String judulBuku);
    void kembalikanBuku(String judulBuku);
    void lihatDaftarBuku();
}
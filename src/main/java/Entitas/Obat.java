/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitas;

/**
 *
 * @author Lenovo
 */
final public class Obat {
     private final String nama;
    private final int harga;
    private int stok;

    public Obat(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    final public String getNama() {
        return nama;
    }
    
    final public void setNama(int nama) {
        this.stok = stok;
    }

    final public int getHarga() {
        return harga;
    }

    final public int getStok() {
        return stok;
    }

    final public void setStok(int stok) {
        this.stok = stok;
    }
}


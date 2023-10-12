/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apotek;

import Entitas.Obat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
final public class ApotekMain {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Obat> daftarObat = new ArrayList<>();
     

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Selamat datang di sistem manajemen apotek!");
            System.out.println("1. Tambah Obat");
            System.out.println("2. Lihat Daftar Obat");
            System.out.println("3. Edit Obat");
            System.out.println("4. Hapus Obat");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character di buffer

            switch (choice) {
                case 1:
                    System.out.println("Masukkan data obat ke dalam apotek:");
                    System.out.print("Nama Obat: ");
                    String namaObat = scanner.nextLine();
                    System.out.print("Harga Obat: ");
                    int hargaObat = scanner.nextInt();
                    System.out.print("Stok Obat: ");
                    int stokObat = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline character di buffer

                    Obat obat = new Obat(namaObat, hargaObat, stokObat);
                    daftarObat.add(obat);
                    System.out.println("Obat berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\nDaftar Obat di Apotek:");
                    for (Obat o : daftarObat) {
                        System.out.println("Nama Obat: " + o.getNama());
                        System.out.println("Harga Obat: " + o.getHarga());
                        System.out.println("Stok Obat: " + o.getStok());
                        System.out.println("-----");
                    }
                    break;


                case 3:
                    System.out.print("Masukkan nama obat yang ingin diubah stoknya : ");
                    String obatToBeUpdated = scanner.nextLine();
                    boolean obatFound = false;
                    for (Obat o : daftarObat) {
                        if (o.getNama().equalsIgnoreCase(obatToBeUpdated)) {

                            System.out.print("Stok Obat Baru: ");
                            int newStokObat = scanner.nextInt();
                            scanner.nextLine(); // Membersihkan newline character di buffer
                            
                            o.setStok(newStokObat);
                            obatFound = true;
                            System.out.println("Obat berhasil diubah.");
                            break;
                        }
                    }
                    if (!obatFound) {
                        System.out.println("Obat tidak ditemukan.");
                    }
                    break;


                case 4:
                    System.out.print("Masukkan nama obat yang ingin dihapus: ");
                    String obatToBeDeleted = scanner.nextLine();
                    Iterator<Obat> obatIterator = daftarObat.iterator();
                    while (obatIterator.hasNext()) {
                        Obat currentObat = obatIterator.next();
                        if (currentObat.getNama().equalsIgnoreCase(obatToBeDeleted)) {
                            obatIterator.remove();
                            System.out.println("Obat berhasil dihapus.");
                            break;
                        }
                    }
                    break;


                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih! Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu lain.");
            }
        }

        scanner.close();
    }
}

# apotek_posttest2-PBO
## OUTPUT PROGRAM
Pada Output program ini diminta untuk menjalankan program Apotek dengan tampilan awal selamat datang di sistem manajemen apotek!
dengan dilengkapai oleh menu CRUD dan Keluar. Setelah itu user dapat memilih Tambah Obat, Lihat Daftar Obat, Edit Obat, Hapus Obat dan Kembali.
Jika menu pertama yang dipilih adalah (tambah obat), maka user diminta untuk memasukan nama obat untuk menyimpan diprogram misalnya saja untuk nama obat Paracetamol, Harga Obat 10000, Stok Obat 200, Jika sudah selesai maka program akan menampilkan Obat berhasil ditambahkan!
Jika menu kedua yang dipilih adalah (Lihat daftar obat), maka program akan menampilkan data obat yang sudah ada didalam program seperti nama obat, harga obat dan stok obat.
Jika menu ketiga yang dipilih adalah (edit obat),untuk mengubah stok obat yang lama menjadi stok obat yang baru, maka program akan menampilkan masukan nama obat yang ingin diubah stoknya dan user memasukan nama obat yang ingin diubah stoknya dan memasukan stok obat yang baru.
Jika menu keempat yang dipilih adalah (hapus obat), maka program akan menampilkan masukan nama obat yang ingin dihapus dan user memasukan nama obat jika sudah maka program akan menampilkan obat berhasil dihapus.
Jika menu kelima yang dipilih adalah (keluar) maka program akan kembali ke menu tampilan awal.

## Metode yang digunakan pada program
Pada metode untuk program ini menggunakan 
import Entitas.Obat digunakan untuk mengimpor kelas Obat dari paket Entitas. Kelas Obat ini mungkin berisi atribut dan metode untuk menyimpan obat dalam program.
import java.util.ArrayList digunakan untuk membuat dan mengelola daftar dinamis dari objek. Dalam program ini, digunakan untuk menyimpan daftar obat yang ada di apotek.
import java.util.Iterator igunakan untuk melakukan iterasi (perulangan) melalui elemen-elemen dalam koleksi seperti ArrayList. Dalam program ini, digunakan untuk mengiterasi dan menghapus obat dari daftar obat.
import java.util.List digunakan untuk merepresentasikan koleksi berurutan dari elemen-elemen. Dalam program ini, digunakan untuk mendefinisikan variabel daftarObatsebagai daftar obat dalam apotek.
import java.util.Scanner digunakan untuk membaca input dari pengguna melalui konsol. Dalam program ini, digunakan untuk menerima input dari pengguna saat mereka memilih berbagai menu dan juga untuk membersihkan karakter baris baru.

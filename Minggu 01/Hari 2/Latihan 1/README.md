# *CRC Card*

*Class Responsibility Collaborator (CRC) Card* merupakan kumpulan kartu indeks standar yang telah dibagi menjadi tiga bagian yaitu *class*, *responsibilities*, dan *collaborator*. Sebelum membuat kartu CRC kita sudah harus tahu terlebih dahulu kelas apa saja yang ada dalam sistem yang kita buat, oleh karena itu kita perlu membuat terlebih dahulu *Class Diagram* dari sistem yang kita analisis.

## Contoh dengan permodelan *CRC Card* untuk Sistem Booking Tiket Kereta Api

### 1. Class Name : Customer
### Resposibilities :
menentukan lokasi stasiun keberangkatan
menentukan lokasi stasiun tujuan
memasukan data identitas
melakukan reservasi kursi penumpang
melakukan konfirmasi pembayaran
mendapat barcode
### Collaborator :
Reservasi
KeretaApi

### 2. Class Name : Reservasi
### Responsibilities
Menampilkan pilihan stasiun
Menampilkan pilihan kelas kursi
Menampilkan menampilkan pilihan kereta
Menampilkan pilihan jadwal
### Collaborator
Customer
KeretaApi

### Class Name : Transaksi
### Responsibilities:
Membaca masukan ID reservasi
Menampilkan detail pesanan customer
Membaca masukan informasi kartu kredit customer
Menampilkan detail inormasi pembayaran pesanan customer
### Collaborator:
Reservasi
Customer

### Class Name : KeretaApi
### Responsibilities 
Menampilkan informasi jadwal kereta api
Menampilkan kuota kursi
Menampilkan


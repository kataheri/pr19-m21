# Pengujian Fitur Login
Proyek ini berfokus pada pengujian fitur login dari sebuah aplikasi. Pengujian dilakukan dengan berbagai skenario untuk memastikan bahwa sistem login berfungsi sebagaimana mestinya dalam berbagai kondisi.

## Tujuan
Proyek ini bertujuan untuk mendemonstrasikan kerangka kerja pengujian web untuk menguji fungsi login pada [aplikasi SauceDemo](https://www.saucedemo.com/).

## Teknologi
- **Cucumber** untuk pengembangan berbasis perilaku (Behavior-Driven Development/BDD).
- **Selenium** untuk otomatisasi berbasis browser.
- **JUnit** sebagai eksekutor pengujian.
- **Gradle** untuk membangun proyek.

## Fitur
- **Login Pengguna**: Memungkinkan pengguna untuk masuk ke dalam aplikasi menggunakan kredensial mereka.
- **Validasi**:
  - Login yang berhasil dengan kredensial yang valid.
  - Pesan kesalahan ditampilkan untuk kredensial yang tidak valid atau kosong.
  - Penanganan kasus tepi seperti nama pengguna yang terlalu panjang.

## Skenario Pengujian
Aplikasi telah diuji menggunakan skenario berikut:

### 1. Login Berhasil dengan Kredensial Valid
- **Diberikan**: Halaman login telah dibuka.
- **Ketika**: Saya memasukkan `<username>` dan `<password>`, lalu menekan tombol login.
- **Maka**: Saya akan diarahkan ke halaman inventori.

#### Contoh:
| Username       | Password       |
|----------------|----------------|
| standard_user  | secret_sauce   |

### 2. Login Gagal dengan Kredensial Tidak Valid
- **Diberikan**: Halaman login telah dibuka.
- **Ketika**: Saya memasukkan kredensial yang tidak valid (`invalid_user` dan `invalid_password`).
- **Maka**: Pesan kesalahan ditampilkan.

### 3. Login dengan Username dan Password Kosong
- **Diberikan**: Halaman login telah dibuka.
- **Ketika**: Saya mencoba login tanpa memasukkan username dan password.
- **Maka**: Saya akan melihat pesan kesalahan bahwa kredensial belum dimasukkan.

### 4. Login dengan Username yang Melebihi Panjang Maksimum
- **Diberikan**: Halaman login telah dibuka.
- **Ketika**: Saya memasukkan username yang terlalu panjang (`this_is_a_very_long_username_exceeding_limits`) dan password (`secret_sauce`).
- **Maka**: Saya akan melihat pesan kesalahan bahwa username tidak valid.

## Struktur Proyek
- **File Fitur**: Berisi deskripsi fitur dan skenario dalam sintaks Gherkin.
- **Test Case**: Implementasi otomatisasi pengujian untuk setiap skenario dalam file fitur.

## Prasyarat
- Pastikan framework pengujian (misalnya, Cucumber atau alat serupa) telah terinstal.
- Siapkan aplikasi yang akan diuji beserta semua dependensinya.

## Cara Menjalankan Pengujian
1. Kloning repositori ini ke komputer lokal Anda.
2. Instal semua dependensi yang dibutuhkan (jika ada).
3. Jalankan file fitur menggunakan alat pengujian yang sesuai:
   ```bash
   cucumber features/login.feature
   ```
4. Periksa hasil pengujian.

## Kontribusi
Kontribusi sangat dihargai! Ikuti langkah-langkah berikut untuk berkontribusi:

1. Fork repositori ini.
2. Buat branch baru (`fitur/fitur-baru`).
3. Commit perubahan Anda.
4. Push ke branch tersebut.
5. Buka Pull Request.  

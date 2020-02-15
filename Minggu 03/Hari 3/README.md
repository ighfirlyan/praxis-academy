# MICRONAUT

## Pengertian
Micronaut adalah sebuah Teknologi modern yang berjalan base on JVM (yaps, tentunya JAVA) dengan Full Stack Microservice Framework. Micronaut tidak menyediakan fitur MVC, jika anda ingin menggunakan fitur MVC atau anda yang familiar dengan MVC bisa menggunakan plugin yang telah disediakan misalnya GORM.

## Cara Install di Windows
1. Download file binary pada `https://micronaut.io/download.html` 
2. Unzip file tersebut lalu pindahkan ke `C:\Program Files` (opsional)
3. Konfigurasi environment pada windows. Buat variable baru bernama `JAVA_HOME` dengan valuable value adalah direktori java yang digunakan seperi `C:\Program Files\Java\jdk-12.0.2`. Selanjutnya buat variable baru bernama `MICRONAUT_HOME` dengn valuable value `C:\Program Files\micronaut-1.3.0`. Lalu pada path diedit dengan menambahkan variable `%JAVA_HOME%\bin` dan `%MICRONAUT_HOME%\bin`. 
4. Cek pada CMD: `$ mn --version`

## Membuat Projek Micronaut
1. buka CMD pada direktori `mn create-app example.micronaut.complete`
2. pada gradle.build tambahkan `annotationProcessor "io.micronaut:micronaut-graal"`

### Referensi :
- `https://guides.micronaut.io/creating-your-first-micronaut-app/guide/index.html`
- `https://medium.com/java-and-other-java-framework/mempelajari-microservices-micronaut-5cf45f9a97a8`
- `https://medium.com/codelabs-unikom/microservices-apaan-tuh-b9f5d56e8848`
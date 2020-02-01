# Hari 1

## Membuat *"Hello World"* dengan Bahasa Pemrograman Java
### 1. Membuat *source code* untuk *HelloWorld.java*
```
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
}
```

### 2. Membuat *source code* untuk *manifest.mf*

```
Manifest-version: 1.0
Main-Class: HelloWorld
```

### 3. *Compile class*
Untuk meng-*compile* main class, masukkan perintah di *command* seperti ini:
```
javac HelloWorld.java
```

### 4. Membuat berkas *JAR*

Untuk membuat paket *main class* sebagai berkas JAR, masukkan perintah di *command* seperti ini:
```
jar cvfe HelloWorld.jar HelloWorld HelloWorld.class
```

### 5. Menjalankan berkas *JAR*
Untuk menjalankan berkas *JAR* masukkan perintah di *command* seperti ini:
```
java -jar HelloWorld.jar
```

Sehingga akan tampil pesan ``` Hello World ```
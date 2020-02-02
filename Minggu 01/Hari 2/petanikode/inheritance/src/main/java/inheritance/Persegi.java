package inheritance;

public class Persegi extends BangunDatar{ //extends menyatakan bahwa ini adalah turunan dari BangunDatar
    float sisi;

    @Override //Method Overriding dilakukan saat kita ingin membuat ulang sebuah method pada sub-class atau class anak.
    float luas (){
        float luas = sisi*sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 4*sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
}
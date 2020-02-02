package inheritance;

public class Lingkaran extends BangunDatar{ //extends menyatakan bahwa ini adalah turunan dari BangunDatar

    //jari2 lingkaran
    float r;

    @Override //Method Overriding dilakukan saat kita ingin membuat ulang sebuah method pada sub-class atau class anak.
    float luas(){
        float luas = (float) (Math.PI*r*r);
        System.out.println("Luas lingkaran: " +luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = (float) (Math.PI*2*r);
        System.out.println("Keliling lingkaran: " +keliling);
        return keliling;
    }
}
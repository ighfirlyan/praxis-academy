package inheritance;

public class PersegiPanjang extends BangunDatar{ //extends menyatakan bahwa ini adalah turunan dari BangunDatar
    float panjang;
    float lebar;

    @Override //Method Overriding dilakukan saat kita ingin membuat ulang sebuah method pada sub-class atau class anak.
    float luas(){
        float luas = panjang*lebar;
        System.out.println("Luas persegi panjang: " +luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 2*panjang + 2*lebar;
        System.out.println("Keliling persegi panjang: " +keliling);
        return keliling;
    }
}
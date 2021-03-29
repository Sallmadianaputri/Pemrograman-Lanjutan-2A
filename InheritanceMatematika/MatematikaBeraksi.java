/*Nama: Sallma Diana Putri
  NIM : 11200930000012
  Hari/Tanggal : Senin, 29 Maret 2021
 */
package InheritanceMatematika;

public class MatematikaBeraksi {
    public static void main (String[] args){
        //inisialisasi Pemenggilan Method
        MatematikaCanggih yuk = new MatematikaCanggih();
        
        System.out.println("Pemanggilan Method Pertambahan");
        yuk.pertambahan(12.5, 28.7, 14.2);
        yuk.pertambahan(12, 28, 14);
        yuk.pertambahan(23, 24);
        yuk.pertambahan(3.4, 4.9);
        
        System.out.println("\nPemanggilan Method Pengurangan");
        yuk.pengurangan(12.5, 28.7, 14.2);
        yuk.pengurangan(12, 28, 14);
        yuk.pengurangan(23, 24);
        yuk.pengurangan(3.4, 4.9);
        
        System.out.println("\nPemanggilan Method Perkalian");
        yuk.perkalian(12.5, 28.7, 14.2);
        yuk.perkalian(12, 28, 14);
        yuk.perkalian(23, 24);
        yuk.perkalian(3.4, 4.9);
        
        System.out.println("\nPemanggilan Method Pembagian");
        yuk.pembagian(12.5, 28.7, 14.2);
        yuk.pembagian(12, 28, 14);
        yuk.pembagian(23, 24);
        yuk.pembagian(3.4, 4.9);
        
        System.out.println("\nPemanggilan Method Modulus");
        yuk.modulus(12.5, 28.7, 14.2);
        yuk.modulus(12, 28, 14);
        yuk.modulus(23, 24);
        yuk.modulus(3.4, 4.9);
    }
}

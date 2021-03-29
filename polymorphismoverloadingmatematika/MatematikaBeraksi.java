/*Nama: Sallma Diana Putri
  NIM : 11200930000012
  Hari/Tanggal : Senin, 29 Maret 2021.
 */
package polymorphismoverloadingmatematika;

public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika kuy = new Matematika();
        
        kuy.pertambahan(15,10);
        kuy.pengurangan(20,10);
        kuy.perkalian(7,3);
        kuy.pembagian(19,2);
        kuy.modulus(11,3);
        
        System.out.println("\nPemanggilan Method Class Matematika dengan 3 Parameter");
        kuy.pertambahan(12.5, 28.7, 14.2);
        kuy.pengurangan(12.5, 28.7, 14.2);
        kuy.perkalian(12.5, 28.7, 14.2);
        kuy.pembagian(12.5, 28.7, 14.2);
        kuy.modulus(12.5, 28.7, 14.2);
    }
}

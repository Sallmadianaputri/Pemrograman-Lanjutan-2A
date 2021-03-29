/*  Nama: Sallma Diana Putri
    NIM : 11200930000012
    Hari/Tanggal : Senin, 29 Maret 2021
 */
package InheritanceMatematika;

public class MatematikaCanggih extends Matematika {
    void modulus (int a, int b){
        proses = a % b;
        System.out.println("Hasil Modulus = "+ getproses());
    }
    void modulus(int a, int b, int c){
        proses = a % b % c;
        System.out.println("Hasil Modulus = "+ getproses());
    }
    void modulus(double a, double b){
        Nilai = a % b;
        System.out.println("Hasil Modulus = "+ getNilai());
    }
    void modulus(double a, double b, double c){
        Nilai = a % b % c;
        System.out.println("Hasil Modulus = "+ getNilai());
    }
}
    
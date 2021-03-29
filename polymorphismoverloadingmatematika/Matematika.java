/*Nama: Sallma Diana Putri
  NIM : 11200930000012
  Hari/Tanggal : Senin, 29 Maret 2021.
 */
package polymorphismoverloadingmatematika;

public class Matematika {
    int proses;
    double Nilai;
    
    //Method operasi Matematika
    void pertambahan(int a, int b){
        proses = a + b;
        System.out.println("Hasil Penjumlahan = "+ getproses());
    }
    void pengurangan (int a, int b){
        proses = a - b;
        System.out.println("Hasil Pengurangan ="+ getproses());
    }
    void perkalian (int a, int b){
        proses = a * b;
        System.out.println("Hasil Perkalian ="+ getproses());
    }
    void pembagian (int a, int b){
        proses = a / b;
        System.out.println("Hasil Pembagian ="+ getproses());
    }
    void modulus(int a, int b){
        proses = a % b;
        System.out.println("Hasil Modulus ="+ getproses());
    }
    int getproses(){
        return proses;
    }
     void pertambahan(double a, double b, double c){
        Nilai = a + b + c;
        System.out.println("Hasil Penjumlahan = "+ getNilai());
    }
    void pengurangan (double a, double b, double c){
        Nilai = a - b - c;
        System.out.println("Hasil Pengurangan ="+ getNilai());
    }
    void perkalian (double a, double b, double c){
        Nilai = a * b * c;
        System.out.println("Hasil Perkalian ="+ getNilai());
    }
    void pembagian (double a, double b, double c){
        Nilai = a / b / c;
        System.out.println("Hasil Pembagian ="+ getNilai());
    }
    void modulus(double a, double b, double c){
        Nilai = a % b % c; 
        System.out.println("Hasil Modulus ="+ getNilai());
    }
    double getNilai(){
        return Nilai;
}

}
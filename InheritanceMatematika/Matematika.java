/*  Nama : Sallma Diana Putri
    NIM : 11200930000012
    Hari/Tanggal : Senin, 29 Maret 2021
 */
package InheritanceMatematika;


public class Matematika {
    int proses;
    double Nilai;
    //method integer dengan 2 parameter
    void pertambahan (int a, int b){
        proses = a + b;
        System.out.println("Hasil Penjumlahan = "+ getproses());
    }
    void pengurangan (int a, int b){
        proses = a - b;
        System.out.println("Hasil Pengurangan ="+ getproses());
    }
    void perkalian (int a, int b){
        proses = a = b;
        System.out.println("Hasil Perkalian ="+ getproses());
    }
    
    //method integer Dengan 3 Parameter
    void pertambahan (int a, int b, int c){
        proses = a + b + c;
        System.out.println("Hasil Penjumlahan = "+ getproses());
    } 
    void pengurangan (int a, int b, int c){
        proses = a - b - c;
        System.out.println("Hasil Pengurangan = "+ getproses());
    }
    void perkalian (int a, int b, int c){
        proses = a * b * c;
        System.out.println("Hasil Perkalian = "+ getproses());
    }
    void pembagian (int a, int b, int c){
        proses = a / b / c;
        System.out.println("Hasil Pembagian = "+ getproses());
    }
    
    int getproses(){
        return proses;
    }
    
    //method double dengan 2 parameter
    void pertambahan (double a, double b){
        Nilai = a + b;
        System.out.println("Hasil Penjumlahan = "+ getNilai());
    }
    void pengurangan (double a, double b){
        Nilai = a - b;
        System.out.println("Hasil Pengurangan ="+ getNilai());
    }
    void perkalian (double a, double b){
        Nilai = a = b;
        System.out.println("Hasil Perkalian ="+ getNilai());
    }
    void pembagian (double a, double b){
        Nilai = a / b;
        System.out.println("Hasil Pembagian = "+ getNilai());
   
    }
    
    //method double Dengan 3 Parameter
    void pertambahan (double a, double b, double c){
        Nilai = a + b + c;
        System.out.println("Hasil Penjumlahan = "+ getNilai());
    } 
    void pengurangan (double a, double b, double c){
        Nilai = a - b - c;
        System.out.println("Hasil Pengurangan = "+ getNilai());
    }
    void perkalian (double a, double b, double c){
        Nilai = a * b * c;
        System.out.println("Hasil Perkalian = "+ getNilai());
    }
    void pembagian (double a, double b, double c){
        Nilai = a / b / c;
        System.out.println("Hasil Pembagian = "+ getNilai());
    }
    double getNilai(){
        return Nilai;
}
}
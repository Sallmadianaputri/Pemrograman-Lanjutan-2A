/*Nama: Sallma Diana Putri
  NIM : 11200930000012
  Hari/Tanggal : Senin, 29 Maret 2021
 */
package InheritanceMatematika;


public class MatematikaCanggihBangetBeraksi {
    public static void main (String[] args){
        Matematika getPlus = new Matematika();
        MatematikaCanggih getPlus1 = new MatematikaCanggih();
        MatematikaCanggihBanget getPlus2 = new MatematikaCanggihBanget();
        
        getPlus.pertambahan(20,5);
        getPlus.perkalian(6,10);
        getPlus1.modulus(7,2);
        getPlus2.pertambahantiga(7,3,2);
    }
}

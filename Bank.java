/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hp;

/**
 *
 * @author hp
 */
public class Bank {

    int saldo, simUang, ambilUang;
    public Bank (int saldo){
        this.saldo=saldo;
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo sat ini : Rp"+saldo);
}
    void simUang(int simUang){
        System.out.println("Simpan Uang: Rp"+simUang);
        System.out.println("Saldo saat ini : Rp"+ saldo);
    }
    void ambilUang(int simUang){
        System.out.println("Ambil Uang: Rp"+ambilUang);
        System.out.println("Saldo saat ini :"+saldo);
    }
}

package hp;
public class AksiHandphone {
    public static void main (String[] args){
        HandPhone handphonesallma = new HandPhone();
        handphonesallma.Nyalahkan = "Handphone Nyalah";
        handphonesallma.LakukanPanggilan = "Kring Kring Kring Panggilan Dilakukan";
        handphonesallma.KirimSms = "Dung Dung Dung SMS Berhasil Terkirim";
        handphonesallma.Matikan = "Handphone Mati";
System.out.println(handphonesallma.Nyalahkan);
System.out.println(handphonesallma.LakukanPanggilan);
System.out.println(handphonesallma.KirimSms);
System.out.println(handphonesallma.Matikan);
    }
    
}

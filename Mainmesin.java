package triyoladevi_111;

/**
 *
 * @author yola cantik
 */
public class Mainmesin {
    public static void main(String[] args) throws Exception {
        //buat object dari class mesin cuci(instansiasi)
        mesincuci punyaYola = new mesincuci("LG", "LG40", "SN:2256458895SA", "10 KG");
        mesincuci punyaTri = new mesincuci ("Sharp", "Megamouth Inverter Series MM 2.0", "ES-M8500XT-SA", "8.5 KG" );
        
        //set nilai property
        //punyaYola.Merk = "LG";
        //punyaYola.Model = "LG40";
        //punyaYola.Serial_Number = "SN:2256458895SA";
        //punyaYola.Kapasitas = "10 KG";
        
        //tampilkan property object mesincuci
        System.out.println(punyaYola.Merk);
        System.out.println(punyaYola.Model);
        System.out.println(punyaYola.Serial_Number);
        System.out.println(punyaYola.Kapasitas);
        System.out.println("\n---------------------------\n");
        System.out.println(punyaTri.Merk);
        System.out.println(punyaTri.Model);
        System.out.println(punyaTri.Serial_Number);
        System.out.println(punyaTri.Kapasitas);
        
        //tampilkan hasil method object mesincuci
        System.out.println(" ");
        punyaYola.masukkanpakaian();
        punyaYola.masukkandetergen();
        punyaYola.turnon();
        punyaYola.turnoff();
    }
}

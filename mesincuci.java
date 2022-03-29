/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triyoladevi_111;

public class mesincuci {
    //Property
    String Merk;
    String Model;
    String Serial_Number;
    String Kapasitas;
    
    //method khusus
    public mesincuci(String Merk, String Model, String Serial_Number, String Kapasitas){
        this.Merk = Merk;
        this.Model = Model;
        this.Serial_Number = Serial_Number;
        this.Kapasitas = Kapasitas;
    }
    //method
    void masukkanpakaian(){
        System.out.println("Pakaian dimasukkan");
    }
    void masukkandetergen(){
        System.out.println("Detergen dimasukkan");
    }
    void turnon(){
        System.out.println("Mesin cuci dinyalakan");
    }
    void turnoff(){
        System.out.println("Mesin cuci dimatikan");
    }
    
}
    


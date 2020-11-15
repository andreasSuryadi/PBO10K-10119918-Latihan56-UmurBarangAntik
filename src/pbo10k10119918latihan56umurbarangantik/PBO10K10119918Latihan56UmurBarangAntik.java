/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan56umurbarangantik;

/**
 *
 * @author andreas
 */
public class PBO10K10119918Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        
        System.out.println("Nama barang antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}

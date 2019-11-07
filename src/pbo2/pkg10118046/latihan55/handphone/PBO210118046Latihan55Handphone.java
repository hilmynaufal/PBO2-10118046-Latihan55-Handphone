/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan55.handphone;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program :
 */
public class PBO210118046Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        BlackBerry blackberry = new BlackBerry("BlackBB", "RIM", "Curve", 2000000);
        blackberry.setPinBB("BHS249");
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUQIJWORJ");
        
        android.displayProduct();
        blackberry.displayProduct();
        wp.displayProduct();
    }

}

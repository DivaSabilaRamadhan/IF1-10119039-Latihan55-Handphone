/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : 
 */
public class Test {

    public static String man,os,model;
    public static int harga;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android(man,os,model,harga);
        android.manufacture = "Samsung";
        android.operatingSystem = "Android";
        android.model = "Grand";
        android.harga = 3000000;
        System.out.println("Android Key Store : " + android.getKeyStore());
        
        Blackberry BB = new Blackberry(man,os,model,harga);
        BB.manufacture = "BlackB";
        BB.operatingSystem = "Win8";
        BB.model = "Curve";
        BB.harga = 2000000;
        BB.setPinBB("BHS249");
        BB.displayProduct();
        System.out.println("PIN ; " + BB.getPinBB());
        
        WindowsPhone windowsP = new WindowsPhone(man,os,model,harga);
        windowsP.manufacture = "Nokia";
        windowsP.operatingSystem = "win8";
        windowsP.model = "Lumia";
        windowsP.harga = 1000000;
        windowsP.setWpKeyStore("UUUQIJWORJ");
        windowsP.displayProduct();
        System.out.println("Wp Key Store : " + windowsP.getWpKeyStore());
    }
    
}

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
 * Deksripsi Program : berisi class dari Windows Phone 
 */
public class WindowsPhone extends Handphone {
    private String wpKeyStore;
    
    public WindowsPhone(String man,String os,String model,int harga ){
        super(man,os,model,harga);
    }
    
    public String getWpKeyStore(){
        return wpKeyStore;
    }
    
    public void setWpKeyStore(String wpKeyStore){
        this.wpKeyStore = wpKeyStore;
    }
}

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
 * Deskripsi Program : berisi class dari Android
 */
public class Android extends Handphone {
    private String keyStore;
    
    public Android(String man,String os,String model,int harga ){
        super(man,os,model,harga);
    }
    
    public String getKeyStore(){
        return keyStore;
    }
    
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
}

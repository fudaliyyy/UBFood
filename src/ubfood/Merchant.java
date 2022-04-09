/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ubfood;

/**
 *
 * @author Zephyrus
 */
public class Merchant {
   private String NamaMerchant;
    private String NamaProduk;
    private int HargaMakanan;
    
    //CONSTRUCTOR
    Merchant(String NamaMerchant, String NamaProduk, int HargaMakanan){
        this.NamaMerchant = NamaMerchant;
        this.NamaProduk = NamaProduk;
        this.HargaMakanan = HargaMakanan;
    }
    
    //GETTER
    public String getNamaMerchant(){
        return NamaMerchant;
    }
    public String getNamaProduk(){
        return NamaProduk;
    }
    public int getHargaMakanan(){
        return HargaMakanan;
    }
    //SETTER
    public void setNamaMerchant(String NamaMerchant){
        this.NamaMerchant = NamaMerchant;
    }
    public void setNamaProduk(String NamaProduk){
        this.NamaProduk = NamaProduk;
    }
    public void setHargaMakanan(int HargaMakanan){
        this.HargaMakanan = HargaMakanan;
    }
    
    
}

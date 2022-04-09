/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ubfood;

import java.util.Scanner;

/**
 *
 * @author Zephyrus
 */
public class DataMerchant {
    static Scanner scan = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];
    
    public static Merchant[] addMerchant (Merchant merchant){
        Merchant[] newMerch = new Merchant[DataMerchant.merc.length+1];
        
        System.arraycopy(DataMerchant.merc, 0, newMerch, 0, DataMerchant.merc.length);
        newMerch[DataMerchant.merc.length] = merchant;
        
        return newMerch;
    }
    public static void showData(){
        for (Merchant mch1 : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama merchant : "+ mch1.getNamaMerchant());
            System.out.println("Nama Produk : "+ mch1.getNamaProduk());
            System.out.println("Harga : "+mch1.getHargaMakanan());
            
        }
    }
    public static Merchant searchMerchant(String NamaMerchant, String NamaProduk){
        for (Merchant merch : merc) {
            if (merch.getNamaMerchant().equals(NamaMerchant) || merch.getNamaProduk().equals(NamaProduk) ) 
                return merch;
        }
        return null;
    }
    public static void showMerchant(Merchant merchant){
        System.out.println("Nama merchant : "+ merchant.getNamaMerchant());
        System.out.println("Nama Produk : "+ merchant.getNamaProduk());
        System.out.println("Harga : "+ merchant.getHargaMakanan());
    }
    public static void updateMerchant(){
        for (Merchant mch1 : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama merchant : "+ mch1.getNamaMerchant());
            System.out.println("Nama Produk : "+ mch1.getNamaProduk());
            System.out.println("Harga : "+mch1.getHargaMakanan());
            
        }
    }

}

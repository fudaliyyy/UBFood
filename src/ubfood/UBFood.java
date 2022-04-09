/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ubfood;

import java.util.Scanner;

/**
 *
 * @author Zephyrus
 */
public class UBFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant ("Bakso Pak Sahid", "Bakso",8000));
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant ("Nasgor Mblebes", "Nasi Goreng Jawa",10000));
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant ("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi" ,10000));
        DataMerchant.showData();
        
        System.out.println("Masukkan Nama Merchant, Nama Produk, Harga Makanan : ");
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant(scan.nextLine(), scan.nextLine(), scan.nextInt()));
        
        System.out.println();
        System.out.println("Merchant Berhasil Ditambahkan!");
        System.out.println();
        DataMerchant.updateMerchant();
    }
    
}

    


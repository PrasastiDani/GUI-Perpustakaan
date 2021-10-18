/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Prasasti
 */
public class KoneksiDB {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if(koneksi==null){
            try {
                String url="jdbc:mysql://localhost:3306/db_perpustakaan";
                String username="root";
                String password="";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi=DriverManager.getConnection(url,username,password);
                System.out.println("Koneksi Berhasil terhubung ke Database");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return koneksi;
    }
}

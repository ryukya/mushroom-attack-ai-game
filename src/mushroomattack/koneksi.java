/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mushroomattack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yopie
 */
public class koneksi {
    private static Connection koneksi;
    
    public static Connection getkoneksi() {
        if (koneksi==null) {
            try {
                String url=new String();
                String user=new String();
                String password=new String();
                url="jdbc:mysql://localhost:3306/mushroom";
                user="root";
                password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url,user,password);
                System.out.println("Berhasil membuat koneksi");
            }catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
     return koneksi;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginRegister;

/**
 *
 * @author Aditya Chanekar
 */
public class Main {
    public static String connectionString = "jdbc:mysql://localhost:3306/medic?zeroDateTimeBehavior=convertToNull";
    public static String driverClass ="com.mysql.jdbc.Driver";
    public static void main(String args[]){
        System.out.println("Start off");
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
    }
    
}

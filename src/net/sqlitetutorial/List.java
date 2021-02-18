package net.sqlitetutorial;

import java.sql.*;

public class List {

    public static void main(String[] args) {
        connect();
        selectAll();
    }

    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/Users/Prophet/IdeaProjects/MobilePay.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
            System.out.println(url); //fortæller brugeren at alt er ok

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) { //Prøver at oprette forbindelse til serveren, hvis alt går galt skal den lukke session

                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    public static void selectAll(){
        System.out.println(("ID") +  ". " + ("NAME") + "\n" + ("PHONENUMBER") + "\n" + ("ADDRESS") + "\n\n");
    }
}
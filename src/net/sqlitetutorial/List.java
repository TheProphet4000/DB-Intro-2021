package net.sqlitetutorial;

import java.sql.*;

public class List
{

    public static void main(String[] args)
    {
        try
        {
            String myUrl = "jdbc:sqlite:C:/Users/Prophet/Documents/GitHub/DB-Intro-2021/MobilePay.db";
            Connection conn = DriverManager.getConnection(myUrl);
            System.out.println(myUrl);

            String query = "select * from user";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.format("%s, %s\n", id, name);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Something is wrong here: ");
            System.err.println(e.getMessage());
        }
    }
}
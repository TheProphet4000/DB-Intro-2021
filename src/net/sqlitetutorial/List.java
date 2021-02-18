package net.sqlitetutorial;

import java.sql.*;

public class List
{

    public static void main(String[] args)
    {
        try
        {
            String myUrl = "jdbc:sqlite:C:\\Users\\Prophet\\IdeaProjects\\MobilePay.db";
            Connection conn = DriverManager.getConnection(myUrl);

            String query = "SELECT * FROM User";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String phonenumber = rs.getString("PHONENUMBER");
                Date dateCreated = rs.getDate("REGISTRATIONDATE");
                String card = rs.getString ("CARDDETAILS");
                String comp = rs.getString("COMPNAME");

                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s\n", id, name, phonenumber, dateCreated, card, comp);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Somthing is wrong here ");
            System.err.println(e.getMessage());
        }
    }
}
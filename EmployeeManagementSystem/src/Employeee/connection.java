package Employeee;

import java.sql.*;
public class connection {
    public Connection c;
    public Statement s;

    public connection() {
        try {
            Class.forName("com/mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///EmplyeeMSDB","root","");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

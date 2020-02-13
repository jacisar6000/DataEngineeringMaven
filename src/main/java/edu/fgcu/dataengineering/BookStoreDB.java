package edu.fgcu.dataengineering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// just to check if these are found

public class BookStoreDB {

  static Connection conn = null;

  public static void connectDB() throws SQLException {
    try {
      conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\jacisar\\IdeaProjects\\DataEngineeringMaven\\src\\Data\\BookStore.db");
      System.out.println("Successful Connection");
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    finally {
      try {
        if (conn != null) {
          conn.close();
        }
      }catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}

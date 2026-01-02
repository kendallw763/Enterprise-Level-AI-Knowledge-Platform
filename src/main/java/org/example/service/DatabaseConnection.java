package org.example.service;

import org.slf4j.Logger;
import org. slf4j.LoggerFactory;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private final static String URL = "jdbc:postgresql://localhost:5432/aikp";
    private final static String userName = "postgres";
    private final static String password = "1234";
    public static final Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);

    public static void main (String[] args){

        logger.info("Database logger message");


        String schemaName = "AIKP_SCHEMA";

        try(Connection conn = DriverManager.getConnection(URL,userName,password)) {
            Statement stmnt = conn.createStatement();

            String createSchemaSQL = "CREATE SCHEMA IF NOT EXISTS " + schemaName;
            System.out.print("Schema Created - " + schemaName);

            String createUsersTable = "CREATE TABLE IF NOT EXISTS " + schemaName + ".users" +
                    " (" + "id SERIAL PRIMARY KEY," + "username VARCHAR(50) NOT NULL," +
                    "email VARCHAR(100) NOT NULL UNIQUE" + ")";
            stmnt.executeUpdate(createSchemaSQL);
            stmnt.executeUpdate(createUsersTable);

            System.out.println("Table 'users' created");
        }catch(SQLException e){
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }
}


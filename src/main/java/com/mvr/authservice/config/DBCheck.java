package com.mvr.authservice.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCheck {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://dpg-d1ae67idbo4c73cd6cq0-a.pg.render.com:5432/authdb_103v";
        String user = "authusermvr";
        String pass = "3AcpRFqd0BHOBtmFlQJwpAhAErBMKXwu";
        Connection conn = DriverManager.getConnection(url, user, pass);
        System.out.println("Connected!");
        conn.close();
    }
}
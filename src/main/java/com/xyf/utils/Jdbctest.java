package com.xyf.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

    public class Jdbctest {



            public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
            public static final String DBURL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
            public static final String DBUSER = "root";
            public static final String DBPASS = "123456";

            public static void main(String[] args) {

                Connection conn = null;
                Statement stmt = null;
                try {
                    Class.forName(DBDRIVER);
                    System.out.println("数据库驱动正确");

                    try {
                        conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
                        System.out.println("数据库用户名密码正确");
                        stmt = conn.createStatement();
                        System.out.println("数据库连接正常");
                    } catch (Exception e) {
                        System.out.println("数据库用户名密码不正确");
                    }
                } catch (Exception e) {
                    System.out.println("数据库驱动不正确");
                }finally{
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

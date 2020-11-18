package LessonTwo;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDB {
    private static Connection connection;
    private static Statement stsm; //объект с помощью которого из приложения можно отправлять запрос непосредственно в базу
    private static PreparedStatement prstsm;

    public static void main(String[] args){
        try {
            connect();
            // creatTable();
            // upDate();
            // read();
            //deletRecord();
            //dropTable();

            disconnect();

} catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void dropTable() throws SQLException {
        stsm.executeUpdate( "DROP TABLE mens Students");
    } // удалили таблицу

    private static void deletRecord() throws SQLException {
        for (int i = 1; i<= stsm.getMaxRows(); i++){
            stsm.executeUpdate("DELETE FROM Students WHERE age >'30'");
        }
    } // удаляем записи

    private static void read() throws SQLException {
        ResultSet info = stsm.executeQuery("select * from Students");
        //while (info.next()){
        //    System.out.println(info.getString("name") + info.getInt("age"));
        //}
        ResultSetMetaData info2 = info.getMetaData();
        for (int i = 1; i<=info2.getColumnCount(); i++){
            System.out.println(info2.getColumnName(i) + " " + info2.getColumnType(i));
        }
    } //читаем данные из таблицы

    private static void creatTable() throws SQLException {
        stsm.executeUpdate(  "CREATE TABLE Students(name STRING, age INT)");
    } // создаем таблицу

    private static void upDate() throws SQLException {
        connection.setAutoCommit(false);
//        for (int i = 0; i<=10; i++){
//            stsm.executeUpdate("INSERT INTO Students (name,age) VALUES('bob', '22')");
//        }
        prstsm = connection.prepareStatement("INSERT INTO Students (name,age) VALUES('?', '?')");
        for (int i = 0; i < 10; i++){
            prstsm.setString(1, "bob"+ i);
            prstsm.setInt(2, 23 + i);
            prstsm.addBatch();
        }
        connection.setAutoCommit(false);
    } // добавление в таблицу

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC"); //инициализирует драйвер
        connection = DriverManager.getConnection("jdbc:sqlite:main.db");// указываем куда обращаться
        stsm = connection.createStatement();
        //String sql = "CREATE TABLE mens(name STRING, age INT)";

        //stsm.execute(sql);
    } //законектились

    private static void disconnect() throws SQLException {
        connection.close();
    } // разконектились
}

package app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        checkConnectionDb(); //todo delete
    }

    /**
     * Todo test delete
     * @deprecated
     */
    protected static void checkConnectionDb()
    {
        // Параметры подключения
        String url = "jdbc:postgresql://localhost:5432/mydb";
        String user = "postgres";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Подключение успешно!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
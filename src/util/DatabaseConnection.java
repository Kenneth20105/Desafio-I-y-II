package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DatabaseConnection {
    private static final Logger logger = LogManager.getLogger(DatabaseConnection.class);
    private static final String URL = "jdbc:mysql://localhost:3306/mediateca";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            logger.info("Conexión a la base de datos establecida.");
        } catch (SQLException e) {
            logger.error("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }
}

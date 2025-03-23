package dao;

import model.Material;
import util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class MaterialDAOImpl implements MaterialDAO {
    private static final Logger logger = LogManager.getLogger(MaterialDAOImpl.class);

    @Override
    public void agregar(Material material) {
        String sql = "INSERT INTO Material (codigo_identificacion, titulo, unidades_disponibles, tipo) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, material.getCodigoIdentificacion());
            pstmt.setString(2, material.getTitulo());
            pstmt.setInt(3, material.getUnidadesDisponibles());
            pstmt.setString(4, material.getClass().getSimpleName().toUpperCase());
            pstmt.executeUpdate();
            logger.info("Material agregado: " + material.getCodigoIdentificacion());
        } catch (SQLException e) {
            logger.error("Error al agregar material: " + e.getMessage());
        }
    }

    // Implementar métodos modificar, eliminar, buscar y listar...
}

import java.sql.*;

public class ArtworkDAO {

    public void insertArtwork(String title, int year, double price) throws SQLException {
        String sql = "INSERT INTO artworks (title, year, price) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, title);
            ps.setInt(2, year);
            ps.setDouble(3, price);

            ps.executeUpdate();
            System.out.println("Inserted artwork: " + title);
        }
    }

    public void readArtworks() throws SQLException {
        String sql = "SELECT * FROM artworks";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("=== Artworks in DB ===");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getInt("year") + " | " +
                                rs.getDouble("price")
                );
            }
        }
    }

    public void updateArtworkPrice(int id, double newPrice) throws SQLException {
        String sql = "UPDATE artworks SET price = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, newPrice);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Updated artwork id " + id + " to new price " + newPrice);
        }
    }

    public void deleteArtwork(int id) throws SQLException {
        String sql = "DELETE FROM artworks WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Deleted artwork with id " + id);
        }
    }
}

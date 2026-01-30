import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GameDAO {

    // CREATE
    public void addGame(Game game) throws SQLException {
        String sql = "INSERT INTO games (name, players_online, players_max, likes) VALUES (?, ?, ?, ?)";

        try (Connection conn = GDBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, game.getTitle());
            ps.setInt(2, game.getPlayersOnline());
            ps.setInt(3, game.getPlayersMax());
            ps.setInt(4, game.getLikes());

            ps.executeUpdate();
        }
    }

    // READ
    public List<Game> getAllGames() throws SQLException {
        List<Game> games = new ArrayList<>();
        String sql = "SELECT * FROM games";

        try (Connection conn = GDBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                games.add(new Game(
                        rs.getString("name"),
                        rs.getInt("players_online"),
                        rs.getInt("players_max"),
                        rs.getInt("likes")
                ));
            }
        }
        return games;
    }

    // UPDATE
    public void updateLikes(String name, int likes) throws SQLException {
        String sql = "UPDATE games SET likes = ? WHERE name = ?";

        try (Connection conn = GDBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, likes);
            ps.setString(2, name);
            ps.executeUpdate();
        }
    }

    // DELETE
    public void deleteGame(String name) throws SQLException {
        String sql = "DELETE FROM games WHERE name = ?";

        try (Connection conn = GDBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.executeUpdate();
        }
    }
}

package dao;

import java.sql.*;

public class UserDAO {

    public void saveUser(User u) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO users(id,name,email) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, u.id);
            ps.setString(2, u.name);
            ps.setString(3, u.email);
            ps.executeUpdate();
            System.out.println("User saved!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


package dao;

import java.sql.*;

public class AppointmentDAO {

    public void saveAppointment(Appointment a) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO appointments(patientName, doctorName) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, a.patient.name);
            ps.setString(2, a.doctor.name);
            ps.executeUpdate();
            System.out.println("Appointment saved!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

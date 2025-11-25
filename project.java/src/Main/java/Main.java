package Main.java;
// Main.java
public class Main {
    public static void main(String[] args) {

        Patient p = new Patient(1, "Ram", "ram@gmail.com", "Fever");
        Doctor d = new Doctor(101, "Dr. Shyam", "shyam@hospital.com", "General Physician");

        Appointment a = new Appointment(p, d);
        a.book();   // polymorphism

        AppointmentService<Appointment> service = new AppointmentService<>();
        service.addAppointment(a);

        new ReminderThread().start();  // multithreading

        UserDAO udao = new UserDAO();
        udao.saveUser(p);             // JDBC insert

        AppointmentDAO adao = new AppointmentDAO();
        adao.saveAppointment(a);      // JDBC insert
    }
}

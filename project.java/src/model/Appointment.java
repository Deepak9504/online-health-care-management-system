package model;
// model/Appointment.java
public class Appointment implements Bookable {
    private Patient patient;
    private Doctor doctor;

    public Appointment(Patient p, Doctor d) {
        this.patient = p;
        this.doctor = d;
    }

    @Override
    public void book() {
        System.out.println("Appointment booked for " + patient.name + " with Dr. " + doctor.name);
    }
}


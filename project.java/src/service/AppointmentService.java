package service;

    // service/AppointmentService.java
import java.util.ArrayList;
import java.util.List;

    public class AppointmentService<T extends Appointment> {

        private List<T> appointmentList = new ArrayList<>();

        public void addAppointment(T a) {
            appointmentList.add(a);
        }

        public List<T> getAllAppointments() {
            return appointmentList;
        }
    }



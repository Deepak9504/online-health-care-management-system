package model;

    public class Doctor extends User {
        private String specialization;

        public Doctor(int id, String name, String email, String specialization) {
            super(id, name, email);
            this.specialization = specialization;
        }

        @Override
        public void displayInfo() {
            System.out.println("Doctor: " + name + " | Specialization: " + specialization);
        }
    }



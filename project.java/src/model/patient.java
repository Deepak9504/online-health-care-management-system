package model;

    public class Patient extends User {
        private String disease;

        public Patient(int id, String name, String email, String disease) {
            super(id, name, email);
            this.disease = disease;
        }

        @Override
        public void displayInfo() {
            System.out.println("Patient: " + name + " | Disease: " + disease);
        }
    }

}

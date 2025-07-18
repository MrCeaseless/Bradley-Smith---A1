import java.util.ArrayList;

public class AssignmentOne {

    // Stores all appointments
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Object Creation

        // Create GP and Dietitian objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101,"Dr James Brown", "General Medicine", 229101, "Chronic Aches and Pains", false);
        GeneralPractitioner gp2 = new GeneralPractitioner(205,"Dr Manie Bowen", "General Medicine", 259501, "Womens Health", true);
        GeneralPractitioner gp3 = new GeneralPractitioner(604,"Dr Evelyn Singh", "General Medicine", 269101, "Preventitive Care", true);

        Dietitian d1 = new Dietitian(525, "Karl Andrew", "Dietary Services", "Hospital", true);
        Dietitian d2 = new Dietitian(521, "Sophia Jacobs", "Dietary Services","Rehab Centre", true);

        // Print doctor details
        gp1.printDetails(); System.out.println("--------");
        gp2.printDetails(); System.out.println("--------");
        gp3.printDetails(); System.out.println("--------");
        d1.printDetails(); System.out.println("--------");
        d2.printDetails(); System.out.println("--------");

        // Part 5 – Appointment Management
        System.out.println("------");

        // Create appointments
        createAppointment("Emily Watson", "0456123456", "09:00", gp1);
        createAppointment("Jacob Lee", "0456987452", "10:30", gp2);
        createAppointment("Ava Patel", "0499112233", "11:15", d1);
        createAppointment("Noah Smith", "0422334455", "14:00", d2);

        // Display all appointments
        printExistingAppointments();

        // Cancel one appointment
        cancelBooking("0456987452"); // Jacob Lee

        // Display remaining appointments
        printExistingAppointments();

        System.out.println("--------");
    }

    // Creates a new appointment and adds it to the list
    public static void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        if (patientName != null && patientMobile != null && timeSlot != null && doctor != null) {
            appointments.add(new Appointment(patientName, patientMobile, timeSlot, doctor));
        } else {
            System.out.println("Error: Missing appointment information.");
        }
    }

    // Prints all current appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment app : appointments) {
                app.printAppointment();
                System.out.println("--------");
            }
        }
    }

    // Cancels an appointment by matching the mobile number
    public static void cancelBooking(String mobile) {
        boolean found = false;

        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(mobile)) {
                appointments.remove(i);
                System.out.println("Appointment for " + mobile + " cancelled.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No appointment found for mobile: " + mobile);
        }
    }
}

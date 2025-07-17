

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 - Using classes and objects

        System.out.println("--------");

        //Creating Objects and Assigning values
        GeneralPractitioner gp1 = new GeneralPractitioner(101,"Dr James Brown", "General Medicine", 229101, "Chronic Aches and Pains", false);

                GeneralPractitioner gp2 = new GeneralPractitioner(205,"Dr Manie Bowen", "General Medicine", 259501, "Womens Health", true);

                        GeneralPractitioner gp3 = new GeneralPractitioner(604,"Dr Evelyn Singh", "General Medicine", 269101, "Preventitive Care", true);

        
        Dietitian d1 = new Dietitian(525, "Karl Andrew", "Dietary Services", "Hospital", true);
                
                Dietitian d2 = new Dietitian( 521, "Sophia Jacobs", "Dietary Services","Rehab Centre", true);
                
        
        //Printing the newly assigned object values

        gp1.printDetails();
        System.out.println("--------");
        gp2.printDetails();
        System.out.println("--------");
        gp3.printDetails();
        System.out.println("--------");

        d1.printDetails();
        System.out.println("--------");
        d2.printDetails();
        System.out.println("--------");


    }

}

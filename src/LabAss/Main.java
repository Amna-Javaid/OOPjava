package LabAss;

public class Main {
    public static void main(String[] args) {

        public class Main {
            public static void main(String[] args) {
                // Create a university with a maximum capacity of 3 labs
                University university = new University(3);

                // Create lab attendants
                Employee labAttendant1 = new Employee("001", "John Doe");
                Employee labAttendant2 = new Employee("002", "Alice Smith");

                // Create labs and add them to the university
                Lab lab1 = new Lab("Lab1", 10);
                Lab lab2 = new Lab("Lab2", 15);

                university.addLab(lab1);
                university.addLab(lab2);

                // Create and add computers to labs
                Computer computer1 = new Computer("C001", "LCD Model 1", 8, 500, true);
                Computer computer2 = new Computer("C002", "LCD Model 2", 16, 1000, false);

                lab1.addComputer(computer1);
                lab2.addComputer(computer2);

                // Fetch and display lab information
                Lab fetchedLab = university.fetchLab("Lab1");
                if (fetchedLab != null) {
                    System.out.println("Lab ID: " + fetchedLab.getLabID());
                    System.out.println("Lab Status: " + fetchedLab.getStatus());
                    System.out.println("Lab Attendant: " + fetchedLab.getLabAttendant().getName());
                } else {
                    System.out.println("Lab not found.");
                }

                // Fetch and display computer information
                Computer fetchedComputer = fetchedLab.fetchComputer("C001");
                if (fetchedComputer != null) {
                    System.out.println("Computer Number: " + fetchedComputer.getComputerNumber());
                    System.out.println("LCD Model: " + fetchedComputer.getIcdModel());
                    System.out.println("RAM Size (GB): " + fetchedComputer.getRamSize());
                    System.out.println("HDD Size (GB): " + fetchedComputer.getHddSize());
                    System.out.println("Has GPU: " + fetchedComputer.isHasGPU());
                } else {
                    System.out.println("Computer not found.");
                }
            }
        }


    }
}

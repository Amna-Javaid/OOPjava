
package LabAss;

public class Lab {
    private String labID;

    private LabStatus status=LabStatus.OPERATIONAL;
    private Employee labAttendant;
    private int computerCount ;
    private int maxComputers =25;
    private Computer computers[];


    public Lab(String labID) {
        this.labID = labID;
        this.computers = new Computer[maxComputers];
        computerCount=0;

    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public void addComputer(Computer computer) {
        if (computerCount < computers.length) {
            computers[computerCount++] = computer;
        } else {
            System.out.println("Lab is at full capacity. Cannot add more computers.");
        }
    }

    public Computer fetchComputer(String computerNumber) {
        for (int i = 0; i < computerCount; i++) {
            if (computers[i].getComputerNumber().equals(computerNumber)) {
                return computers[i];
            }
        }
        return null; //  we found no Computer//
    }

    public void removeComputer(String computerNumber) {
        for (int i = 0; i < computerCount; i++) {
            if (computers[i].getComputerNumber().equals(computerNumber)) {
                for (int j = i; j < computerCount - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                computers[computerCount - 1] = null;
                computerCount--;
                break;
            }
        }
    }

    public void changeStatus(LabStatus newStatus) {
        switch (newStatus) {
            case OPERATIONAL:
                this.status = LabStatus.OPERATIONAL;
                break;
            case FAULTY_MULTIMEDIA:
                this.status = LabStatus.FAULTY_MULTIMEDIA;
                break;

            default:

                System.out.println("Invalid lab status");
                break;
        }
    }

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }



}


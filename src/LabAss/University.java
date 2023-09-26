package LabAss;


    public class University {
        private Lab[] labs;
        private int labCount;

        public University(int maxLabs) {
            labs = new Lab[maxLabs];
            labCount = 0;
        }


        public void addLab(Lab lab) {
            if (labCount < labs.length) {
                labs[labCount] = lab;
                labCount++;
            } else {
                System.out.println("University cannot accommodate more labs.");
            }
        }


        public void removeLab(String labID) {
            for (int i = 0; i < labCount; i++) {
                if (labs[i].getLabID().equals(labID)) {
                    // Shift elements left to overwrite the removed lab
                    for (int j = i; j < labCount - 1; j++) {
                        labs[j] = labs[j + 1];
                    }
                    labs[labCount - 1] = null;
                    labCount--;
                    return;
                }
            }
            System.out.println("Lab not found.");
        }


        public Lab fetchLab(String labID) {
            for (int i = 0; i < labCount; i++) {
                if (labs[i].getLabID().equals(labID)) {
                    return labs[i];
                }
            }
            return null; // Lab not found
        }


    }




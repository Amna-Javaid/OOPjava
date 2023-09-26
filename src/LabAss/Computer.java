package LabAss;

import java.util.Objects;

public class Computer {
    private String computerNumber;
    private String icdModel;
    private int ramSize;
    private int hddSize;
     private boolean hasGPU;


    public Computer() {
    }

    public Computer(String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.icdModel = icdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getIcdModel() {
        return icdModel;
    }

    public void setIcdModel(String icdModel) {
        this.icdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return getRamSize() == computer.getRamSize() && getHddSize() == computer.getHddSize() && isHasGPU() == computer.isHasGPU() && Objects.equals(getComputerNumber(), computer.getComputerNumber()) && Objects.equals(getIcdModel(), computer.getIcdModel());
    }
    @Override
    public Computer clone() {
        try {
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }



}

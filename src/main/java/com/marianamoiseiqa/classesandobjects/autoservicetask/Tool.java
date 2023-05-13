package com.marianamoiseiqa.classesandobjects.autoservicetask;

public class Tool {
    //Defining all proprieties of tool
    boolean needsElectricity;
    boolean isUsed;
    long uniqueCode;

    public Tool() {
        // System.out.println("There was bought a new tool for fixing engine about we don't know any info");
    }

    public Tool(long uniqueCodeTool) {
        this.uniqueCode = uniqueCodeTool;
        // System.out.println("There was bought a new tool for fixing engine about that is known code");
    }
}

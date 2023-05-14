package com.marianamoiseiqa.classesandobjects.autoservicetask;

public class Worker {
    //Defining all proprieties of worker
    String name;
    int age;
    String specialization;
    boolean isExperienced;

    public Worker(int ageOfWorker, String specializationtype) {
        this.age = ageOfWorker;
        this.specialization = specializationtype;
        //System.out.println("A new worker join the team and about him we know age and specialization");
    }

    public Worker() {
        System.out.println("A new worker join the team but we don't have any info about him yet");
    }

}

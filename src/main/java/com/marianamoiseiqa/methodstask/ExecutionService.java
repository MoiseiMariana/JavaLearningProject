package com.marianamoiseiqa.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(100, 350);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble);
        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila randomDouble1: " + randomDouble1);
        System.out.println(" Random boolean: " + DataGeneratorUtil.getRandomBoolean());
        System.out.println(" Random Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println(" Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random String de X chars : " + DataGeneratorUtil.generateRandomString(5));

        Customer ionConsumer = new Customer("Ion Cojocari", 26, "Ion.Boss@gmail.com");
        System.out.println(" Nume obiect Ion : " + ionConsumer.getName());
        System.out.println(" Varsta obiectului Ion : " + ionConsumer.getAge());
        System.out.println(" Adresa de email a obiectului Ion  : " + ionConsumer.getEmail());

        ionConsumer.setName("Ion Brotacel");
        ionConsumer.setAge(34890);
        ionConsumer.setEmail("Ion.Brotacel1990@gmail.com");
        System.out.println(" Nume obiect Ion : " + ionConsumer.getName());
        System.out.println(" Varsta obiectului Ion : " + ionConsumer.getAge());
        System.out.println(" Adresa de email a obiectului Ion  : " + ionConsumer.getEmail());
        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateRandomString(12), DataGeneratorUtil.getRandomInt(127), DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateRandomString(5));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }
}

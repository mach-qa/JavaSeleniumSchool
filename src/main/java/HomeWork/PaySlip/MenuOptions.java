package HomeWork.PaySlip;

import static HomeWork.PaySlip.Helpers.scannerForInteger;
import static HomeWork.PaySlip.Helpers.scannerForString;
import static HomeWork.PaySlip.Helpers.printWorkerEditor;

public class MenuOptions {

    public static void sumOfWorkersSalary(Company list) {
        int sum = 0;

        for (int i = 0; i < list.sizeOfCompany(); i++) {
            sum += list.getWorkerIndex().get(i).getSalary();
        }
        System.out.println("The sum of all employees salary is: " + sum);
    }

    public static void printListOfWorkersSalary(Company list) {
        System.out.println("The list of worker's salary:");
        for (int i = 0; i < list.sizeOfCompany(); i++) {
            list.getWorkerIndex().get(i).getAllData();
        }
    }

    public static void updateWorkerData(Company list) {
        System.out.println("Please choose with worker's data you want to update");
        int workerIndex = scannerForInteger() - 1;
        while (true) {
            printWorkerEditor();
            int selectedParameter = scannerForInteger();
            switch (selectedParameter) {
                case 1: {
                    System.out.println("Set a new First name");
                    list.getWorkerIndex().get(workerIndex).setFirstName(scannerForString());
                    continue;
                }
                case 2: {
                    System.out.println("Set a new Last name");
                    list.getWorkerIndex().get(workerIndex).setLastName(scannerForString());
                    continue;
                }
                case 3: {
                    System.out.println("Set a new salary");
                    list.getWorkerIndex().get(workerIndex).setSalary(scannerForInteger());
                    continue;
                }
                case 4:
                    break;
                default:
                    System.out.println("The option you choose, doesn't exist. Please try again");
            }
            break;
        }
    }
}

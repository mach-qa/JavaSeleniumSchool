package HomeWork.PaySlip;

import static HomeWork.PaySlip.Employee.addNewEmployee;
import static HomeWork.PaySlip.Employee.removeEmployee;
import static HomeWork.PaySlip.Helpers.*;
import static HomeWork.PaySlip.MenuOptions.*;

public class Main {
    public static void main(String[] args) {

        Company listOfWorkers = new Company();

        for (int i = 0; i < 5; i++) {
            System.out.println("Worker no. " + (listOfWorkers.sizeOfCompany() + 1));
            listOfWorkers.addWorker(addNewEmployee());
        }

        while (true) {
            printMenu();
            int option = scannerForInteger();
            switch (option) {
                case 1:
                    sumOfWorkersSalary(listOfWorkers);
                    continue;
                case 2:
                    printListOfWorkersSalary(listOfWorkers);
                    continue;
                case 3: {
                    System.out.println("Please enter required data for a new Worker");
                    listOfWorkers.addWorker(addNewEmployee());
                }
                continue;
                case 4: updateWorkerData(listOfWorkers); continue;
                case 5: {
                    removeEmployee(listOfWorkers);
                }
                case 6: {
                    System.out.println("Thank you ! Have a nice day !");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("The option you choose, doesn't exist. Please try again");
            }
        }
    }
}
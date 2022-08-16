package HomeWork.PaySlip;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> workerIndex;

    public Company(ArrayList<Employee> workerIndex) {
        this.workerIndex = workerIndex;
    }

    public ArrayList<Employee> getWorkerIndex() {
        return workerIndex;
    }

    public void setWorkerIndex(ArrayList<Employee> workerIndex) {
        this.workerIndex = workerIndex;
    }
}

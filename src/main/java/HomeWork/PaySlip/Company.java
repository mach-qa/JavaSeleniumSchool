package HomeWork.PaySlip;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> workerIndex;

    public Company() {
        workerIndex = new ArrayList<>();
    }

    public ArrayList<Employee> getWorkerIndex() {
        return workerIndex;
    }

    public void setWorkerIndex(ArrayList<Employee> workerIndex) {
        this.workerIndex = workerIndex;
    }

    public void addWorker(Employee employee) {
        workerIndex.add(employee);
    }

    public Integer sizeOfCompany() {
        return workerIndex.size();
    }

}

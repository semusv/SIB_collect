package tasks.task7;

import java.math.BigDecimal;
import java.util.HashMap;

public class TaskHashMap {
    static HashMap<String, Worker> map = new HashMap<>();


    public static void main(String[] args) {
        Worker worker = new Worker("TN-001", "Иванов Иван Иванович", "+7(999)999-99-99", BigDecimal.valueOf(100000));
        map.put(worker.getPernr(), worker);
        worker = new Worker("TN-002", "Сергеев Сергей Сергеевич", "+7(555)555-55-55", BigDecimal.valueOf(200000));
        map.put(worker.getPernr(), worker);
        worker = new Worker("TN-003", "Петров Петр Петрович", "+7(777)777-77-77", BigDecimal.valueOf(300000));
        map.put(worker.getPernr(), worker);

        printWorkers();
        addSalaryForWorker("TN-002", BigDecimal.valueOf(5000));
    }

    static private void addSalaryForWorker(String pernr, BigDecimal salary) {
    }

    static private void printWorkers() {
    }
}

class Worker {
    final private String pernr;
    final private String full_name;
    final private String telephone;
    private BigDecimal salary;


    public Worker(String pernr, String full_name, String telephone, BigDecimal salary) {
        this.pernr = pernr;
        this.full_name = full_name;
        this.telephone = telephone;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public String getPernr() {
        return pernr;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}



//public class SolutionHashMap {
//    HashMap<String, Worker> map = new HashMap<>();
//
//
//    public void run() {
//        Worker worker = new Worker("TN-001", "Иванов Иван Иванович", "+7(999)999-99-99", BigDecimal.valueOf(100000));
//        map.put(worker.getPernr(), worker);
//        worker = new Worker("TN-002", "Сергеев Сергей Сергеевич", "+7(555)555-55-55", BigDecimal.valueOf(200000));
//        map.put(worker.getPernr(), worker);
//        worker = new Worker("TN-003", "Петров Петр Петрович", "+7(777)777-77-77", BigDecimal.valueOf(300000));
//        map.put(worker.getPernr(), worker);
//
//        printWorkers();
//        addSalaryForWorker("TN-002", BigDecimal.valueOf(5000));
//    }
//
//    private void addSalaryForWorker(String pernr, BigDecimal salary) {
//        Worker worker = map.get(pernr);
//        worker.addSalary(salary);
//        System.out.println();
//        System.out.println("После повышения зарплаты:");
//        System.out.println(worker.toString());
//    }
//
//    private void printWorkers() {
//        for (Worker worker : map.values()) {
//            System.out.println(worker.toString());
//            System.out.println("---------------------------");
//        }
//    }
//
//
//    static class Worker {
//        final private String pernr;
//        final private String full_name;
//        final private String telephone;
//        private BigDecimal salary;
//
//
//        public Worker(String pernr, String full_name, String telephone, BigDecimal salary) {
//            this.pernr = pernr;
//            this.full_name = full_name;
//            this.telephone = telephone;
//            this.salary = salary;
//        }
//
//        private void addSalary(BigDecimal salary) {
//            this.salary = this.salary.add(salary);
//        }
//
//
//        @Override
//        public String toString() {
//            return String.format("Табельный номер: %s \nФИО: %s, Телефон: %s \nЗаработная плата: %d",
//                    this.getPernr(), this.getFull_name(), this.getTelephone(), this.getSalary().intValue());
//        }
//
//        public String getPernr() {
//            return pernr;
//        }
//
//        public String getFull_name() {
//            return full_name;
//        }
//
//        public String getTelephone() {
//            return telephone;
//        }
//
//        public BigDecimal getSalary() {
//            return salary;
//        }
//    }
//
//}

package Sem6;

import java.util.Date;

//1) Переписать код в соответствии с Single Responsibility Principle:
public class Task1 {

    public class Employee {
        private String name;
        private Date dob;
        private int baseSalary;
        
        public Employee(String name, Date dob, int baseSalary) {
            this.name = name;
            this.dob = dob;
            this.baseSalary = baseSalary;
        }
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }
    }
    
    public class Calculate{

        public int calculateNetSalary(int baseSalary) {
            int tax = (int) (baseSalary * 0.25);//calculate in otherway
            return baseSalary - tax;
        }
    }
}

package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Person;

public class AverageAge <T extends Person>  {
    private List<T> list = new ArrayList<T>();
    private int age;
    private double AverageAge;

    // list список группы
    public AverageAge(List<T> list){
        this.list = list;
        AvAge();
    }

    // поиск среднего возраста
    private void AvAge(){
        for (T i : list){
            age += i.getAge();
        }
        AverageAge = (double) age/ list.size();
    }

    public void AverageResult(){
        System.out.printf("Средний возраст = %.2f", AverageAge);
    }


    
}

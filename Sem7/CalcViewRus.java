package Sem7;

public class CalcViewRus implements iCalcView {

    @Override
    public void messHello() {
        System.out.println("Hello \n Введите число формата a+bi");
    }

    @Override
    public void messFirsrNumber() {
        System.out.println("Введите первое число: ");
    }

    @Override
    public void messSetNumber() {
        System.out.println("Введите А -enter- B: ");
    }

    @Override
    public void messGetNumber(ComplexNumber comp) {
        System.out.println(comp);
    }

    @Override
    public void messOperation() {
        System.out.println("Введите знак /,*,-,+,= : ");
    }
    
}

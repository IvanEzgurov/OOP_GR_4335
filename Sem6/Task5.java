package Sem6;

public class Task5 {
    /*5) Переписать код в соответствии с Dependency Inversion Principle:
public class Car {
private PetrolEngine engine;
public Car(PetrolEngine engine) {
this.engine = engine;
}
public void start() {
this.engine.start();
}
}
public class PetrolEngine {
public void start() {
}
}
Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.
*/

    public class Car {
        private IEngine engine;
        public Car(IEngine engine){
            this.engine = engine;
        }
        public void start() {
            this.engine.start();
        }
    }
    public class PetrolEngine implements IEngine {
        public void start(){

        }
    }

    public interface IEngine{
        public void start();
    }

}


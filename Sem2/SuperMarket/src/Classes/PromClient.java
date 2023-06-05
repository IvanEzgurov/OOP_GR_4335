package Classes;

public class PromClient extends Actor {

    private static int countAction = 4;
    private String promtName;
    private int IdClient;

    // countAction количество мест в акции
    // promtName название акции
    // IdClient номер клиента
    public PromClient(String name, String promtName, int IdClient){
        super(name);
        this.promtName = promtName;
        if(IdClient <= countAction){
            this.IdClient = IdClient;
        }else{
            throw new IllegalStateException(String.format("Количество мест в акции ограниченно: %s", countAction));
        }
    }
    // количество мест в акции
    public static int getCountAction(){
        return countAction;
    }
    // новое количество мест в акции

    public static void setCountAction(int countAction){
        PromClient.countAction = countAction;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
        return this;
    }
    public String getPromtName() {
        return promtName;
    }
    public void setPromtName(String promtName) {
        this.promtName = promtName;
    }
    public int getIdClient() {
        return IdClient;
    }
    public void setIdClient(int idClient) {
        IdClient = idClient;
    }
}

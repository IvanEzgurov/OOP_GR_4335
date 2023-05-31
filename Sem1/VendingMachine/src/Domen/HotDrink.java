package Domen;

public class HotDrink extends Bottle{
    private int tempt;
    public HotDrink(int productId, String productName, String productCategory, double price, int volume, int tempt) throws Exception{
        super(productId, productName, productCategory, price, volume);
        this.tempt = tempt;
    }
    public int getTempt() {
        return tempt;
    }
    public void setTempt(int tempt) {
        this.tempt = tempt;
    }
    public String toString()
        {
            return "Product{" +
            "name='" + super.getProductName() + '\'' +
            "category='" + super.getProductCategory() + '\'' +
            ", cost=" + super.getPrice() +
            ", volume=" + super.getVolume() +
            ", tempt=" + tempt +
            '}';
        }
}


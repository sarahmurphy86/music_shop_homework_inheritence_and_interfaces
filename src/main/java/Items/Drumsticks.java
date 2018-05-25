package Items;

public class Drumsticks extends Item  implements ISell{

    public Drumsticks(String description, double buying_price, double selling_price){
        super(description,buying_price,selling_price);
    }

    public double sell() {
    }
}

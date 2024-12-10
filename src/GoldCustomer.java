public class GoldCustomer extends Customer{

    public GoldCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProducts(double fullPrice) {
        return fullPrice*0.8;
    }
}

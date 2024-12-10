public class StandardCustomer extends Customer{

    public StandardCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProducts(double fullPrice) {
        return fullPrice;
    }
}

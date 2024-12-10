import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ICustomer> customerList = new ArrayList<>();
        customerList.add(new StandardCustomer(1, "cust1"));
        customerList.add(new StandardCustomer(2, "cust2"));
        customerList.add(new StandardCustomer(3, "cust3"));
        customerList.add(new StandardCustomer(4, "cust4"));
        customerList.add(new StandardCustomer(5, "cust5"));
        customerList.add(new StandardCustomer(6, "cust6"));
        customerList.add(new StandardCustomer(7, "cust7"));
        customerList.add(new StandardCustomer(8, "cust8"));
        customerList.add(new StandardCustomer(9, "cust9"));
        customerList.add(new StandardCustomer(10, "cust10"));

        for (ICustomer customer : customerList) {
            System.out.println("Name: " + customer.getCustomerName() + " 300:" + customer.getPriceForProduct(300) + " 3800 " + customer.getPriceForProduct(3800) );)
        }
    }
}
    import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer11> customers = new ArrayList<>();

        Customer11 customer1 = new Customer11(1, "Zakia");
        Customer11 customer2 = new Customer11(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer11(4, "Cici"));

        for (Customer11 cust : customers) {
            System.out.println(cust.toString());
        }
    }
}
    


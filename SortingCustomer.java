import java.util.ArrayList;

public class SortingCustomer {
    public static void main(String[] args) {

        ArrayList<Customer11> customers = new ArrayList<>();

        customers.add(new Customer11(67, "Hijume"));
        customers.add(new Customer11(68, "Delwyn"));
        customers.add(new Customer11(69, "Nafari"));

        customers.sort((c1, c2)->c1.name.compareTo(c2.name));

        System.out.println(customers);
    }
}
    


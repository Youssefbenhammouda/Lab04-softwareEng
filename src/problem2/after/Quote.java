package problem2.after;

import java.util.ArrayList;

public class Quote {
    private final Laptop laptop;
    private String customerName;
    private final ArrayList<String> services ;
    public Quote(Laptop laptop){
        this.laptop = laptop;
        services  = new ArrayList<>();

    }

    private Quote(Quote src) {
        this.customerName = src.customerName;
        this.laptop   = src.laptop;
        this.services = new ArrayList<>(src.services);   // shallow, to be fixed in question 7
    }

    public Quote copy() {
        return new Quote(this);
    }
    public Quote forCustomer(String name){
        this.customerName = name;
        return this;
    }

    public Quote addservice(String service){
        services.add(service);
        return this;

    }

    Laptop getLaptop(){
        return laptop;
    }

    @Override
    public String toString(){
        return String.format("Quote for %s: [%s]", customerName,String.join(",",services));
    }
}

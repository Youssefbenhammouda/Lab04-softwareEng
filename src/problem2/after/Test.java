package problem2.after;

public class Test {
    public static void main(String[] args) {

        // Part A: Builder (question 4)
        Laptop laptop = new Laptop.Builder("i7")
                .ram(16)
                .ssd(512)
                .backlitKeyboard()
                .accessory("Mouse")
                .build();
        System.out.println(laptop);

        try {
            new Laptop.Builder("i5").ram(-8).build();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // Part B: Prototype (questions 6 and 7)
        PresetRegistry registry = new PresetRegistry();
        registry.register("student",
                new Quote(new Laptop.Builder("i5").ram(8).build()).addservice("Setup"));

        Quote q1 = registry.create("student")
                .forCustomer("SAFI Amal")
                .addservice("Extended warranty");
        Quote q2 = registry.create("student")
                .forCustomer("ALAMI Samir");

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q1.getLaptop() == q2.getLaptop());
    }
}

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Miro's Corner");
        /*
        // 1. Create object with default constructor without parameter
        Person person1 = new Person();
        // Initialize value through by methods
        person1.setId(1L);
        person1.setFirstName("John");
        person1.setLastName("Doe");

        // Create the address list
        List<Person.Address> addresses = new ArrayList<Person.Address>();

        // Create and set address1
        // A static nested class does not have an implicit reference to the instance of its outer class
        // It can be created and used without an instance of the outer class
        Person.Address address1 = new Person.Address();
        address1.setCity("Hanoi");
        address1.setStreet("Ba Dinh");
        address1.setState("HN");
        address1.setZip("123");
        addresses.add(address1);

        // Create and set address2
        Person.Address address2 = new Person.Address();
        address2.setCity("Ho Chi Minh");
        address2.setStreet("Quan 1");
        address2.setState("HCM");
        address2.setZip("456");
        addresses.add(address2);

        // Set the address list to person1
        person1.setAddress(addresses);

        // Print person1
        System.out.println(person1);

        System.out.println("=========");

        // 2. Create object with constructor with parameters
        Person person2 = new Person(2L, "Miro", "Doan");
        System.out.println(person2);

         */

        /*
        Employee employee = new Employee();
        employee.setId(3L);
        employee.setFirstName("David");

        System.out.println(employee.toString());

        UserService user = new UserService();
        user.setName("Tada");
        user.sayHi();
        System.out.println(employee.toString());

        SampleOverloading over = new SampleOverloading();
        String s = over.print(12);
        System.out.println(s);
        */

        Product product = new Product();
        System.out.println(product);


    }

    private static class Product {
        private Integer id;
        private String name;
        private BigDecimal price;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

}

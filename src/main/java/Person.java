import java.util.List;

public class Person {
    // 1, Attributes - Fields present states
    // Instance variables - Những biến được khởi tạo nhưng chưa được gán giá trị
    private Long id; // identity
    private String firstName;
    private String lastName;
    private List<Address> address;

    // 2. Constructor with no parameter - default
    public Person() {
    }


    // Constructor with parameters
    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // 3. Behaviors - Methods
    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    // 4. Nested Class - utility or helper classes
    // this class can be used independently or Person instances
    static class Address {
        private String street;
        private String city;
        private String state;
        private String zip;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zip='" + zip + '\'' +
                    '}';
        }
    }

}

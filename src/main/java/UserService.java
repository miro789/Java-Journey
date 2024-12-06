// Class implement interface
public class UserService implements SampleInterface, EmployeeInterface{
    private String newName; // Declare the field

    @Override
    public void setName(String newName) {
        this.newName = newName;
        System.out.println(newName);
    }
    public void getName()
    {
        System.out.println(name); // name get from constant fields of SampleInterfaces
    }

    @Override
    public void sayHi(){
        System.out.println("Hello World");
    }
}

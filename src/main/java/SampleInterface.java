import java.time.LocalDate;

//@FunctionalInterface // Java 8
//public interface SampleInterface {
//    // SAM = SINGLE ABSTRACT METHOD
//    int sum(int a, int b);
//}

// Access Modify with default is public
public interface SampleInterface {
    // declare constant fields
    String name = "Miro";

    // declare methods that abstract --> No body, can be have parameters or not
    void setName(String name);

    void getName();


    // default method --> can have body
    default void printName()
    {
        System.out.println(name);
    }

    // static method -- already get the memory
    static String getCurrentTime(){
        return String.valueOf(LocalDate.now());
    }


}

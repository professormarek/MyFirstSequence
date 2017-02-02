/**
 * This is the entry point into our program (just has main)
 */
//use the classes out of our com.seneca.bif package
import com.seneca.bif.*;

public class MySystemMain {


    public static void main(String[] args) {

        System.out.println("Running MySystemMain code!!!!");
        //instantiate a new instance of Sequence (original base class)
        Sequence s1 = new Sequence("ACGT", 1979, "this is my Sequence instance");
        //display the first sequence
        s1.display();

        System.out.println("Second sequence:");
        //instantiate a new instance of MyDerivedSequence
        MyDerivedSequence s2 = new MyDerivedSequence();
        //verify that s2 (instance of MyDerivedSequence) has inherited the properties of Sequence
        s2.display(); //notice: data is not shared between the two!

        //notice that a reference to the base class can be used to refer to a subclass!
        Sequence ref = s2;
        s2.display();

        //cannot store a reference to the base class in a derived class reference
        //MyDerivedSequence derivedReference = s1;
    }

}

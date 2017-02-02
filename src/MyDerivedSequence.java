/**
 * Created by teaching on 2017-02-02.
 */
public class MyDerivedSequence extends Sequence{

    public void foo(){
        getLength();
        //notice we cannot access private members of Sequence!
        //label = "whatever";
        trim(1); //OK! trim is protected
    }
}

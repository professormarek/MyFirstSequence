package com.seneca.bif;
/**
 * This class represents a generic gene sequence and related operations
 */
public class Sequence {

    //fields - hint: all fields should be private (except for constants)
    private String nucleotideSequence; //raw nucleotide sequence
    private int yearSequenced; //this is the year the data was produced
    private String label; //this will hold other information/notes about the sequence

    //methods
    /*
    this is a constructor for the Sequence that will initialize a new sequence
    a constructor is a method (function/subroutine) whose job it is  to setup or initialize
    a new instance of our class
     */
    public Sequence(String rawSeq, int year, String info){
        //assign each argument to an instance variable
        nucleotideSequence = rawSeq;
        yearSequenced = year;
        label = info;
    }
    //default constructor
    public Sequence(){

    }
    /*
    this will return the length of the raw nucelotide sequence
     */
    public long getLength(){
        return nucleotideSequence.length();
    }
    /*
    this chops the last n letters off of the nucleotide sequence
     */
    protected void trim(int n){
        //trim the last n letters
        nucleotideSequence = nucleotideSequence.substring(0, nucleotideSequence.length() - (1+n));
    }
    public void display(){
        System.out.println("Sequence: " + label + " sequence in year:" + yearSequenced + "Raw sequence:" + nucleotideSequence);
    }

    //for now, let's put the main function inside our Sequence class (main could also be defined elsewhere!)
    public static void main(String[] args) {
        //create a new Sequence instance
        Sequence s1 = new Sequence("ACGT", 2017, "this is my made up sequence");
        s1.display();

    }
}

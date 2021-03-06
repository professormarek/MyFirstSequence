package com.seneca.bif;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * Created by teaching on 2017-04-03.
 */
public class SequenceTest {
    /*
    an instance variable inside SequenceTest - this is our object that we will initialize and run
    tests against
    */
    Sequence testSequence;

    @Before
    public void setUp() throws Exception {
        System.out.println("SequenceTest setUp() was called-  we would put any initalization code here!");
        //initalize the testSequence as a new Sequence
        testSequence = new Sequence("ACGT", 1997, "whatever");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("SequenceTest tearDown() was called-  we would put any clean-up code here!");

    }

    @Test
    public void getLength() throws Exception {
        System.out.println("Running test: getLength()");
        long length = testSequence.getLength();
        assertEquals(4, length);



    }

    @Test
    public void trim() throws Exception {
        System.out.println("Running test: trim(), initial length of testSequence is " + testSequence.getLength());
        testSequence.trim(2);
        long newLength = testSequence.getLength();
        assertEquals(2, newLength);

    }

    @Test
    public void display() throws Exception {
        System.out.println("Running test: display()");
        //this is an example of a "qualitative test" that the user will provide some judgement on
        //perhaps use this sparingly

        testSequence.display();

        int result = JOptionPane.showConfirmDialog(null, "Did the Sequence data display correctly?", "TEST",
                JOptionPane.YES_NO_OPTION);

        assertEquals(JOptionPane.YES_OPTION, result);

    }

}
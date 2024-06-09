package com.io.interview_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList {
    public static void main(String[] args) {
        try {
            //Create an ArrayList Object
            List<String> sample_list = new ArrayList<>();
            sample_list.add("practice");
            sample_list.add("solve");
            sample_list.add("interview");
            //display the initial list
            System.out.println("The Initial List :" + sample_list);
            //Using unmodifiableList() method
            List<String> read_only_list = Collections.unmodifiableList(sample_list);
            //applying the read only list
            System.out.println("The Read Only List : " + read_only_list);
            //Trying to add an elements to the read Only list
            System.out.println("Trying to modified Read Only List : " + read_only_list.add("job"));

        } catch (UnsupportedOperationException unsupportedOperationException) {
            System.out.println("The Exception Thrown is : " + unsupportedOperationException);
        }
    }
}

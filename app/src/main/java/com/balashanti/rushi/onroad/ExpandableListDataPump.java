package com.balashanti.rushi.onroad;

/**
 * Created by Rushikesh Kotule on 01-Mar-18.
 * data about Questions and answers of FAQ
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> q1 = new ArrayList<>();
        q1.add("Answer goes here");

        List<String> q2 = new ArrayList<>();
        q2.add("Answer goes here 2");

        List<String> q3 = new ArrayList<>();
        q3.add("Answer goes here 3");

        List<String> q4 = new ArrayList<>();
        q4.add("Answer goes here 4");

        List<String> q5 = new ArrayList<>();
        q5.add("Answer goes here 5");

        List<String> q6 = new ArrayList<>();
        q6.add("Answer goes here 6");

        expandableListDetail.put("Question 1", q1);
        expandableListDetail.put("Question 2", q2);
        expandableListDetail.put("Question 3", q3);
        expandableListDetail.put("Question 4", q4);
        expandableListDetail.put("Question 5", q5);
        expandableListDetail.put("Question 6", q6);

        return expandableListDetail;
    }
}
package com.rohit.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

@Data
public class Student {

    private String name;
    private int roll_num;
    List<String> subjects;
    Map<String, Integer> marks;
    Set<String> viva_subject;
    Properties properties;

    Student() {
        System.out.println("inside zero constructor");
    }

    Student(String name, int roll_num) {
        this.name = name;
        this.roll_num = roll_num;
        System.out.println("this is 2 args constructor");
    }

    Student(String name, int roll_num, List<String> subjects, Map<String, Integer> marks, Set<String> viva_subject, Properties properties) {
        this.name = name;
        this.roll_num = roll_num;
        this.subjects = subjects;
        this.marks = marks;
        this.viva_subject = viva_subject;
        this.properties = properties;
        System.out.println("this is all args constructor");
    }
}


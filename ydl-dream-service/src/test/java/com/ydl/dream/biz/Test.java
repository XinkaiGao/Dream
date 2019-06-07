package com.ydl.dream.biz;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author: Xinkai Gao
 * @description:
 * @date: 2019/1/22.
 */

@Getter
@Setter
class Student {

    private String studentName;

    private Integer score;

    public Student(String studentName, Integer score) {

        this.studentName = studentName;
        this.score = score;

    }

    @Override
    public String toString() {
        return "student: " + studentName + " " + "score: " + score;
    }




}


public class Test {

    public static void main(String[] args) {

        Random random = new Random();
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(new Student("student" + i, random.nextInt(50) + 50));
        }

        List<String> studentList = list.stream().filter(x->x.getScore() > 95)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .map(Student::getStudentName)
                .collect(Collectors.toList());

        System.out.println(studentList);
        System.out.println(list);


    }


}

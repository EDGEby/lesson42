package lesson42;

import java.util.Arrays;

public class Students {
    private char sex;
    private int age;
    private double averageMark;
    private int[] grades;

    public Students(char sex, int age, int[] grades) {
        setSex(sex);
        setAge(age);
        setGrades(grades);
        setAverageMark();
    }

    public Students() {}

    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        if (sex!='m' && sex !='f')
            throw new IllegalArgumentException("Invalid sex");
        else
            this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<15 || age>65)
            throw new IllegalArgumentException("Invalid age");
        else
            this.age = age;
    }
    public double getAverageMark() {
        return averageMark;
    }
    public void setAverageMark() {
        int sum =0;
        for (int grade:grades)
            sum+=grade;
        averageMark=sum/4;
    }
    public int[] getGrades() {
        return grades;
    }
    public void setGrades(int[] grades) {
        for (int grade:grades){
            if( grade<1&&grade>10)
                throw new IllegalArgumentException("Invalid grades");
        }
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sex=" + sex +
                ", age=" + age +
                ", averageMark=" + averageMark +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }


}

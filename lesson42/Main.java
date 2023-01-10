package lesson42;

import java.rmi.server.LogStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<Log> logList = List.of(new Log("Oak", 10),
                new Log("Dark Oak", 7),
                new Log("Sakura", 12)
        );

        Stream<Log> logStream = logList.stream();

        Stream<Log> filtered = logStream.filter(x -> x.getType().contains("Oak")).
                filter(x -> x.getCount()>5);
        filtered.forEach(x -> System.out.println(x));


        List<Students> studentsList = new ArrayList<>();
        Random gen = new Random();
        int choice;
        for (int i=0; i<10;i++){
            Students stud=new Students();
            choice=gen.nextInt(2);
            if ( choice ==1) stud.setSex('m');
            else stud.setSex('f');
            stud.setAge(gen.nextInt(51)+15);
            int[] newMarks = new int[4];
            for (int j=0; j <newMarks.length;j++){
                newMarks[j]=gen.nextInt(9)+1;
            }
            stud.setGrades(newMarks);
            stud.setAverageMark();
            studentsList.add(stud);
        }
        System.out.println(studentsList.toString());
        System.out.println("\n\n\n");
        Stream<Students> studentsStream = studentsList.stream();

        Stream<Students> filteredStud = studentsStream.filter(x -> x.getAverageMark()>5);
        filteredStud.forEach(x -> System.out.println(x));
        System.out.println("\n\n\n");
        System.out.println(  studentsList.stream().map(x->x.getAverageMark()).reduce(0.0,(x,y)->x+ y)/10);
        double sum=0.0;
        for (Students stud1: studentsList) {
            sum+=stud1.getAverageMark();
        }
        System.out.println(sum/10);


    }
}

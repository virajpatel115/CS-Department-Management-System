package creational.singleton;

import creational.factory.Degree;
import structural.decorator.Faculty;

import java.util.ArrayList;
import java.util.List;

//Singleton Design Pattern
public class SingletonCS {

    private static SingletonCS instance;
    List<Degree> degrees;
    List<Faculty> faculties;

    public SingletonCS() {
        degrees = new ArrayList<Degree>();
        faculties = new ArrayList<Faculty>();
        System.out.println("Welcome to the CS Department!");
    }
    public static SingletonCS getInstance(){
        if (instance == null){
            instance = new SingletonCS();
        }
        return instance;
    }

    public void addDegree(Degree degree){
        degrees.add(degree);
    }
    public void addFaculty(Faculty faculty) { faculties.add(faculty);}
    public void print(){
        System.out.println("\nHere are the degrees offered:");
        for(Degree d: degrees){
            System.out.println(d.getType() + ": " + d.getMajor());
        }
    }
}

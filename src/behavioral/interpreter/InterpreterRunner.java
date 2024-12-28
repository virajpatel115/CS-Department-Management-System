package behavioral.interpreter;
import common.Semester;
import common.Student;
import common.Course;
import creational.factory.Degree;
import creational.factory.DegreeFactory;
import creational.factory.UndergradFactory;
import structural.decorator.Faculty;
import structural.decorator.FullTime;

/* Expression method GradeExpression is used in the method GPA in class Student*/
public class InterpreterRunner {
    public static void main (String[] args) {
        DegreeFactory undergrad = new UndergradFactory();
        Degree interpreter = undergrad.createProgram();
        interpreter.major("Interpreter Degree");

        Semester sem = new Semester("Spring 2024");
        Faculty ft1 = new FullTime();

        Course runner = new Course(1010, "Interpreter 101", "class about interpreter design pattern", 2, ft1, sem);
        Course runner1 = new Course(1011, "Interpreter 102", "class about interpreter design pattern", 2, ft1, sem);

        Student interp = new Student("Inaya", interpreter);
        interp.enroll(runner);
        interp.enroll(runner1);

        interp.setGrade(1010, 'A');
        interp.setGrade(1011, 'B');

        interp.getGrades();
        interp.gpa();
    }
}

package ejer_sem2;

import org.example.modelo.Student;

public class Ejer1
{
    public static void main(String[] args)
    {
        try
        {
            var student1 = new Student();
            student1.setId("20180003");
            student1.setName("Ana Torres");
            student1.setCareer("Ingenieria en Sistemas");


            var student2 = new Student();
            student2.setId("20180002");
            student2.setName("Maria Gomez");
            student2.setCareer("Ingenieria en Sistemas");
            var student = new Student();


            student.setId("20777701");
            student.setName("Juan Perez");
            student.setCareer("Ingenieria en Sistemas");
            System.out.println(student.toString());
            System.out.println(student1.toString());
            System.out.println(student2.toString());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());

        }
    }
}

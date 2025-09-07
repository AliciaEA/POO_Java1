package org.example;

import configuracion.Persona;
import org.example.modelo.Carrera;
import org.example.modelo.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
//        var carrera = new Carrera();
//        carrera.setId(1);
//        carrera.setNombre("Ingenieria en Sistemas");
//        carrera.setDescripcion("Carrera enfocada en el desarrollo de software");
//        carrera.setNombreCoordinador("Noel Gavarrete");
//        carrera.setFacultad("Facultad de Ingenieria y Arquitectura");
//
//        System.out.println(carrera.toString());
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
package org.example.modelo;

public class Student
{
    private String Id;
    private String Name;
    private String career;

    public String getId()
    {
        return Id;
    }

    public Student()
    {
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "\nId='" + Id + '\'' +
                ", \nName='" + Name + '\'' +
                ", \ncareer='" + career + '\'' +
                '\n' + '}';
    }

    public void setId(String id)
    {
        if (id.length() != 8)
        {
            throw new IllegalArgumentException("El ID debe tener 8 caracteres");
        }
        Id = id;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getCareer()
    {
        return career;
    }

    public void setCareer(String career)
    {
        this.career = career;
    }
}
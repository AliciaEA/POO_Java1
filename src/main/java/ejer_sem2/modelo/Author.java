package ejer_sem2.modelo;

public class Author
{
    private Integer IdAuthor;
    private String name;
    private int age;

    public Author(Integer idAuthor, String name, int age)
    {
        IdAuthor = idAuthor;
        this.name = name;
        this.age = age;
    }

    public Integer getIdAuthor()
    {
        return IdAuthor;
    }

    public void setIdAuthor(Integer idAuthor)
    {
        IdAuthor = idAuthor;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

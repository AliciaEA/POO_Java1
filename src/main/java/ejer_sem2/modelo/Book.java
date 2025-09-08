package ejer_sem2.modelo;

public class Book
{
    private Integer IdBook;
    private String title;
    private String genre;
    private Integer idAuthor;

    public Book(Integer idBook, String title, String genre, Integer idAuthor)
    {
        IdBook = idBook;
        this.title = title;
        this.genre = genre;
        this.idAuthor = idAuthor;
    }

    public Integer getIdBook()
    {
        return IdBook;
    }

    public void setIdBook(Integer idBook)
    {
        IdBook = idBook;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public Integer getIdAuthor()
    {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor)
    {
        this.idAuthor = idAuthor;
    }

    @Override
    public String toString()
    {
        return "\nLibro\n" +
                "ID=" + IdBook +
                "\nNombre=" + title +
                "\nGenero=" + genre +
                "\nAutor=" + idAuthor +
                '\n';
    }
}

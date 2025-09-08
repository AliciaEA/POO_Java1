package ejer_sem2;

import ejer_sem2.modelo.Author;
import ejer_sem2.modelo.Book;

public class Ejer3
{
    public static void main(String[] args)
    {
        int counter = 0;

        var autor1 = new Author(1, "Gabriel Garcia Marquez", 87);
        var autor2 = new Author(2, "Ruben Dario", 80);

        var book = new Book(counter++, "Cien años de soledad", "Novela", autor1.getIdAuthor());//El Id empieza con cero, pq es counter++, no ++counter
        var book2 = new Book(counter++, "Azul", "Poesia", autor2.getIdAuthor());

        System.out.println(book);
        System.out.println(book2);
    }
}

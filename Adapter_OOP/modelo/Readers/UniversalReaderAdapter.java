package Adapter_OOP.modelo.Readers;

import Adapter_OOP.modelo.Books.Book;

public class UniversalReaderAdapter implements BookReader{
    @Override
    public void read(Book book) {
        // Obtenemos el lector adecuado para este libro usando polimorfismo
        BookReader reader = book.getReader();
        reader.read(book);
    }
}

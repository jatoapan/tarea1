package Adapter_OOP.modelo.Readers;

import Adapter_OOP.modelo.Books.Book;

public class EpubReader implements BookReader{
    @Override
    public void read(Book book) {
        System.out.println("[EpubReader] Leyendo " + book);
    }
}

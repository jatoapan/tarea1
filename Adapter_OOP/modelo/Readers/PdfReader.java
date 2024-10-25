package Adapter_OOP.modelo.Readers;

import Adapter_OOP.modelo.Books.Book;

public class PdfReader implements BookReader{
    @Override
    public void read(Book book) {
        System.out.println("[PdfReader] Leyendo "+ book);
    }
}

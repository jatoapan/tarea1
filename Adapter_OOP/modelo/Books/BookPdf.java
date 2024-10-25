package Adapter_OOP.modelo.Books;

import Adapter_OOP.modelo.Readers.BookReader;
import Adapter_OOP.modelo.Readers.PdfReader;

public class BookPdf extends Book{

    //constructor 
    public BookPdf(String a , String t) {
        super(a,t);
    }

    @Override
    public BookReader getReader() {
        return new PdfReader();
    }
    
}
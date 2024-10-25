package Adapter_OOP.modelo.Books;

import Adapter_OOP.modelo.Readers.BookReader;
import Adapter_OOP.modelo.Readers.EpubReader;

public class BookEpub extends Book {
    
    //constructor 
    public BookEpub(String a , String t) {
        super(a,t);
    }

    @Override
    public BookReader getReader() {
        return new EpubReader();
    }

}

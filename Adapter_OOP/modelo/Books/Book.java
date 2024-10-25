package Adapter_OOP.modelo.Books;

import Adapter_OOP.modelo.Readers.BookReader;

public abstract class Book {
    protected String author ;
    protected String title ;
    
    //constructor 
    public Book(String a , String t) {
        author = a ;
        title = t ;
    }

    //metodo abstracto para el reader
    public abstract BookReader getReader() ;
    
    @Override
    public String toString(){
        return title + " by " + author ;
    }
}

package Adapter_OOP;

import Adapter_OOP.modelo.Books.*;
import Adapter_OOP.modelo.Readers.*;

public class Main {
    public static void main(String[] args) {
        //inicializamos y creamos unos libros
        Book bookPdf = new BookPdf("Ali Hazelwood" ,  "Bride");
        Book bookEpub = new BookEpub("Lana Ferguson" ,  "The Fake Mate");

        //utilizamos el lector universal para leer cualquier tipo de formato
        BookReader universalReader = new UniversalReaderAdapter();

        universalReader.read(bookPdf);   
        universalReader.read(bookEpub);
        
    }

}

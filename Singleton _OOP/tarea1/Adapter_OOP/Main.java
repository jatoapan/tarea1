package Adapter_OOP;

import Adapter_OOP.modelo.Client;
import Adapter_OOP.modelo.Readers.*;

public class Main {
    public static void main(String[] args) {
        EpubReader epubReader = new EpubReader();
        Reader adapter = new EpubAdapter(epubReader);
        Client client = new Client(adapter);
        client.displayText();
        
    }

}

package Adapter_OOP.modelo;

import Adapter_OOP.modelo.Readers.Reader;

public class Client {
    private Reader reader;

    public Client(Reader r) {
        this.reader = r;
    }

    public void displayText() {
        reader.readBook();
    }
}

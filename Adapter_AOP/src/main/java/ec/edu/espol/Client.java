package ec.edu.espol;

public class Client {

    private Reader reader;

    public Client(Reader r) {
        this.reader = r;
    }

    public void displayText() {
        reader.readBook();
    }
    
}
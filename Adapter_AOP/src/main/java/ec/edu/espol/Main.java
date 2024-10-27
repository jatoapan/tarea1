package ec.edu.espol;

public class Main {

    public static void main(String[] args) {

        EpubReader epubReader = new EpubReader();
        Reader reader = new EpubAdapter(epubReader);
        Client client = new Client(reader);
        client.displayText();

    }
    
}
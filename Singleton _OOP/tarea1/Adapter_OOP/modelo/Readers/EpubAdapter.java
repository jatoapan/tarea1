package Adapter_OOP.modelo.Readers;

public class EpubAdapter implements Reader{
    private EpubReader reader ;

    public EpubAdapter(EpubReader reader){
        this.reader = reader ;
    }

    @Override
    public void readBook() {
        reader.readEpub();
    }
}

package oose.dea.nl.dictionary.dictionary.adapter;

import oose.dea.nl.dictionary.koenen.adapter.KoenenDictionaryAdapter;
import oose.dea.nl.dictionary.kramers.adapter.KramersDictionaryAdapter;

public class DictionaryAdapterFactory {
    public static DictionaryAdapterFactory instance;


    public static DictionaryAdapterFactory getInstance() {
        if (instance == null)
            instance = new DictionaryAdapterFactory();
        return instance;
    }

    public DictionaryAdapter create(String name) {
        if ("Koenen".equals(name))
            return new KoenenDictionaryAdapter();
        else if("Kramers".equals(name))
            return new KramersDictionaryAdapter();
     return null;
        }


}

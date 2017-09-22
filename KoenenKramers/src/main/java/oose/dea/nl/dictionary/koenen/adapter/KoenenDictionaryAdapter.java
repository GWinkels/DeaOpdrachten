package oose.dea.nl.dictionary.koenen.adapter;

import oose.dea.nl.dictionary.dictionary.adapter.DictionaryAdapter;
import oose.dea.nl.dictionary.koenen.KoenenDictionary;

public class KoenenDictionaryAdapter implements DictionaryAdapter {

    private KoenenDictionary kd;

    public KoenenDictionaryAdapter() {
        kd = new KoenenDictionary();
        kd.openEnglishDutch();
        kd.openDutchEnglish();
    }


    public String translate(String word) {
        return kd.lookUp(word);
    }
}

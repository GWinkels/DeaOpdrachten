package oose.dea.nl.dictionary.kramers.adapter;

import oose.dea.nl.dictionary.dictionary.adapter.DictionaryAdapter;
import oose.dea.nl.dictionary.kramers.KramersDictionary;

public class KramersDictionaryAdapter implements DictionaryAdapter {

    private KramersDictionary kramersDictionary = new KramersDictionary();

    @Override
    public String translate(String input) {
        return kramersDictionary.find(input);
    }
}

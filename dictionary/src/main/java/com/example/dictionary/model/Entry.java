package com.example.dictionary.model;

public class Entry {

    String word;
    String Definition;

    public Entry() {
    }

    public Entry(String word, String definition) {
        this.word = word;
        Definition = definition;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return Definition;
    }

    public void setDefinition(String definition) {
        Definition = definition;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entry {");
        sb.append("word='").append(word).append('\'');
        sb.append(", Definition='").append(Definition).append('\'');
        sb.append('}');
        return sb.toString();
    }



}

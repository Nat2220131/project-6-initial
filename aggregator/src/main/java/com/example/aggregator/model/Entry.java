package com.example.aggregator.model;

import java.util.Objects;

public class Entry implements Comparable<Entry> {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(word, entry.word) && Objects.equals(Definition, entry.Definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, Definition);
    }

    @Override
    public int compareTo(Entry that){

        return Integer.compare(this.word.compareTo(that.word), 0);
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

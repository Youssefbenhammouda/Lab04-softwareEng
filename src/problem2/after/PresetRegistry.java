package problem2.after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class PresetRegistry {
    private final ArrayList<String> names;
    private final ArrayList<Quote> quotes;

    public PresetRegistry() {
        names = new ArrayList<>();
        quotes = new ArrayList<>();
    }

    public void register(String name, Quote preset) {

        int i = Collections.binarySearch(names,name);
        if (i>=0) throw new IllegalStateException("Quote preset `"+name+"` already exists.");

        names.add(-i-1,name);
        quotes.add(-i-1,preset);

    }

    public Quote create(String name){
        int i = Collections.binarySearch(names,name);
        if(i<0)throw new IllegalStateException("Quote preset `"+name+"` not found.");

        return quotes.get(i).copy();
    }
}

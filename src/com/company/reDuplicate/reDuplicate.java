package com.company.reDuplicate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class reDuplicate {
    private ArrayList<HashSet<String>> duplicate;

    public reDuplicate () {
        this.duplicate = new ArrayList<>();
    }

    public ArrayList<HashSet<String>> Unique (List<String> lst) {
        duplicate.clear();
        duplicate.add(new HashSet<>(lst));
        return duplicate;
    }

}

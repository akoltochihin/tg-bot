package com.akoltochihin.tgbot;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Storage {

    private List<String> storage = new ArrayList<>();

    public void createString(String string) {
        storage.add(string);
    }

    public List<String> getAll() {
        return storage;
    }
}

package org.example.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class AbstractListRepository<T> implements IRepository<T>, Comparator<T> {
    protected ArrayList<T> list = new ArrayList<>();
    public AbstractListRepository() {
    }
    public void save(T object) {
        if (Objects.isNull(list)) {
            list = new ArrayList<>();
        }
        list.add(object);
    }

    @Override
    public T read(String id) {
        return null;
    }

    public boolean isSaved(T object) {
        return list.contains(object);
    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}

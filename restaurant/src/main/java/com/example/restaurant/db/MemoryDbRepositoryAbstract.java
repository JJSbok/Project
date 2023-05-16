package com.example.restaurant.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class  MemoryDbRepositoryAbstract<T> implements MemoryDbRepositoryIfs<T> {

    private final List<T> db = new ArrayList();
    @Override
    public Optional<T> findById(int index) {
        return Optional.empty();
    }

    @Override
    public void deleteById(int index) {

    }

    @Override
    public List<T> listAll() {
        return null;
    }

    @Override
    public T save(T entity) {
        return null;
    }
}

package com.example.restaurant.db;

import java.util.Optional;

public interface MemoryDbRepositoryIfs {

    Optional<T> findById(int index);
    T save(T entity);
    void deleteById(int index);

    List<T> listAll();
}

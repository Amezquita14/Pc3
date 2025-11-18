package com.example.pescadito.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository {
    @org.springframework.stereotype.Repository
    public interface Combinado extends JpaRepository<Combinado, Integer> {
    }
}

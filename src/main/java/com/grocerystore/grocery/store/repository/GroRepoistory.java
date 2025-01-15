package com.grocerystore.grocery.store.repository;

import com.grocerystore.grocery.store.entity.Groceries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroRepoistory extends JpaRepository<Groceries, Long> {
}

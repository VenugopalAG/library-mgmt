package com.library.mgmt.shelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.mgmt.shelf.model.Shelf;

@Repository
public interface ShelfRepository extends JpaRepository<Shelf, Long> {

}

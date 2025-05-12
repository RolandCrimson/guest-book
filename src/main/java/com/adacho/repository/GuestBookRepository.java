package com.adacho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adacho.entity.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer>{

}

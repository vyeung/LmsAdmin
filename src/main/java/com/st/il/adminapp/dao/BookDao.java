package com.st.il.adminapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.st.il.adminapp.models.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
	
}
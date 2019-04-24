package com.st.il.adminapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.st.il.adminapp.models.BookLoans;
import com.st.il.adminapp.models.BookLoansPrimaryKey;

@Repository
public interface BookLoansDao extends JpaRepository<BookLoans, BookLoansPrimaryKey> {
	
}
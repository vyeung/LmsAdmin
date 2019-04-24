package com.st.il.adminapp.dto;

import com.st.il.adminapp.models.BookLoans;
import com.st.il.adminapp.models.LibraryBranch;

public class BkLoansBranchDTO {
	
	private BookLoans bookLoans;
	private LibraryBranch libBranch;
	
	public BkLoansBranchDTO(BookLoans bookLoans, LibraryBranch libBranch) {
		this.bookLoans = bookLoans;
		this.libBranch = libBranch;
	}

	public BookLoans getBookLoans() {
		return bookLoans;
	}

	public void setBookLoans(BookLoans bookLoans) {
		this.bookLoans = bookLoans;
	}

	public LibraryBranch getLibBranch() {
		return libBranch;
	}

	public void setLibBranch(LibraryBranch libBranch) {
		this.libBranch = libBranch;
	}
}
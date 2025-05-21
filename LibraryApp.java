package com.library.app;

import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {
	public static void main(String[] args) {
		Library library = new Library();
		library.setLibraryName("RGM Library");
		library.setTotalBooks(50000);
		
		Librarian librarian = new Librarian();
		librarian.setLibrarianName("Ranga");
		librarian.setYearsOfExperiences(8);
		
		library.showLibraryDetails();
		System.out.println();
		librarian.showLibraryDetails();
	}
}

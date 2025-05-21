package com.library.staff;

public class Librarian {
	private String librarianName;
	private int yearsOfExperience;
	
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}
	
	public void setYearsOfExperiences(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String getLibrarianName() {
		return librarianName;
	}
	
	public int getyearsOfExperience() {
		return yearsOfExperience;
	}
	
	public void showLibraryDetails() {
		System.out.println("Librarian Name is: " + librarianName);
		System.out.println("Years Of Experience are: " + yearsOfExperience);
	}
}

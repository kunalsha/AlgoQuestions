package com.practice.interview.situation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1. Create a Library class
//2. Books with Issue and Expiry Date
//3. Operation - Borrow
//4. Operation - Return
public class LibraryApp {

	private static Map<Long, Book> library =  null;

	
	public static void main(String[] args) {

 
		setupBooks();
		
//		bookIssue(10001L, LocalDate.of(2018, 02, 05));
//		bookReturn(10002L, LocalDate.of(2018, 02, 05));
//		bookIssue(10002L, LocalDate.of(2018, 02, 05));
//
//		bookIssue(10001L, LocalDate.of(2018, 02, 05));
//		bookReturn(10002L, LocalDate.of(2018, 02, 05));
//
//		bookIssue(10003L, LocalDate.of(2018, 02, 05));
//		bookReturn(10002L, LocalDate.of(2018, 02, 05));
//
//		bookIssue(10004L, LocalDate.of(2018, 02, 05));
//		bookReturn(10002L, LocalDate.of(2018, 02, 05));

		 
	}

	private void bookIssue(long l, LocalDate of) {
		Book book = library.get(l);
		Issue newIssue = new Issue(of, null);
		List<Issue> issues = book.getIssues();
//		issues.set
//		book.setIssues(issues);
		
		//library.put(l, library.get(key).set;
	}

	private static void  setupBooks() {
		
		library =  new HashMap<>();

		Book book1 = new Book(10001L, "English Grammar"); 
		Book book2 = new Book(10002L, "Hindi Grammar"); 
		Book book3 = new Book(10003L, "Sanskrit Grammar"); 
		Book book4 = new Book(10004L, "Social Science"); 
		
		library.put(10001L, book4);
		library.put(10001L, book3);
		library.put(10001L, book2);
		library.put(10001L, book1);		
	}
}

class Book {
	
	private Long id;
	private String title;
	private ArrayList<Issue> issues;

	
	public Book(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Issue> getIssues() {
		return issues;
	}

	public void setIssues(ArrayList<Issue> issues) {
		this.issues = issues;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", title=" + title + "]";
	}	
}

class Issue {
	private LocalDate issueDate;
	private LocalDate returnDate;

	public Issue(LocalDate issueDate, LocalDate returnDate) {
		super();
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
}



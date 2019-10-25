package io.turntabl.library;

import java.util.Date;
import java.util.List;

public class Borrower {
    private String borrowerName;
    private int accountNumber;
    private Date dateBorrowed;
    private List<Book> borrowedBooks;
    private BorrowedType borrowerType;

    public Borrower(String borrowerName, int accountNumber, Date dateBorrowed, List<Book> borrowedBooks, BorrowedType borrowerType) {
        this.borrowerName = borrowerName;
        this.accountNumber = accountNumber;
        this.dateBorrowed = dateBorrowed;
        this.borrowedBooks = borrowedBooks;
        this.borrowerType = borrowerType;
    }

    public BorrowedType getBorrowerType() {
        return borrowerType;
    }

    public void setBorrowerType(BorrowedType borrowerType) {
        this.borrowerType = borrowerType;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBooks(List<Book> books) {
        for ( Book book: books) {
            if (book.getStatus() == BookState.AVAILABLE) {
                book.setStatus(BookState.BORROWED);
            }
            else {
                System.out.println("The book is not available");
            }
        }
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "borrowerName='" + borrowerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", dateBorrowed=" + dateBorrowed +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}

package io.turntabl.library;

public class Book {
    private String bookTitle;
    private String author;
    private String ISBN;
    private BookCategory category;
    private BookState status;
    private BorrowedType type;

    public Book(String bookTitle, String author, String ISBN, BookCategory category, BookState status, BorrowedType type) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
        this.category = category;
        this.status = status;
        this.type = type;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public BookState getStatus() {
        return status;
    }

    public void setStatus(BookState status) {
        this.status = status;
    }

    public BorrowedType getType() {
        return type;
    }

    public void setType(BorrowedType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", category=" + category +
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}

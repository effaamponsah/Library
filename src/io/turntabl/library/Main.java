package io.turntabl.library;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Book book1 = new Book("Fire and Ice", "Kwame Atta", "ISB234HSE", BookCategory.FICTION,BookState.AVAILABLE, BorrowedType.GOLD);
    Book book2 = new Book("Yaa Asantewaa", "Mensah K.K", "ISB234GTD", BookCategory.HISTORY, BookState.AVAILABLE, BorrowedType.PREMIUM);



    Borrower kofi = new Borrower("Isaac", 1233, new Date(), Arrays.asList(book1));



    }
}

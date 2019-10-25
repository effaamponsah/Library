package io.turntabl.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Book book1 = new Book("Fire and Ice", "Kwame Atta", "ISB234HSE", BookCategory.FICTION,BookState.AVAILABLE, BorrowedType.GOLD);
   // Book book2 = new Book("Yaa Asantewaa", "Mensah K.K", "ISB234GTD", BookCategory.HISTORY, BookState.AVAILABLE, BorrowedType.PREMIUM);

        List<Book> books = Arrays.asList(
                new Book("Fire and Ice", "Kwame Atta", "ISB234HSE", BookCategory.COMIC,BookState.AVAILABLE),
                new Book("Jack and the beans Stock", "James Bond", "ISB234HSE", BookCategory.FICTION,BookState.AVAILABLE),
                new Book("Ugly Duckling", "Hammond", "ISB234HSE", BookCategory.COMIC,BookState.AVAILABLE),
                new Book("Ananse and the pot", "James", "ISB234HSE", BookCategory.HISTORY,BookState.AVAILABLE),
                new Book("James Bond", "Huang", "ISB234HSE", BookCategory.ADVENTURE,BookState.AVAILABLE),
                new Book("Pinnocuo", "Robert", "ISB234HSE", BookCategory.COMIC,BookState.AVAILABLE),
                new Book("Good God", "Arthur", "ISB234HSE", BookCategory.FICTION,BookState.AVAILABLE),
                new Book("90s Celebrity", "Shushu", "ISB234HSE", BookCategory.HISTORY,BookState.AVAILABLE),
                new Book("The internet and money", "Kwame Atta", "ISB234HSE", BookCategory.COMIC,BookState.AVAILABLE)
                );


    //Borrower kofi = new Borrower("Isaac", 1233, new Date(), Arrays.asList());


    //kofi.borrowBooks(Arrays.asList(book1));

  //  System.out.println(book1.getStatus());


        List<Borrower> borrowers = Arrays.asList(
                new Borrower("Shatta Wale", 1233, new Date(), Arrays.asList(), BorrowedType.GOLD),
                new Borrower("Asamoah Gyan", 1233, new Date(), Arrays.asList(), BorrowedType.SILVER),
                new Borrower("Wakasu", 1233, new Date(), Arrays.asList(), BorrowedType.PREMIUM),
                new Borrower("Isaac", 1233, new Date(), Arrays.asList(), BorrowedType.BRONZE),
                new Borrower("Sarkodie", 1233, new Date(), Arrays.asList(), BorrowedType.SILVER)
                );

        List<Book> comicBooks = new ArrayList<>();
        for ( Book comic: books ) {
            if ( comic.getCategory() == BookCategory.COMIC ) {
                comicBooks.add(comic);
            }
        }


        List<Borrower>  silverBorrowers = new ArrayList<>();
        for ( Borrower borrower: borrowers ) {
            if ( borrower.getBorrowerType() == BorrowedType.SILVER) {
                silverBorrowers.add(borrower);
            }
        }
    }

}

package com.javafirstpros;

import java.util.Scanner;

class Library
{
    String[] books ;
    int numbook;
    Library()
    {
        this.books= new String[10];
        this.numbook=0;
    }
    void addbook( String book)
    {
        books[numbook]=book;
        numbook++;
        System.out.println( book+ " has been added");
    }
    void availbook()
    {
        System.out.println("available books are :");
        for (int i=0; i<this.books.length;i++)
        {
            if(books[i]==null)
            {
                continue;
            }

            System.out.println(books[i]);
        }

    }
    void issuebook()
    {
        System.out.println("Enter book name(case specific) :");
        Scanner sc=new Scanner(System.in);
        String b= sc.next();
        for (int i=0; i<this.books.length;i++)
        {
            if(this.books[i].equals(b))
            { System.out.println("book has been issued");
                this.books[i]=null;
                return;}
        }
        System.out.println("book not found");
    }
    void returnbook()
    {
        System.out.println("Enter book name(case specific) :");
        Scanner sc=new Scanner(System.in);
        String bk= sc.next();
        System.out.println("Returning the book...");
        addbook(bk);
    }
}

public class Main {

    public static void main(String[] args) { System.out.println("***** Welcome to Library *****");
	Library lib=new Library();
	Scanner sc=new Scanner(System.in);


	 String cho="y";


	do{
        System.out.println("1. Add book in library");
        System.out.println("2. Show available books in library");
        System.out.println("3. Issue book from library");
        System.out.println("4. Return book in library");
        System.out.println("Enter your choice(1/2/3/4) :");
        int choice=sc.nextInt();
	switch (choice)
    {
        case 1:
            System.out.println("Enter book name:");
            String book= sc.next();
            lib.addbook(book);
            break;
        case 2:
            lib.availbook();
            break;
        case 3:
            lib.issuebook();
            break;
        case 4:
            lib.returnbook();
            break;
        default:
            System.out.println("wrong choice");
    }
        System.out.println("Do you want to continue(y/n) :");
	    cho=sc.next();

	}while(cho.equals("y"));
    }

}

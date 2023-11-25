/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package101;

public class Library {
   private Book book;
   private Librarian librarian;
   private Student student;
   private Journal journal;
   private Magazine magazine;

    public Library(Book book, Librarian librarian, Student student, Journal journal, Magazine magazine) {
        this.book = book;
        this.librarian = librarian;
        this.student = student;
        this.journal = journal;
        this.magazine = magazine;
    }

    public Library() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
   
   
   
}

package library.users;

public class Member extends User {
    private int borrowedBooks;

    public Member() {
        super();
        this.borrowedBooks = 0;
    }

    public Member(String name, String email) {
        super(name, email);
        this.borrowedBooks = 0;
    }

    @Override
    public String getRole() {
        return "Member";
    }

    public void borrowBook() {
        borrowedBooks++;
    }

    public void borrowBook(String title) {
        borrowedBooks++;
        System.out.println(name + " borrowed: " + title);
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }
} 
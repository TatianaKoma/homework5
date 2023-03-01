package jetBrainsTasks;

import java.util.Date;

public final class Book {

    private final String author;

    private final String name;
    private final int sold;
    private final Date issueDate;

    public Book(String name, String author, int sold, Date issueDate) {
        this.name = name;
        this.author = author;
        this.sold = sold;
        this.issueDate = issueDate;
    }

    public String getName() {
        return name;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public String getAuthor() {
        return author;
    }

    public int getSold() {
        return sold;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", sold=" + sold +
                ", issueDate=" + issueDate +
                '}';
    }
}
package jetBrainsTasks;

import java.time.Year;

//public static class Builder {
//    private final IsbnValidator isbnValidator = new IsbnValidator();
//    private final String isbn;
//    private final String title;
//    private String author;
//    private Year published;
//    private String description;
//
//    public Builder(String isbn, String title) {
//        this.isbn = isbn;
//        this.title = title;
//    }
//
//    public Builder author(String author) {
//        this.author = author;
//        return this;
//    }
//
//    public Builder published(Year published) {
//        this.published = published;
//        return this;
//    }
//
//    public Builder description(String description) {
//        this.description = description;
//        return this;
//    }
//
//    public Book build() throws IllegalStateException {
//        validate();
//        return new Book(this);
//    }
//
//    private void validate() throws IllegalStateException {
//        StringBuilder mb = new StringBuilder();
//        if (isbn == null) {
//            mb.append("ISBN must not be null.");
//        } else if (!isbnValidator.isValid(isbn)) {
//            mb.append("Invalid ISBN!");
//        }
//        if (title == null) {
//            mb.append("Title must not be null.");
//        } else if (title.length() < 2) {
//            mb.append("Title must have at least 2 characters.");
//        } else if (title.length() > 100) {
//            mb.append("Title cannot have more than 100 characters.");
//        }
//        if (author != null && author.length() > 50) {
//            mb.append("Author cannot have more than 50 characters.");
//        }
//        if (published != null && published.isAfter(Year.now())) {
//            mb.append("Year published cannot be greater than current year.");
//        }
//        if (description != null && description.length() > 500) {
//            mb.append("Description cannot have more than 500 characters.");
//        }
//        if (mb.length() > 0) {
//            throw new IllegalStateException(mb.toString());
//        }
//    }
//}

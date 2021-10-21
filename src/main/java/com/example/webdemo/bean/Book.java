package com.example.webdemo.bean;

public class Book {
    private int bookID;
    private String bookName;
    private String bookCounts;
    private String detail;

    public Book() {
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(String bookCounts) {
        this.bookCounts = bookCounts;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "解析对象KV:Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", bookCounts='" + bookCounts + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
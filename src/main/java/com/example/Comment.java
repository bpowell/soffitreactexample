package com.example;

public class Comment {
        String author;
        String comment;

        public Comment(String a, String c) {
                setAuthor(a);
                setComment(c);
        }

        public void setAuthor(String a) {
                author = a;
        }

        public void setComment(String c) {
                comment = c;
        }

        public String getAuthor() {
                return author;
        }

        public String getComment() {
                return comment;
        }
}

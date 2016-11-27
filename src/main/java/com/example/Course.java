package com.example;

public class Course {
        String title;
        String number;

        public Course(String t, String n) {
                setTitle(t);
                setNumber(n);
        }

        public void setTitle(String t) {
                title = t;
        }

        public void setNumber(String n) {
                number = n;
        }

        public String getTitle() {
                return title;
        }

        public String getNumber() {
                return number;
        }
}

package com.example.jelani.bookappfinal;

/**
 * Created by jelani on 12/9/17.
 */



    /**
     * An {@link Book} object contains information related to a single earthquake.
     */
    public class Book {



        /** Location of the earthquake */
        private String mTitle;

        /** Time of the earthquake */
        private String mAuthor;



        /**
         * Constructs a new {@link Book} object.
         *
         * @param title is the magnitude (size) of the earthquake
         * @param author is the location where the earthquake happened
         */
        public Book( String title, String author) {
            mTitle = title;
            mAuthor = author;

        }

        public String getmTitle() {
            return mTitle;
        }

        public String getmAuthor() {
            return mAuthor;
        }
    }





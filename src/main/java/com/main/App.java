package com.main;

import java.io.IOException;
import java.sql.SQLException;

import org.jsoup.Jsoup;

public class App {

    public static void main(String[] args) throws SQLException, IOException {
        // TODO Auto-generated method stub

        processPage("https://www.amfiindia.com/modules/NAVList");
    }

    public static void processPage(String URL) throws SQLException, IOException {

        // check if the given URL is already in database

        // get useful information

        String json = Jsoup.connect(URL).ignoreContentType(true).execute().body();

        // get all links and recursively call the processPage method
        System.out.println(json);

    }

}

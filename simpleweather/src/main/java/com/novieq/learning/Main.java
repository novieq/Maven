package com.novieq.learning;

import java.io.InputStream;

import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String[] args) throws Exception {
        // Configure Log4J
        BasicConfigurator.configure();
        
        // Read the Zip Code from the Command-line (if none supplied, use - 60202)
        String zipcode = "60202";
        try {
            zipcode = args[0];
        } catch (Exception e) {
        }
        // Start the program
        new Main(zipcode).start();
    }

    private String zip;

    public Main(String zip) {
        this.zip = zip;
    }

    public void start() throws Exception {
        // Retrieve Data
        InputStream dataIn = new YahooRetriever().retrieve(zip);
        // Parse Data
        Weather weather = new YahooParser().parse(dataIn);
        // Format (Print) Data
        System.out.print(new WeatherFormatter().format(weather));
    }
}
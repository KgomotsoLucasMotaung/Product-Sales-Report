/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;
/**
 *
 * @author RC_Student_Lab
 */

public class ProductSalesReport {
    public static void main(String[] args) {
        // Sample product sales data: 2 years, 4 quarters each
        // Year 1 (2023): Q1, Q2, Q3, Q4
        // Year 2 (2024): Q1, Q2, Q3, Q4
        // Note: Replace with actual data from the provided table if available
        double[][] sales = {
            {100.0, 150.0, 200.0, 250.0},  // Year 1
            {120.0, 160.0, 210.0, 260.0}   // Year 2
        };

        // Creates the  ProductSales instance to perform calculations for every variable
        ProductSales productSales = new ProductSales();

        // Calculate statistics using the ProductSales methods
        double total = productSales.calculateTotal(sales);
        double average = productSales.calculateAverage(sales);
        double maximum = productSales.calculateMaximum(sales);
        double minimum = productSales.calculateMinimum(sales);

        // Prints the report header and gives output
        System.out.println("Product Sales Report - 2023-2024");
        System.out.println("=================================");
        
        // Prints the table header with column labels within
        System.out.printf("%-6s %-8s %-8s %-8s %-8s%n", "Year", "Q1", "Q2", "Q3", "Q4");
        System.out.println("---------------------------------");
        
        // Prints the table rows: Iterate through years and quarters to display data
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-6d ", (2023 + i));  // Year label (starts at 2023)
            for (double quarter : sales[i]) {
                System.out.printf("%-8.2f ", quarter);  // Format each quarter value
            }
            System.out.println();  // New line after each year
        }
        
        System.out.println("=================================");
        // Print calculated statistics
        System.out.printf("Total Sales: %.2f%n", total);
        System.out.printf("Average Sales: %.2f%n", average);
        System.out.printf("Maximum Sales: %.2f%n", maximum);
        System.out.printf("Minimum Sales: %.2f%n", minimum);
    }
}  
/**
 * Main application class to generate and print a product sales report.
 * Uses a 2D array for sales data and delegates calculations to ProductSales.
 * Assumes 2 years with 4 quarters each; update the 'sales' array with real data if needed.
 NB this is for public class product sales report , explaining outline of my public class 
 */
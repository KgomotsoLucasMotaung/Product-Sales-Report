/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author RC_Student_Lab
 */
public class ProductSales implements IProductSales {

 
    public double calculateTotal(double[][] sales) {
        double total = 0.0;
        // Iterate through each year (row) and each quarter (column) to sum all values
        for (double[] year : sales) {
            for (double quarter : year) {
                total += quarter;
            }
        }
        return total;
    }/**
 * Implementation of IProductSales for calculating product sales statistics.
 * This class processes a 2D array of sales data (years as rows, quarters as columns).
 */


    public double calculateAverage(double[][] sales) {
        int totalQuarters = 0;
        // Count total quarters across all years to calculate average
        for (double[] year : sales) {
            totalQuarters += year.length;
        }
        // Avoid division by zero; return 0 if no quarters
        return totalQuarters > 0 ? calculateTotal(sales) / totalQuarters : 0.0;
    }

   
    public double calculateMaximum(double[][] sales) {
        double max = Double.MIN_VALUE;
        // Iterate to find the highest value; initialize to smallest possible double
        for (double[] year : sales) {
            for (double quarter : year) {
                if (quarter > max) {
                    max = quarter;
                }
            }
        }
        return max;
    }


    public double calculateMinimum(double[][] sales) {
        double min = Double.MAX_VALUE;
        // Iterate to find the lowest value; initialize to largest possible double
        for (double[] year : sales) {
            for (double quarter : year) {
                if (quarter < min) {
                    min = quarter;
                }
            }
        }
        return min;
    }
}
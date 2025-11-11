/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author RC_Student_Lab
 */
public interface IProductSales {
/**
 * Interface defining methods for calculating product sales statistics.
 * Implementations should handle 2D arrays representing sales data (e.g., years as rows, quarters as columns).
 */
    /**
     * Calculates the total sales across all years and quarters.
     * @param sales A 2D array where each sub-array represents a year's quarterly sales.
     * @return The sum of all sales values.
     */
    double calculateTotal(double[][] sales);
   /**
    * Calculates the average sales per quarter across all years and quarters.
   * @param sales A 2D array where each sub-array represents a year's quarterly sales.
    * @return The average sales value, or 0.0 if no data is present.
     */
    double calculateAverage(double[][] sales);
    /**
     * Finds the maximum sales value across all years and quarters.
   * @param sales A 2D array where each sub-array represents a year's quarterly sales.
   * @return The highest sales value, or Double.MIN_VALUE if no data is present.
     */
    double calculateMaximum(double[][] sales);
/**  * Finds the minimum sales value across all years and quarters.
  * @param sales A 2D array where each sub-array represents a year's quarterly sales.
  * @return The lowest sales value, or Double.MAX_VALUE if no data is present.
 */
    double calculateMinimum(double[][] sales);
}
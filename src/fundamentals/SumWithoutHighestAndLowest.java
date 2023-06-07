package fundamentals;

import java.util.ArrayList;
import java.util.List;

/*
 * 
Kata: https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java

Task
Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
Mind the input validation.

Example
{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6

Input validation
If an empty value ( null, None, Nothing etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.
 
 * 
 */

public class SumWithoutHighestAndLowest {
  
  public static int sum(int[] numbers) {
    int sum = 0;

    for(int i = 0; i < numbers.length; i++) {
      int highest = 0;
      int lowest = Integer.MAX_VALUE;

      for(int j = 0; j < numbers.length; j++) {
        if(numbers[j] > highest) {
          highest = numbers[j];
        }

        if(numbers[j] < lowest) {
          lowest = numbers[j];
        }
      }

      if(numbers[i] != lowest && numbers[i] != highest) {
        sum += numbers[i];
      }
    }


    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(new int[] { 4, 18, 3, 10}));
  }
}

package com.io.codingBats;

/**
 * @author Shad Ahmad
 * Questions: The parameter weekday is true if it is a weekday,
 * and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 * Conclusion should be like this
 * sleepIn(false, false) → true
 * sleepIn(true, false) → false
 * sleepIn(false, true) → true
 */

public class SleepIn {
  public static boolean sleepIn(boolean weekday,boolean vacation){
      if (!weekday || vacation){
          return true;
      }
      return false;
  }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));



    }


}

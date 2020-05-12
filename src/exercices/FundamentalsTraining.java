public class FundamentalsTraining {

    /******************************************
     * @param value, eg: 2
     * @return the same value, eg: 2
     */
    public static int sameValue(int value) {
        return value;
    }
    
    /******************************************
    //  * @param value, eg: 2
    //  * @return one added to the value, eg: 3
    //  */
    public static int addOne(int value) {
        return value + 1;
    }

    // /******************************************
    //  * @param first, eg: 2
    //  * @param second, eg: 3
    //  * @return first added to second, eg: 5
    //  */
    public static int addValues(int first, int second) {
        return first + second;
    }

    // /****************************************** 
    //  * @param value, eg: 11
    //  * @return true if value superior to 10, eg: true
    //  */
    public static boolean isValueSuperiorToTen(int value) {
        if (value > 10) {
            return true;
          } else {
            return false;
          }
    }

    // /******************************************
    //  * @param value, eg: -1
    //  * @return true if value inferior or equals to 0, eg: true
    //  */
    public static boolean isValueZeroOrNegative(int value) {
        if (value <= 0) {
            return true;
          } else {
            return false;
          }
    }

    // /******************************************
    //  * @param first, eg: 1
    //  * @param second, eg: 1
    //  * @return true if first equals second, eg: true
    //  */
    public static boolean areValuesEquals(int first, int second) {
        if (first == second) {
            return true;
          } else {
            return false;
          }
    }

    // /******************************************
    //  * @param first, eg: 2
    //  * @param second, eg: 1
    //  * @return true if first is superior to second, eg: true
    //  */
    public static boolean isFirstSuperiorToSecond(int first, int second) {
       if (first > second) {
            return true;
          } else {
            return false;
          }
    }  

    // /******************************************                 
    //  * @param value, eg: 2
    //  * @return true if value is even, eg: true
    //  */
    public static boolean isValueEven(int value) {
        if (value % 2 == 0) {
            return true;
          } else {
            return false;
          }
    }

    // /******************************************          
    //  * @param value, eg: 3
    //  * @return true if value is odd, eg: true
    //  */
    public static boolean isValueOdd(int value) {
        if (value % 2 != 0) {
            return true;
          } else {
            return false;
          }
    }

    // /******************************************                
    //  * @param value, eg: 6
    //  * @param divider, eg: 3
    //  * @return true if value can be divided by divider, eg: true
    //  */
    public static boolean canValueBeDivided(int value, int divider) {
        if (value % divider == 0) {
            return true;
          } else {
            return false;
          }
          }

    // /******************************************
    //  * @param value, eg: true
    //  * @return the string "true" if value is true, the string "false" otherwise,
    //  * eg: "true"
    //  */
    public static String trueOrFalse(boolean value) {
        if (value == true) {
            return "true";
          } else {
            return "false";
          }
    }

    // /******************************************
    //  * @param value, eg: 1
    //  * @return the string "one" if value is 1, the string "zero" if value is 0,
    //  *  the string "other" otherwise, eg: "one"
    //  */
    public static String zeroOrOneOrOther(int value) {
       if (value == 1) {
            return "one";
          } else if (value == 0)
            return "zero";
           else {
            return "other";
          }
        }

    // /******************************************
    //  * @param first, eg: 1
    //  * @param second, eg: 1
    //  * @return the string "inferior" if first is inferior to second,
    //  * the string "superior" if first is superior to second,
    //  * the string "equals" otherwise, eg: "equals"
    //  */
    public static String inferiorOrSuperiorOrEquals(int first, int second) {
        if (first < second) {
            return "inferior";
          } else if (first > second)
            return "superior";
           else {
            return "equals";
          }
    }

    // /******************************************                     A REVOIR !! 
    //  * @param first, eg: 4
    //  * @param second, eg: 3
    //  * @return first plus second if first inferior to second,
    //  * first minus second if first superior or equals to second, eg: 1
    //  */
    // public static int addIfInferiorSubstractIfSuperiorOrEquals(int first, int second) {
    //     if (first < second) {
    //         return first + second;
    //       } else if (first >= second)
    //       return second - first;
    // }
    
    //  public static void main(String[] args) {
    //      System.out.println(FundamentalsTraining.addIfInferiorSubstractIfSuperiorOrEquals(4, 3));
    // }

    // /******************************************                    A REVOIR !!
    //  * @param first, eg: true
    //  * @param second, eg: false
    //  * @return true if first and second value is true, eg: false
    //  */
    // public static boolean firstAndSecond(boolean first, boolean second) {
    //     // if (first = true) && (second = true) {
    //     //     return "true";
    //     //   } else {
    //         return false;
    //     //   }
    // }
    // //   public static void main(String[] args) {
    // //      System.out.println(FundamentalsTraining.firstAndSecond(true, false));
    // // }

    // /******************************************
    //  * @param first, eg: false
    //  * @param second, eg: false
    //  * @return true if first and second value are equals, eg: true
    //  */
    public static boolean booleanEquals(boolean first, boolean second) {
        if (first == second) {
            return true;
          } else {
            return false;
          }
    }

    // /******************************************        A REVOIR
    //  * @param value, eg: true
    //  * @return false if value is true, true otherwise, eg: false
    //  */
    // public static boolean notValue(boolean value) {
    //     if (value = true) {
    //         return false;
    //       } else {
    //         return true;
    //       }
    // }

    // /******************************************                
    //  * @param first, eg: 4
    //  * @param second, eg: 3
    //  * @param isNotFirst, eg: false
    //  * @return first value if isNotFirst is false, second value otherwise, eg: 4
    //  */
    public static int whichValueIsThis(int first, int second, boolean isNotFirst) {
        if (isNotFirst = false) {
            return  first;
          } else {
            return second;
          }
    }
}

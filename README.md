# Java-Lab-002

## Variables, Types and Operators

Be able to explain what variables are. Understand variable types, allowed names, and valid values.
Know how to create and use string, integer, floating-point, and boolean variables.

### Part 1 - PricelessScript.java - [MasterCard YouTube Ad](https://www.youtube.com/watch?v=Q_6stXKGuHo)

The lab template contains a program that prints the following:
```
2 tickets: $28.00
2 hotdogs, 2 popcorn, 2 sodas: $18.00
1 autographed baseball $45.00
real conversation with 11 year old son: priceless
true
```

Ignore the code that you don't fully recognize and concentrate on changing the variables to alter the MasterCard *Priceless* script to say:
```
3 tickets: $42.00
3 hotdogs, 3 popcorn, 3 sodas: $27.00
2 autographed baseball $90.00
watching the Giants win: priceless
false
```

### Part 2 - Interpretation
Take note of the various variables and their data types. Write a brief summary in this section of the README.md file listing the:
* Variable name 
* Its data type
* and example values you can assign them.
* 
*   Variable name         Data Type      Example
  * scriptTemplateLine1   String         "This is example 1"
  * scriptTemplateLine2   String         "Something in" + " quotes"
  * scriptTemplateLine3   String         "You can add lines \n"
  * scriptTemplateLine4   String         "and other data types like the number of people = " + people
  * priceless             String         "yet another string, something enclosed in quotes"
  * people                integer        whole numbers such as 1 or 784
  * ticketPrice           float          fractions of numbers such as .1234 or 1.0 but accuracy is less than double
  * itemPrice             double         double increases the accuracy of your fractional numbers....by double
  * trueorFalse           boolean        This only returns, yes/no, true/false, 1/0 style of returns

Next give TWO example variable names and TWO example variable assignments that are *WRONG* and explain why.

Variable name    Date type   Incorrect assignment      Reason
* FirstName      String      Roger                     The assignment needs to be in quotes because it is a string, also the first
                                                       letter of the Variable name is capitalized, not good etiquette
* number         int         "123"                     This is the opposite situation, there are no quotes around integers
* trueFalse      boolean     "True"                    This will not work due to the quotes around the word true


* Hint: your IDE can help you discover these!

### Part 3 - Bonus: Play around with Java String Format Specifiers.

Pick several of the Java format specifiers below and define variables of the correct type utilize *sout* and *String.format* to view the resulting formats.

I'm not sure if you wanted the code in here for some reason but, just in case.

        System.out.println(trueOrFalse);
        String Test = "%nThis string shows how to use a floating point with only two digits after the decimal for money: $%.2f instead of the normal %s";
        String one= "six zeros!";
        double numberofTimes = 3;
        System.out.println(String.format(Test, numberofTimes, one));


![Format Specifiers](JavaStringFormatSpecifiers.png)

### Part 4 - Submission
* Just as you did last week (Reference the Lab video in your Week 1 module), create a Spring2023 feature branch of your code
* Commit your working code to your local copy
* Push it to your Remote/origin branch (i.e. GitHub: Spring2023 -> origin/Spring2023)
* Then issue a Pull request to my instructor branch
    * Make sure to save the Pull request URL and submit it for the lab.

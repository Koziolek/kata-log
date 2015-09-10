# Debug kata

This kata is for people who would like to learn basic of debugging.

## Description 

Most important element of this kata is to learn your debug tool. This is more for learning session not common kata. 
If you work in group be sure that sensei know the tool that you would like to learn. This kata based on small and 
simple application that contains two bugs. You should run debug session to discover it. Please do not write unit test
because if you do this there be no fun.     

Application rules

 * you could create and attach to bank client of any age.
 * only adult client could has accounts. 
 
## Focus

You could focus on:

 * learn new debugger in your IDE.
 * learn how to debug. 
  
Second option is prepared for teachers who looking for simples example of debugging. 
 
## Flow

Compile project and run `DebugKata` class.
 
### Part 1  
 
 * point first bug - Anna Nabokova is not adult but we can create account for she (exception - you do this kata at last
  day of year, implementation of count birth date of Anna is very naive, please don't blame me for that).
 * set breakpoint in line 31 in class `DebugKata` and run debug session
 * use `step into` method `Bank.registerNewAccountFor`
 * use `step over` to go through condition that check age; should not throw `TooYoungClientException`
 * use `drop the frame` feature to step back to line 30 in class `DebugKata` (if your tool has it)
    * if your tool don't have this type of feature just restart the session.
 * when you will be in line with `if` then go into `Client.isAdult` method. 
 * use `evaluate expression` feature to check return of `Age.isAdult` 
 * then step into this method and uncomment proper code versions.
 
In this part you learned about basic elements of debugger. 
 
### Part 1b - group only 

This part isn't kata but randori form. Students should try by thyself resolve bug. Sensei 
should only control proper 
way of using debuger.
 
 * point second bug - compare two prints of bank `report` calls - balance of account of Jan Kowalski, 
 `janKowalskiAcc1`, didn't change after call `recognition` method.
 * set breakpoint at line 34 in `DebugKata` and run debug session
 * use `step into` and try to identify reason of bug. Do you see any other problems in class `Account`?
  
### Part 2

In this part we learn stack trace analysis with debugger. This part is dedicated for teachers to discus elements of 
debugger window and features like setting values "on the fly". If you do this alone it is good moment to make small 
experiments with buttons ;) 
  
  * run `DebugKata2` class. You should get `UnsupportedOperationException`.
  * _optional_ discus structure of stack trace.
  * set method breakpoint at `Client.registerAccount` and run debug session. 
  * use `Resume` until `client` is set to Jerzy Nowak.
  * expand variables tree and find value of `client.accounts`. 
  * using stack frames list jump (step by step) to `main` method and discus changes in variables window.
  * return to `registerAccount` frame and `client.accounts` value.
  * change value of `client.accounts` to `java.util.TreeSet`. Discus why you use full qualified class name (look at 
  imports).
  * resume session.
  

  
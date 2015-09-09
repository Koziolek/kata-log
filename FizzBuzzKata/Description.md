# FizzBuzz Kata 

This is simplest kata. You should start from it.

## Description

`FizzBuzz` is a simple class that:

 * has one public method `fizzBuzz(int):String`
 * if parameter is dividable by 3 return Fizz
 * if parameter is dividable by 5 return Buzz
 * if parameter is dividable by 3 and 5 return FizzBuzz
 * otherwise return parameter as string.
 
Your application should print result for number from 1 to 100. 

## Focus 

You should focus on one of:

 * IDE work (key shortcuts, flow of work, basic project setup)
 * TDD methodology in your favorite framework
 * Introduce of new tool eg. new test framework

That last option is only for more experienced developers who would like to develop they skills in usage of new framework.

## Flow

This kata has quite short set of steps. Some of them are repeating few times with different set of parameters or conditions.   

 * Create class `FizzBuzz` and empty method `fizzBuzz(int):String` that return `null`
 * Create test class `FizzBuzzTest` with `setup` method 
 * Create first test `shouldReturnFizzFor3`
 * Run it (red)
 * Add implementation to satisfy test
 * Run test (green)
 * Create second test `shouldReturnBuzzFor5`
 * Run it (red)
 * Add implementation to satisfy test
 * Run test (green)
 * Create third test `shouldReturnFizzBuzzFor0`
 * Run it (red)
 * Add implementation to satisfy test
 * Run test (green)
 * Create fourth test `shouldReturn1For1`
 * Run it (red)
 * Add implementation to satisfy test
 * Run test (green)

This is end of part one of this kata. Ww have application that satisfy all conditions. Sensei could order 
continuation of work and focus on selected cases. Basic paths is to add more tests, split method to smaller ones or 
use some features from framework.
 
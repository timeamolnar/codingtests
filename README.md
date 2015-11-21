# Repository for Coding Tests 

**FizzBuzzBasic :**
Write some code that prints out the following for a contiguous range of numbers:

* the number
* 'fizz' for numbers that are multiples of 3
* 'buzz' for numbers that are multiples of 5
* 'fizzbuzz' for numbers that are multiples of 15

e.g. if I run the program over a range from 1-20 I should get the following output:


```
#!console

1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz

```

**IntegerToRomanNumeral :**

Convert Integer to Roman Numeral using TDD

Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately, starting with the left most digit and skipping any digit with a value of zero.

In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 

2008 is written as 2000=MM, 8=VIII; or MMVIII. 

1666 uses each Roman symbol in descending order: MDCLXVI.


**RomanNumeralToInteger :**

Convert Roman Numeral to Integer using TDD

**List::range :**

Create a list containing all integers within a given range.
range(4, 9) -> List(4, 5, 6, 7, 8, 9)

**List::rotate**

rotate(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
result: List[Symbol] = List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c')

-3 should work

**FizzBuzzWithLucky:**

Enhance your existing FizzBuzz solution to perform the following:

* If the number contains a three you must output the text 'lucky'. This overrides any existing  behaviour

e.g. if I run the program over a range from 1-20 I should get the following output


```

1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz

```

**FizzBuzzWithLuckyAndStat:**

Enhance your existing solution to perform the following:

* Produce a report at the end of the program showing how many times the following were output

** fizz

** buzz

** fizzbuzz

** lucky

** an integer

e.g. if I run the program over a range from 1-20 I should get the following output


```
#!console

1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz
fizz: 4
buzz: 3
fizzbuzz: 1
lucky: 2
integer: 10
```
(Integer is 10 because there were 10 numbers that were not altered in any way).

rotate(-2, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
result: List('j', 'k', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i')

**Incremental Search**

![incremental search design](/docs/incsearch.png "incremental search design")

Algorithm:
  the stack is filled with indexlists. Initially all of the options moved to the stack as an indexlist
  if a new character is arrived (not bspace), we check only those options which were part of the last resultIndexList,
  and check the nth character, depends on the number of the character arrived
  we create a new indexResultList and put it into stack, and return a converted list
  if backspace arrives: if the searchAttr is empty then do nothing, just return with all the possibilities (0th element in the stack)
  if searchAttr not empty, then remove the last char, remove the last Stack element, return the one before
  


**


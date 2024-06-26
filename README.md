# Roman Numeral Converter
This program is a terminal-based converter to and from Roman numerals developed for the BYU OIT Coding Challenge. 

## Installation
1. Install [Java JDK](https://docs.oracle.com/en/java/javase/21/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA)(version 20 or higher).
2. Download (or clone repository) the RomanNumerals.jar file from out/artifacts folder.

## Usage
Run this command in the terminal: `java -jar RomanNumerals.jar` (make sure to be in the directory that contains the repository or the RomanNumerals.jar file)

## Documentation
The documents that contain my thought process to solve this challenge are contained in 2 files in the Documentation folder. The .pdf file contains details regarding the structure of the classes, the Roman numerals rules my converter needed to follow, and other details and tasks. The .xlsx file was used to think about the problem before solving it and understanding the algorithm I was to develop, considering the rules to follow.

## Features
1. Conversion from decimal numbers to Roman numerals.
2. Conversion from Roman numerals to decimal numbers.
3. Unit-tested using JUnit. 
4. Support for a range of input values.
5. Color formatting in the terminal to enhance the user experience.
6. Error handling for invalid input:
   * Decimal input only between 1 and 3999.
   * Subtractive notation only ever involves two symbols.
   * A symbol can be repeated only three times.
   * The symbols V, L, and D are never before a symbol of higher value.
   * Symbol I can be subtracted from V and X only.
   * Symbol X can be subtracted from symbols L and C only.

## Example

1. Running the program:
   ![image](https://github.com/maxiparis/RomanNumerals/assets/127634681/47aeb786-5433-45e4-b9f7-e154b0886f4d)
2. Converting to a roman numeral
   ![image](https://github.com/maxiparis/RomanNumerals/assets/127634681/5303b8af-0f4f-4009-98a1-6e0e97553f6b)
3. Converting to a decimal number
   ![image](https://github.com/maxiparis/RomanNumerals/assets/127634681/c4710c94-e46c-4141-abdf-627756f922e0)


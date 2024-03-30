# Roman Numeral Converter

## Installation
1. Install Java JDK (version 20)
2. Download (or clone repository) the RomanNumerals.jar file from out/artifacts folder.

## Usage
Run this command in the terminal: `java -jar RomanNumerals.jar` (make sure to be in the directory that contains the repository or the RomanNumerals.jar file)

## Documentation
The process of solving this challenge is contained in 2 files in the Documentation folder. The .pdf file contains details regarding the structure of the classes, the roman numerals rules my converter needed to follow, etc. The .xlsx file was used to think about the problem before solving it and understanding the algorithm I was to develop. 

## Features
1. Conversion from decimal numbers to Roman numerals.
2. Conversion from Roman numerals to decimal numbers.
3. Support for a range of input values.
4. Color formatting in the terminal to enhance the user experience.
5. Error handling for invalid input:
   * Decimal input only between 1 and 3999.
   * Subtractive notation only ever involves two symbols.
   * A symbol can be repeated only for three times.
   * The symbols V, L, and D are never before a symbol of higher value.
   * Symbol I can be subtracted from V and X only.
   * Symbol X can be subtracted from symbols L and C only.

## Example

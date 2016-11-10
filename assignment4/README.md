## Assignment 4
DNA Substrings from CodeFights.com

You are given a DNA sequence: a string that contains only characters 'A', 'C', 'G', and 'T'. Your task is to calculate the number of substrings of sequence, in which each of the symbols appear the same number of times.

Example 1: For sequence = "ACGTACGT", the output should be 6. All substrings of length 4 contain each symbol exactly once (+5), and the whole sequence contains each symbol twice (+1).

Example 2: For sequence = "AAACCGGTTT", the output should be 1. Only substring "AACCGGTT" satisfies the criterion above: it contains each symbol twice.

Input: String, a sequence that consists only of symbols 'A', 'C', 'G', and 'T'. Length constraint: 0 < sequence.length < 100000.

Output: Integer, the number of substrings where each symbol appears equally many times.
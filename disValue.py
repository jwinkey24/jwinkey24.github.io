# -*- coding: utf-8 -*-
"""
Created on Wed Feb 12 13:24:02 2025

@author: burneyc8317
"""
import uniqueFile
def dis_results(numList, wordList):
    print()
    print("Original Number list:", numList)
    print("\nList without duplicates:", uniqueFile.unique(numList))
    print()

    print("Original Word list:", wordList)
    print("\nList without duplicates:", uniqueFile.unique(wordList))
    print()
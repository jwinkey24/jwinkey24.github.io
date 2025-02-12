# -*- coding: utf-8 -*-
"""
Created on Wed Feb 12 13:25:28 2025

@author: burneyc8317
"""

def unique(values):
    newValues = []
    for x in values:
        if x not in newValues:
            newValues.append(x)
    return newValues
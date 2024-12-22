# Kotlin MutableMap removeIf Bug

This repository demonstrates a subtle bug related to the `removeIf` function when used with `MutableMap` in Kotlin. The issue arises because `removeIf` modifies the map while iterating over it, potentially leading to elements being skipped.

## Problem Description
The `removeIf` function, when applied to a `MutableMap`, iterates through the map and removes elements based on a predicate.  However, when an element is removed, the iterator's state is affected, which can cause the iteration to skip subsequent elements. This isn't immediately obvious and is a common pitfall.

## Reproducing the Bug
The `BuggyRemoveIf.kt` file contains code that reproduces this problem.  Run the code and observe that the output differs from what one might intuitively expect.
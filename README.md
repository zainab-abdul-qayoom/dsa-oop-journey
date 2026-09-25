# DSA + OOP Roadmap
One combined plan — do each DSA topic, then the paired OOP topic, in order.

## How to Use
- Follow the order below. Don't skip ahead.
- For every topic: watch/read the concept once, then immediately solve the listed problems.
- Stuck 25–30 min? Look at the *approach* only, not the full code, then retry yourself.
- Move to the next step only once you can solve ~70% of a topic's problems without hints.

---

## Phase 0: Java Foundations Needed for DSA + 1. Time & Space Complexity → then OOP 1: Core Pillars

**DSA:**
- [✅] Arrays and multi-dimensional arrays
- [✅] Strings and StringBuilder
- [✅] Functions/methods, pass by value
- [✅] Basic recursion (factorial, Fibonacci)
- [✅] ArrayList, HashMap, HashSet basics
- [✅] Scanner/BufferedReader for input
- [ ] Big-O, Big-Omega, Big-Theta
- [ ] Best/worst/average case
- [ ] Analyzing loops and recursion complexity
- [ ] Space complexity of recursive calls

**Resources:** [Java Collections crash course](https://www.youtube.com/watch?v=rRi9VmcRs8Y) · [Kunal Kushwaha Java Playlist](https://www.youtube.com/playlist?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ) · [Striver Complexity video](https://www.youtube.com/watch?v=FPu9Uld7W-E) · [takeUforward A2Z Sheet](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2)

**Practice (GfG quizzes):**
- [ ] Time complexity of 5 given code snippets
- [ ] Analyze complexity of nested loops (own code)
- [ ] Recursive Fibonacci vs iterative
- [ ] Complexity of binary search
- [ ] Complexity of common sorting algorithms (theory)

**➡ Now do OOP 1: Core Pillars**
- [ ] Class vs Object
- [ ] Encapsulation (private fields + getters/setters)
- [ ] Inheritance (extends, super keyword)
- [ ] Polymorphism (overloading vs overriding)
- [ ] Abstraction (abstract classes vs interfaces)

**Resources:** [Kunal Kushwaha OOP Playlist](https://www.youtube.com/playlist?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ) · [GfG OOP in Java](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)

**Practice (write & run locally):**
- [ ] Bank Account class with encapsulation
- [ ] Shape hierarchy (Shape → Circle, Square) using inheritance
- [ ] Overload a method 3 different ways
- [ ] Override toString() and equals()
- [ ] Payable interface implemented by Employee and Freelancer
- [ ] Abstract class vs interface (written explanation)
- [ ] Animal → Dog/Cat polymorphism with speak()

---

## 2. Arrays → then OOP 2: Constructors & Keywords

**DSA:**
- [ ] Traversal, insertion, deletion
- [ ] Two-pointer technique
- [ ] Sliding window
- [ ] Prefix sum
- [ ] Kadane's algorithm
- [ ] Sorting basics (bubble, selection, insertion — theory)

**Resources:** [Striver Array Sheet](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2) · [NeetCode Arrays & Hashing](https://neetcode.io/roadmap)

**Practice (LeetCode):**
- [ ] Two Sum
- [ ] Best Time to Buy and Sell Stock
- [ ] Maximum Subarray (Kadane's)
- [ ] Move Zeroes
- [ ] Majority Element
- [ ] Rotate Array
- [ ] Product of Array Except Self
- [ ] Merge Intervals
- [ ] Next Permutation
- [ ] Trapping Rain Water
- [ ] 3Sum
- [ ] Set Matrix Zeroes
- [ ] Subarray Sum Equals K
- [ ] Container With Most Water
- [ ] Find the Duplicate Number

**➡ Now do OOP 2: Constructors & Keywords**
- [ ] Default vs parameterized constructors
- [ ] Constructor overloading
- [ ] this vs super
- [ ] static keyword (variables, methods, blocks)
- [ ] final keyword

**Resources:** [GfG Constructors in Java](https://www.geeksforgeeks.org/constructors-in-java/)

**Practice (write & run locally):**
- [ ] Class with 3 overloaded constructors
- [ ] Use 'this' to resolve naming conflict
- [ ] Use 'super' to call parent constructor
- [ ] Static counter tracking objects created
- [ ] Why is main() static? (written)

---

## 3. Searching & Sorting → then OOP 3: Exception Handling

**DSA:**
- [ ] Binary search + variations (first/last occurrence, rotated array)
- [ ] Merge sort, quick sort (understand + code once)
- [ ] Binary search on answer technique

**Resources:** [Striver Binary Search Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0rABuVEXm9wm57xVfQDcU3n)

**Practice (LeetCode + GfG):**
- [ ] Binary Search
- [ ] Search in Rotated Sorted Array
- [ ] Find First and Last Position of Element
- [ ] Search a 2D Matrix
- [ ] Koko Eating Bananas
- [ ] Find Peak Element
- [ ] Median of Two Sorted Arrays
- [ ] Sort Colors
- [ ] Kth Largest Element in an Array
- [ ] Aggressive Cows (GfG)

**➡ Now do OOP 3: Exception Handling**
- [ ] try-catch-finally
- [ ] Checked vs unchecked exceptions
- [ ] Custom exceptions
- [ ] throw vs throws

**Resources:** [GfG Exception Handling](https://www.geeksforgeeks.org/exceptions-in-java/)

**Practice (write & run locally):**
- [ ] Handle ArithmeticException in a division method
- [ ] Custom InvalidAgeException
- [ ] Method throwing checked exception, handled in caller
- [ ] Use finally to close a resource
- [ ] Multi-catch handling 2 exception types

---

## 4. Strings → then OOP 4: File Handling

**DSA:**
- [ ] Basic string manipulation
- [ ] Pattern matching intuition
- [ ] Anagrams, palindromes
- [ ] String + hashmap combination problems

**Resources:** [Striver String Sheet](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2)

**Practice (LeetCode):**
- [ ] Valid Anagram
- [ ] Valid Palindrome
- [ ] Longest Palindromic Substring
- [ ] Group Anagrams
- [ ] Longest Common Prefix
- [ ] Reverse Words in a String
- [ ] String Compression
- [ ] Implement strStr()
- [ ] Valid Parentheses
- [ ] Count and Say

**➡ Now do OOP 4: File Handling**
- [ ] Reading a file with BufferedReader/Scanner
- [ ] Writing to a file with FileWriter
- [ ] try-with-resources

**Resources:** [GfG File Handling](https://www.geeksforgeeks.org/file-handling-in-java/)

**Practice (write & run locally):**
- [ ] Read a text file and print each line
- [ ] Write user input to a file
- [ ] Append to an existing file
- [ ] Count number of words in a file

---

## 5. Recursion & Backtracking → then OOP 5: Java Collections Framework

**DSA:**
- [ ] Recursion tree/stack thinking
- [ ] Base case design
- [ ] Subsets/permutations pattern
- [ ] Backtracking with pruning (N-Queens style)

**Resources:** [Striver Recursion Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9)

**Practice (LeetCode):**
- [ ] Subsets
- [ ] Subsets II
- [ ] Permutations
- [ ] Combination Sum
- [ ] Combination Sum II
- [ ] Word Search
- [ ] N-Queens
- [ ] Sudoku Solver
- [ ] Palindrome Partitioning
- [ ] Letter Combinations of a Phone Number
- [ ] Generate Parentheses

**➡ Now do OOP 5: Java Collections Framework**
- [ ] List (ArrayList, LinkedList)
- [ ] Set (HashSet, TreeSet)
- [ ] Map (HashMap, TreeMap)
- [ ] Iterator
- [ ] Comparable vs Comparator

**Resources:** [Java Collections crash course](https://www.youtube.com/watch?v=rRi9VmcRs8Y)

**Practice (write & run locally):**
- [ ] Sort list of Student objects by marks (Comparable)
- [ ] Sort same list by name (Comparator)
- [ ] Remove duplicates using HashSet
- [ ] Word frequency using HashMap
- [ ] Iterate a Map using entrySet()

---

## 6. Linked List → then OOP 6: Design Basics (SOLID)

**DSA:**
- [ ] Singly, doubly, circular linked list
- [ ] Fast & slow pointer (cycle detection)
- [ ] Reversal (iterative + recursive)
- [ ] Merge two lists

**Resources:** [Striver Linked List Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk)

**Practice (LeetCode):**
- [ ] Reverse Linked List
- [ ] Linked List Cycle
- [ ] Merge Two Sorted Lists
- [ ] Remove Nth Node From End of List
- [ ] Reorder List
- [ ] Add Two Numbers
- [ ] Copy List with Random Pointer
- [ ] LRU Cache
- [ ] Palindrome Linked List
- [ ] Intersection of Two Linked Lists
- [ ] Flatten a Multilevel Doubly Linked List

**➡ Now do OOP 6: Design Basics (SOLID intro)**
- [ ] Single Responsibility Principle (concept)
- [ ] Open/Closed Principle (concept)
- [ ] Composition vs Inheritance
- [ ] Interview Qs: diamond problem, why no multiple inheritance, interface default methods

**Resources:** [SOLID principles simplified](https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/)

**Practice (written):**
- [ ] Why doesn't Java support multiple inheritance via classes?
- [ ] Refactor a class violating SRP into two smaller classes
- [ ] Explain composition: Car has-a Engine
- [ ] List 5 OOP interview questions + your own answers

**This is the last core OOP topic — OOP is done from here. Everything below is DSA only.**

---

## 7. Stack & Queue

- [ ] Stack using array/linked list
- [ ] Queue, circular queue, deque
- [ ] Monotonic stack pattern
- [ ] Implement stack using queue and vice versa

**Resources:** [Striver Stack & Queue Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0rQ6WPHfliwygZzTMDx7WCX)

**Practice (LeetCode):**
- [ ] Valid Parentheses
- [ ] Min Stack
- [ ] Evaluate Reverse Polish Notation
- [ ] Daily Temperatures
- [ ] Next Greater Element I & II
- [ ] Largest Rectangle in Histogram
- [ ] Implement Queue using Stacks
- [ ] Sliding Window Maximum
- [ ] Asteroid Collision
- [ ] Trapping Rain Water (stack approach)

---

## Step 8 — Trees (Binary Tree + BST)

- [ ] Traversals: inorder, preorder, postorder, level order
- [ ] Height, diameter, balanced tree check
- [ ] BST insert/delete/search
- [ ] Lowest common ancestor
- [ ] Views of a tree (top, bottom, left, right)

**Resources:** [Striver Tree Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk) · [Striver BST Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF)

**Practice (LeetCode):**
- [ ] Inorder/Preorder/Postorder Traversal
- [ ] Level Order Traversal
- [ ] Maximum Depth of Binary Tree
- [ ] Diameter of Binary Tree
- [ ] Balanced Binary Tree
- [ ] Validate Binary Search Tree
- [ ] Lowest Common Ancestor of a BST
- [ ] Kth Smallest Element in a BST
- [ ] Binary Tree Right Side View
- [ ] Construct Binary Tree from Preorder and Inorder
- [ ] Serialize and Deserialize Binary Tree
- [ ] Path Sum II

---

## 9. Heaps / Priority Queue

- [ ] Min-heap, max-heap concept
- [ ] PriorityQueue in Java
- [ ] Heapify
- [ ] Top-K pattern

**Resources:** [Striver Heap Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0rF1w2Koyh78zafB0Y_DgV0)

**Practice (LeetCode):**
- [ ] Kth Largest Element in an Array
- [ ] Top K Frequent Elements
- [ ] Find Median from Data Stream
- [ ] Merge k Sorted Lists
- [ ] Task Scheduler
- [ ] K Closest Points to Origin
- [ ] Last Stone Weight

---

## 10. Hashing

- [ ] HashMap/HashSet internal working (basic idea)
- [ ] Frequency counting pattern
- [ ] Hashing for pair/subarray problems

**Resources:** [GfG Hashing basics](https://www.geeksforgeeks.org/hashing-data-structure/)

**Practice (LeetCode):**
- [ ] Two Sum
- [ ] Group Anagrams (revisit)
- [ ] Longest Consecutive Sequence
- [ ] Subarray Sum Equals K (revisit)
- [ ] Contains Duplicate II
- [ ] Ransom Note
- [ ] Isomorphic Strings

---

## 11. Graphs

- [ ] Graph representation (adjacency list/matrix)
- [ ] BFS, DFS
- [ ] Topological sort (Kahn's + DFS)
- [ ] Union-Find (Disjoint Set)
- [ ] Shortest path: Dijkstra, Bellman-Ford (concept level)
- [ ] Cycle detection (directed + undirected)

**Resources:** [Striver Graph Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn)

**Practice (LeetCode):**
- [ ] Number of Islands
- [ ] Clone Graph
- [ ] Course Schedule
- [ ] Course Schedule II
- [ ] Pacific Atlantic Water Flow
- [ ] Rotting Oranges
- [ ] Network Delay Time
- [ ] Graph Valid Tree
- [ ] Number of Connected Components in an Undirected Graph
- [ ] Word Ladder
- [ ] Redundant Connection (Union-Find)
- [ ] Cheapest Flights Within K Stops

---

## 12. Dynamic Programming

- [ ] 1D DP (climbing stairs, house robber)
- [ ] 2D DP (grids, knapsack)
- [ ] String DP (LCS, edit distance)
- [ ] DP on subsequences
- [ ] Memoization vs tabulation

**Resources:** [Striver DP Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0rAuz8tVcM0AymmhTRsfaLU)

**Practice (LeetCode + GfG):**
- [ ] Climbing Stairs
- [ ] House Robber
- [ ] House Robber II
- [ ] Coin Change
- [ ] Longest Increasing Subsequence
- [ ] Longest Common Subsequence
- [ ] Edit Distance
- [ ] 0/1 Knapsack (GfG)
- [ ] Unique Paths
- [ ] Minimum Path Sum
- [ ] Word Break
- [ ] Partition Equal Subset Sum
- [ ] Target Sum
- [ ] Decode Ways

---

## 13. Greedy Algorithms

- [ ] Greedy choice property (when it works vs doesn't)
- [ ] Interval scheduling
- [ ] Activity selection

**Resources:** [Striver Greedy Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0rF6BtM1zBBUrX9wugAo0Ss)

**Practice (LeetCode):**
- [ ] Jump Game
- [ ] Jump Game II
- [ ] Gas Station
- [ ] Merge Intervals (revisit)
- [ ] Non-overlapping Intervals
- [ ] Partition Labels
- [ ] Minimum Number of Arrows to Burst Balloons

---

## 14. Tries & Bit Manipulation (do last)

- [ ] Trie insert/search/startsWith
- [ ] AND/OR/XOR tricks
- [ ] Bit masking basics
- [ ] Single number problems

**Resources:** [Striver Trie + Bit Manipulation Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0oF6QL8m22w1hIDC1vJ_BHz)

**Practice (LeetCode):**
- [ ] Implement Trie (Prefix Tree)
- [ ] Word Search II
- [ ] Single Number
- [ ] Single Number II
- [ ] Number of 1 Bits
- [ ] Counting Bits
- [ ] Sum of Two Integers

**At this point you're internship-interview ready.** Everything below is optional polish only.

---

## Optional Add-Ons (only if time allows, after Step 14)

**DSA Extras:**
- [ ] Matrix problems: rotate, spiral traversal, set matrix zeroes (revisit)
- [ ] String algorithms: KMP, Rabin-Karp (concept level)
- [ ] Advanced graphs: Dijkstra's, MST (Kruskal/Prim)
- [ ] Advanced DP: Bitmask DP, DP on trees (recognize pattern only)

**Resources:** [Matrix + Advanced Graph Playlist](https://www.youtube.com/playlist?list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn) · [KMP Algorithm](https://www.youtube.com/watch?v=JoF0Z7nVSrA)

**Practice:**
- [ ] Rotate Image
- [ ] Spiral Matrix
- [ ] strStr() via KMP
- [ ] Network Delay Time (revisit, Dijkstra)
- [ ] Min Cost to Connect All Points (MST)
- [ ] Word Break II (bitmask/DP revisit)

**OOP Extras:**
- [ ] Generics (type-safe classes/methods)
- [ ] Lambda expressions and Streams API (Java 8+)
- [ ] Basic multithreading (Thread, Runnable, synchronized)
- [ ] Design patterns: Singleton, Factory, Observer
- [ ] Stack vs heap memory, garbage collection basics

**Resources:** [Java 8 Streams & Lambdas](https://www.youtube.com/watch?v=Vv9EMTgYzik) · [Java Design Patterns](https://www.geeksforgeeks.org/design-patterns-in-java/)

**Practice (write & run locally):**
- [ ] Generic Box<T> class
- [ ] Filter/map a list of integers using Streams
- [ ] Sort objects using Stream + Comparator
- [ ] Thread-safe Singleton class
- [ ] Simple Factory pattern for Shape objects

## Sorting Algorithms
Sorting is a fundamental operation in computer science that organizes elements in a particular order (ascending or descending). Java provides various sorting algorithms, each suited for different scenarios. Let’s explore:

- **Bubble Sort**
- **Insertion Sort**
- **Merge Sort**
- **Quick Sort**
***  

### **1. Bubble Sort**
Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order. This process continues until the entire array is sorted.

#### **Concept:**
- Repeatedly swaps adjacent elements if they are in the wrong order.
- The largest element **bubbles** to the end in each iteration.

#### **Time Complexity:**
- **Best Case (Already Sorted):** O(n)
- **Average Case:** O(n²)
- **Worst Case (Reverse Sorted):** O(n²)

#### **Space Complexity:**
- **O(1)** (In-place Sorting)
***  

### **2. Insertion Sort**
Insertion Sort works by building a sorted portion of the array one element at a time by picking an element and inserting it at the correct position within the sorted portion.
#### **Concept:**
- Builds the sorted array one element at a time by picking an element and inserting it in the correct position.
- Works efficiently for small and nearly sorted arrays.

#### **Time Complexity:**
- **Best Case (Already Sorted):** O(n)
- **Average Case:** O(n²)
- **Worst Case (Reverse Sorted):** O(n²)

#### **Space Complexity:**
- **O(1)** (In-place Sorting)
***  

### **3. Selection sort**
Selection Sort is a comparison-based sorting algorithm. It sorts an array by repeatedly selecting the smallest (or largest) element from the unsorted portion.
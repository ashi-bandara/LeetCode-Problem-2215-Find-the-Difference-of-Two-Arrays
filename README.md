
# LeetCode Challenge D38

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2215. Find the Difference of Two Arrays](https://leetcode.com/problems/find-the-difference-of-two-arrays/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given two  **0-indexed**  integer arrays  `nums1`  and  `nums2`, return  _a list_  `answer`  _of size_  `2`  _where:_

-   `answer[0]`  _is a list of all  **distinct**  integers in_  `nums1`  _which are  **not**  present in_  `nums2`_._
-   `answer[1]`  _is a list of all  **distinct**  integers in_  `nums2`  _which are  **not**  present in_  `nums1`.

**Note**  that the integers in the lists may be returned in  **any**  order.

**Example**
> **Input:** nums1 = [1,2,3], nums2 = [2,4,6]
> 
>**Output:** [[1,3],[4,6]]
> 
>**Explanation:** For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The algorithm first converts both arrays into sets (`nums1Set` and `nums2Set`) to efficiently identify distinct integers. The strategic use of HashSet in this implementation plays a crucial role in avoiding the storage of duplicates and enhancing the efficiency of the solution. By converting `nums1` and `nums2` into HashSet objects (`nums1Set` and `nums2Set`, respectively), the algorithm automatically eliminates any duplicate elements within each array. It then iterates through `nums1Set` and`nums1Set`, adding elements that are present in one set but not in the other to `list1` and `list2`, respectively. Finally, the result is stored in a list of lists named answer, where `answer[0]` contains distinct integers in `nums1` not present in `nums2`, and `answer[1]` contains distinct integers in `nums2` not present in `nums1`.


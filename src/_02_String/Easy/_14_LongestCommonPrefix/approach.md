## 14.LongestCommonPrefix


#### Problem Statement : 
- Write a function to find the longest common prefix string amongst an array of strings.
- If there is no common prefix, return an empty string "".

### MY APPROACH
*  iterates through the strings
* finding at each iteration i the longest common prefix of strings
* when it is an empty string the program ends
* otherwise after n iterations this will return the lcp


#### Tc : O(S) ;[S = sum of all characters in all strings]
#### Sc : O(1).
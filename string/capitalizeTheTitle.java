// You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:

// If the length of the word is 1 or 2 letters, change all letters to lowercase.
// Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
// Return the capitalized title.

class Solution {
    public String capitalizeTitle(String title) {
        String x = title.toLowerCase();
        String[] a = x.split(" ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 2) {
                a[i] = a[i].substring(0, 1).toUpperCase() + a[i].substring(1);
            }
        }
       return String.join(" ",a);
    };
};
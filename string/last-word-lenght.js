/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
   let a = s.trim().split(" ");
   let lst = a[a.length-1];
   let lng = lst.length;
   return lng;
};
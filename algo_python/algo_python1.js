/*
 * @param {String} str1
 * @param {String} str2
 * @return {Boolean}
 * Are the two strings equal irrespective of case?
 */

//.toLowerCase()
//Convert the string to lowercase letters:

function caseInsensitiveStringCompare(str1, str2) {
    // your code here
    if (str1.toLowerCase() == str2.toLowerCase()) {
      return true;
    } else {
      return false;
    }
  }

  console.log(caseInsensitiveStringCompare("This", "this"));
  console.log(caseInsensitiveStringCompare("This", "tHIS"));
  // should log true
  console.log(caseInsensitiveStringCompare("this", "that"));
  // should log false
  
  "hello".toUpperCase(); // returns 'HELLO'
  "hello".toLowerCase(); // returns 'hello'




// !! 

  /*
   * @param {String} str
   * @return {String} first letter of each "word" capitalized
   */

   // .toUpperCase()
   //Convert the string to uppercase letters:

   // .split()
   // The split() method splits a string into a list.
   // You can specify the separator, default separator is any whitespace.
   //
  function acronyms(str) {
    // your code here
    var strArr = str.split(" "); //["there's", "no", "free", "lunch", "-", "gotta", "pay", "yer", "way."]
    var output = "";
  
    // Grab first letter of each word
    // output += letter
    // "" -> "T" -> "TN" -> "TNF"
  
    for (var i = 0; i < strArr.length; i++) {
      output += strArr[i][0].toUpperCase();
    }
    return output;
  }
  "hello".split("l"); //-> returns ['he','','o']
  "hello".toUpperCase(); // returns 'HELLO'
  
  console.log(acronyms("there's no free lunch - gotta pay yer way."));
  // should log 'TNFL-GPYW'
  console.log(acronyms("Live from New York, it's Saturday Night!"));
  // should log 'LFNYISN'
  
  function acronyms(str){
    var arr = str.split(" ")
    var output = []
    for(var i=0; i<arr.length; i++){
      output += arr[i][0].toUpperCase;
    }
    return output;
  }

  console.log(acronyms("there's no free lunch - gotta pay yer way."));
  // should log 'TNFL-GPYW'
  console.log(acronyms("Live from New York, it's Saturday Night!"));


  

  /*
   * @param {String} str
   * @return {String} characters in the reverse order
   */
  
  function stringReverse(str) {
    // your code here
    reverseStr = '';
  
    for (var i = str.length - 1; i >= 0; i--) {
      //   'this' -> str.length == 4
      //   0,1,2,3
      // backwards for loop
      reverseStr = reverseStr + str[i];
      //  's'    =   ''       +   's'         i = 3
      //  'si'   =   's'      +   'i'         i = 2
      //  'sih'  =   'si'     +   'h'         i = 1
      //  'siht' =   'sih'    +   't'         i = 0
      //   get out of for loop                i = -1
    }
    return reverseStr;
  }
  
  console.log(stringReverse("this")); // should log 'siht'
  console.log(stringReverse("something")); // should log 'gnihtemos'



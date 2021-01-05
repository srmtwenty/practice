/*
* @param {number[]} arr
* @return {boolean}
* Is there a point between indices
* where the summed values on each side are equal?
*/

/** 
 * our plan of attack!
 * 1.   we are going to create a function that accepts a parameter of '{number[]}'
 * 2.   we are going to iterate through the array of numbers to look for a balance point 
 * 3.   aka "Is there a point between indices where the summed values on each side are equal?"
 * 4.   return a boolean
*/


/*
Second round of for loop
var             val         console
arr             [1,2,3,4]
sum             9
i               1
locationSum     2
j               2
*/

function balancePoint(arr) {
    // your code here
    var leftSum = arr[0];
    var rightSum = 0;
    for (var i = 1; i < arr.length; i++){      
        rightSum += arr[i];
    }
    for(var j = 1; j < arr.length; j++){
        if(leftSum == rightSum){
            return true;
        }
        leftSum += arr[j];
        rightSum -= arr[j+1];
    }
    return false;
}

console.log(balancePoint([1, 2, 3, 4])); // should log false
console.log(balancePoint([3, 4, 2, 5]));
// should log true (between indices 1 and 2)

//alternative

function balancePoint(arr) {
    var sumForward =0, sumBackward = 0, sumAll =0;
    for(var i =0; i<arr.length; i++){
        sumAll += arr[i];
    }
    for(var j =0; j<arr.length; j++){
        sumForward += arr[j];
        sumBackward = sumAll - sumForward;

        if(sumForward == sumBackward){
            // check = true;
            return true;
        }
    }
    return false
}

console.log(balancePoint([1, 2, 3, 4]));
console.log(balancePoint([3, 4, 2, 5]));


/*
* @param {number[]} arr
* @return {number}
* if there is an index in which the summed values
* on each side are equal, return it
* otherwise, return -1
*/

/*
our plan of attack!
1.  Loop through the array
2.  Check the left side of the index, and add them up
3.  Check the right side of the index, and add them up
*/

/*
var             val                 console
arr         [-2, 5, 7, 0, 3]
i           0
leftSum     0
rightSum    0->5
j           -1
k           1->2
*/

function balanceIndex(arr) {
    // your code here
    var leftSum = 0;
    var rightSum = 0;
    for (var b = 0; b < arr.length; b++){
        rightSum += arr[b];
    }
    for (var i = 1; i < arr.length; i++){
        // This loop adds up all numbers on left side of the index
        for (var j = i - 1; j >= 0; j--){
            leftSum += arr[j];
        }
        // This loop adds up all numbers on right side of the index
        for (var k = i + 1; k < arr.length; k++){      
            rightSum += arr[k];
        }
        // Compare each side
        if (leftSum == rightSum){
            return i;
        }
    }
    // Returns -1 if the leftSum and rightSum never equaled each other
    return -1;
}

console.log(balanceIndex([-2, 5, 7, 0, 3])); // should log 2
console.log(balanceIndex([9, 9])); // should log -1


function balanceIndex(arr) {
    // your code here
    var leftSum = 0;
    var rightSum = 0;
    for (var i = 1; i < arr.length; i++){
        rightSum += arr[i];
    }

    for (var j = 1; j < arr.length; j++){
        if (leftSum == rightSum){
            return i;
        }
        leftSum += arr[j - 1];
        rightSum -= arr[j + 1];
    }
    // Returns -1 if the leftSum and rightSum never equaled each other
    return -1;
}

console.log(balanceIndex([-2, 5, 7, 0, 3])); // should log 2
console.log(balanceIndex([9, 9])); // should log -1


// function balanceIndex(arr){
//     var leftSum = 0;
//     var rightSum = 0;
//     for(var b = 0; b<arr.length; b++){
//         rightSum += arr[b];
//     }
//     for(var i = 1; i<arr.length; i++){
//         if(leftSum == rightSum){
//             return i - 1;
//         }
//         leftSum += arr[i-1];
//         rightSum -= arr[i + 1];
//     }
//     return -1;
// }
// console.log(balanceIndex([-2, 5, 7, 0, 3])); // should log 2
// console.log(balanceIndex([9, 9])); // should log -1


function balanceIndex(arr) {
    // your code here
    var leftSum = 0;
    var rightSum = 0;
    for (var b = 0; b < arr.length; b++){
        rightSum += arr[b];
    }

    for (var i = 1; i < arr.length; i++){
        if (leftSum == rightSum){
            return i-1;
        }
        leftSum += arr[i - 1];
        rightSum -= arr[i + 1];
    }
    // Returns -1 if the leftSum and rightSum never equaled each other
    return -1;
}

console.log(balanceIndex([-2, 5, 7, 0, 3])); // should log 2
console.log(balanceIndex([9, 9])); // should log -1

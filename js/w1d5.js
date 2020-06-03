"use strict";

function max(num1 ,  num2) {
    if(num1>num2)
    document.getElementById("output").innerHTML = num1;
    else
    document.getElementById("output").innerHTML = num2;
}


function findMax() {
    let max = -Infinity;
    for (let i = 0; i < arguments.length; i++) {
        if (arguments[i] > max) {
            max = arguments[i];
        }
    }
    document.getElementById("output").innerHTML = max;
}

function findMaxNumber() {
    let max = -Infinity;
    for (let i = 0; i < arguments.length; i++) {
        if (arguments[i] > max) {
            max = arguments[i];
        }
    }
    document.getElementById("output2").innerHTML = max;
}

function isVowel(c) {
    var result;
    result = c == "A" || c == "a" || c == "E" || c == "e" || c == "I" || c == "i" || c == "O" || c == "o" || c == "U" || c == "u";
    document.getElementById("output3").innerHTML = result;
}

function sum(arr) {
    let total = 0;
    for (let i in arr) {
        total += arr[i];
    }
    document.getElementById("output4a").innerHTML = total;
}

function multiply(arr) {
    let total = 1;
    for (let i in arr) {
        total *= arr[i];
    }
    document.getElementById("output4b").innerHTML = total;
}

function reverse(oldstr) {
    let reverseStr='';
    for (let i = oldstr.length - 1; i >= 0; i--) { 
        reverseStr += oldstr[i];
    }
    document.getElementById("output5").innerHTML =reverseStr;
}

function findLongestWord(strArray) {
    let word = null;
    let lw = 0;
    strArray.forEach(function (str) {
        if (lw < str.length) {
            lw = str.length;
            word = str;
        }
    });
    document.getElementById("output6").innerHTML = word;
}

function filterLongWords(strArray, intVal) {
    let word = new Array();
    let lw = 0;
    strArray.forEach(function (str) {
        if (intVal < str.length) {
            word.push(str);
        }
    });
    document.getElementById("output7").innerHTML =  word;
}

function computeSumOfSquares(arr){
    let r = arr.reduce(function (a, b) {
        return a+(b*b);
    })
    document.getElementById("output8").innerHTML =  r
}

function printOddNumbersOnly(intArray){
    let oddArray = new Array();
    for(let i=0; i < intArray.length; i++){
        if((intArray[i] % 2) == 0){
            continue;
        }else{
            oddArray.push(intArray[i]);
            console.log(intArray[i] +" is Odd Number");
        }
    }
    document.getElementById("output9").innerHTML = oddArray;
}

function computeSumOfSquaresOfEvensOnly(intArray){
    let total =0;
    for(let i=0; i < intArray.length; i++){
        if((intArray[i] % 2) == 0){
            total+=intArray[i]*intArray[i]
        }
    }
    document.getElementById("output10").innerHTML = total;
}

function sumUsingReduce(arr) {
    let r = arr.reduce(function (a, b) {
        return a+b;
      })
      document.getElementById("output11a").innerHTML = r;
}

function multiplyUsingReduce(arr) {
    let r = arr.reduce(function (a, b) {
        return a*b;
      })
      document.getElementById("output11b").innerHTML = r; 
}

function findSecondBiggest(arr) {
    let max =0, secondMax = 0;

    for (const value of arr) {
        if (value > max) {
            [secondMax, max] = [max, value]
        } else if (value < max && value > secondMax) {
            secondMax = value;
        }
    }

    document.getElementById("output12").innerHTML = secondMax;
}

function printFibo(n, a, b ){
    let fiboArray = new Array();
    if(n>0){
        console.log(a);
        fiboArray.push(a);
    }

    if(n>1){
        console.log(b);
        fiboArray.push(b);
    }
    for (let i = 2; i < n; i++) {
        let r = a+b;
        a=b;
        b=r;
        console.log(r);
        fiboArray.push(r);
    }
    document.getElementById("output13").innerHTML = fiboArray;
}
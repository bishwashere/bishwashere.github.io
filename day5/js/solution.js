function max(firstNumber, secondNumber){
    let maxNumber;
    if(firstNumber>=secondNumber){
        maxNumber=firstNumber;
    }
    else{
        maxNumber=secondNumber;
    }
    return maxNumber;
}

function processOne(){
    const firstNumber = document.getElementById("firstNumber1").value;
    const secondNumber = document.getElementById("secondNumber1").value;
    return max(firstNumber, secondNumber);

}

function processTwo(){
    const firstNumber = document.getElementById("firstNumber2").value;
    const secondNumber = document.getElementById("secondNumber2").value;
    const maxOfTwo = max(firstNumber, secondNumber);

    const thirdNumber = document.getElementById("thirdNumber2").value;
    return max(maxOfTwo, thirdNumber);       
}

function processThree(){
    const character = document.getElementById("character").value;
    if(['a','e','i','o','u'].includes(character.toLowerCase())){
        return true;
    }
    return false;
}

function processFourMultiply(){
    const firstNumber = document.getElementById("firstNumber4").value;
    const secondNumber = document.getElementById("secondNumber4").value;
    const thirdNumber = document.getElementById("thirdNumber4").value;
    arrayOfNumber=[firstNumber, secondNumber, thirdNumber];
    return multiply(arrayOfNumber);
}

function multiply(arrayOfNumber){
    let product=1;
    for(item of arrayOfNumber){
        product=product*item;
    }
    return product;
}

function processFourSum(){
    const firstNumber = document.getElementById("firstNumber4").value;
    const secondNumber = document.getElementById("secondNumber4").value;
    const thirdNumber = document.getElementById("thirdNumber4").value;
    arrayOfNumber=[firstNumber, secondNumber, thirdNumber];
    return sum(arrayOfNumber);
}

function sum(arrayOfNumber){
    let product=0;
    for(item of arrayOfNumber){
        product=parseInt(product)+parseInt(item);
    }
    return product;
}

function processFive(){
    const sentence = document.getElementById("sentence").value;
    return reverse(sentence);
}

function reverse(sentence){
    let reverse='';
    for(let i=0; i<sentence.length; i++){
        reverse = sentence.charAt(i) + reverse;
        console.log(reverse);
    }
    return reverse;
}

function processSix(){
    const firstWord = document.getElementById("firstWord6").value;
    const secondWord = document.getElementById("secondWord6").value;
    const thirdWord = document.getElementById("thirdWord6").value;
    arrayOfWord=[firstWord, secondWord, thirdWord];
    return maxofArrayOfWords(arrayOfWord);
}

function maxofArrayOfWords(arrayOfWord){
    let maxOfWords=arrayOfWord[0];
    for(item of arrayOfWord){
        // console.log(maxOfWords<item);
        if(maxOfWords.length<item.length){
            maxOfWords=item;
            // console.log(maxOfWords);
        }
    }
    return maxOfWords;
}

function processSeven(){
    const firstWord = document.getElementById("firstWord7").value;
    const secondWord = document.getElementById("secondWord7").value;
    const thirdWord = document.getElementById("thirdWord7").value;
    const length = document.getElementById("length7").value;
    arrayOfWord=[firstWord, secondWord, thirdWord];
    return filterLongWords(arrayOfWord, length);
}

function filterLongWords(arrayOfWord, length){ 
    let resultArray=[];
    // console.log(length);
    for(item of arrayOfWord){
        if(item.length<=length){
            resultArray.push(item);
        }
    }
    return resultArray;
}

function processEight(){
    const firstNumber = document.getElementById("firstNumber8").value;
    const secondNumber = document.getElementById("secondNumber8").value;
    const thirdNumber = document.getElementById("thirdNumber8").value;
    arrayOfNumber=[firstNumber, secondNumber, thirdNumber];
    return computeSumOfSquares(arrayOfNumber);
}

function computeSumOfSquares(arrayOfNumber){
    let result=0;
    for(item of arrayOfNumber){
        result=result+(item*item);
        console.log(result);
    }
    return result;
}

function processNine(){
    const firstNumber = document.getElementById("firstNumber9").value;
    const secondNumber = document.getElementById("secondNumber9").value;
    const thirdNumber = document.getElementById("thirdNumber9").value;
    arrayOfNumber=[firstNumber, secondNumber, thirdNumber];
    return computeSumOfSquares(arrayOfNumber);
}

function computeSumOfSquares(arrayOfNumber){
    let resultArray=Array();
    for(item of arrayOfNumber){
        if(item%2!==0){
            resultArray.push(item);
        }
    }
    return resultArray;
}

function processTen(){
    const firstNumber = document.getElementById("firstNumber10").value;
    const secondNumber = document.getElementById("secondNumber10").value;
    const thirdNumber = document.getElementById("thirdNumber10").value;
    arrayOfNumber=[firstNumber, secondNumber, thirdNumber];
    return computeSumOfSquaresOfEvensOnly(arrayOfNumber);
}

function computeSumOfSquaresOfEvensOnly(arrayOfNumber){
    let result=0;;
    for(item of arrayOfNumber){
        if(item%2===0){
            result=result+(item*item);
        }
    }
    return result;
}

function processEleventhMultiply(){
    const firstNumber = document.getElementById("firstNumber11").value;
    const secondNumber = document.getElementById("secondNumber11").value;
    const thirdNumber = document.getElementById("thirdNumber11").value;
    arrayOfNumber=[firstNumber, secondNumber, thirdNumber];
    return arrayOfNumber.reduce((sum,item)=>sum*item, 1);
}

function processEleventhSum(){
    const firstNumber = document.getElementById("firstNumber11").value;
    const secondNumber = document.getElementById("secondNumber11").value;
    const thirdNumber = document.getElementById("thirdNumber11").value;
    arrayOfNumber=[firstNumber, secondNumber, thirdNumber];
    return arrayOfNumber.reduce((sum,item)=>sum+parseInt(item), 0);
}

function processTwelve(){
    const firstNumber = document.getElementById("firstNumber12").value;
    const secondNumber = document.getElementById("secondNumber12").value;
    const thirdNumber = document.getElementById("thirdNumber12").value;
    const fourthNumber = document.getElementById("fourthNumber12").value;
    arrayOfNumber=[firstNumber, secondNumber, thirdNumber, fourthNumber];
    return findSecondBiggest(arrayOfNumber);
}

function findSecondBiggest(arrayOfNumber){
    let maxNumber = parseInt(arrayOfNumber[0]);
    for(item of arrayOfNumber){
        if(item>maxNumber){
            maxNumber=item;
        }
    }
    const indexOfMaxNumber = arrayOfNumber.indexOf(maxNumber);
    arrayOfNumber.splice(indexOfMaxNumber, 1);

    let secondBiggestNumber = arrayOfNumber[1];
    for(items of arrayOfNumber){
        if(items>secondBiggestNumber){
            secondBiggestNumber=items;
        }
    }
    return secondBiggestNumber;
}

function processThirteen(){
    const length = document.getElementById("firstNumber13").value;
    const startingNumber1 = document.getElementById("secondNumber13").value;
    const startingNumber2 = document.getElementById("thirdNumber13").value;
    return printFibo(length, startingNumber1, startingNumber2);
}

function printFibo(length, startingNumber1, startingNumber2){
    let sum = startingNumber1;
    let previousNumber = startingNumber2;
    for (let i=0; i<length;i++){
        console.log(sum);
        document.getElementById('result13').innerHTML=document.getElementById('result13').innerHTML+' '+sum;
        sum = sum + previousNumber;
        console.log(sum);
        previousNumber=(i++);
    }

}
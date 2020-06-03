window.onload = function () {
    "use strict";
 
}

interval = null

function checkBoxClicked() {
    alert("boxChecked!")
    if (document.getElementById("boxChecked").checked === true) {
        document.body.style.backgroundImage = "url('http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg')";
        document.getElementById("textId").style.fontWeight = 'bold'
        document.getElementById("textId").style.color = 'green'
        document.getElementById("textId").style.textDecoration = 'underline'
    } else {
        document.body.style.backgroundImage = 'none'
        document.getElementById("textId").style.fontWeight = 'normal'
        document.getElementById("textId").style.color = 'black'
        document.getElementById("textId").style.textDecoration = 'none'
    }
}

function buttonClickedBigger() {
    alert("buttonClicked!")
    interval = setInterval(function () {
        let currentSize = document.getElementById("textId").style.fontSize;
        if (currentSize =='') currentSize = 14; 
        console.log(currentSize)
        document.getElementById("textId").style.fontSize = parseInt(currentSize) + 2 + "pt";
    }, 500)

}


const VOWELS = ['a', 'e', 'i', 'o', 'u'];

function pigLatin() {
    let message = document.getElementById("textId").value
    console.log(message)
    document.getElementById("textId").value = message.split(' ').map(translateWord).join(' ');
}

function translateWord(word) {
    for(var i = 0; i < word.length; i++) {
        if(VOWELS.indexOf(word[i]) !== -1) break;
        if(word.slice(i, i+2) === 'qu') i += 1;
    };
    return word.slice(i) + word.slice(0, i) + 'ay';
}

function checkMalkovitch() {
    let message = document.getElementById("textId").value
    console.log(message)
    document.getElementById("textId").value = message.split(' ').map(convertToMalkovitch).join(' ');
}

function convertToMalkovitch(word) {
    if(word.length>4)
        return 'Malkovitch'
    else
        return word
}
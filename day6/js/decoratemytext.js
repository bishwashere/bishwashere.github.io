function biggerText(){
    document.getElementById("textarea").style.fontSize="24pt";
}

function incrementText(){
    var textSize = window.getComputedStyle(document.getElementById("textarea")).fontSize;
    var increasedSize = parseInt(textSize)+2;
    document.getElementById("textarea").style.fontSize=increasedSize+'pt';
}

function intervalIncrement(){
    var intervalIncrease = setInterval(function(){incrementText()}, 2000);
}

function intervalStop(){
    clearTimeout(intervalIncrease);

}

function alert(checkBoxElement){
    if (checkBoxElement.checked){
        document.getElementById("textarea").style.fontWeight="bold";
        document.getElementById("textarea").style.color="green";
        document.getElementById("textarea").style.textDecoration="underline";
    }
    else{
        document.getElementById("textarea").style="";
    }
}
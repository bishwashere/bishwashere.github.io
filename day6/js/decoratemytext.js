function biggerText(){
    document.getElementById("textarea").style.fontSize="24pt";
}

function incrementText(){
    var textSize = document.getElementById("textarea").style.fontSize;
    var increasedSize = parseInt(textSize);
    document.getElementById("textarea").style.fontSize=18+'pt';
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
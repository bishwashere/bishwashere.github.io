// function biggerText(){
//     document.getElementById("textarea").style.fontSize="24pt";
// }

// function incrementText(){
//     var textSize = window.getComputedStyle(document.getElementById("textarea")).fontSize;
//     var increasedSize = parseInt(textSize)+2;
//     document.getElementById("textarea").style.fontSize=increasedSize+'pt';
// }

// function intervalIncrement(){
//     setInterval(function(){incrementText()}, 2000);
// }

// function intervalStop(){
    
// }

// function alert(checkBoxElement){
//     if (checkBoxElement.checked){
//         document.getElementById("textarea").style.fontWeight="bold";
//         document.getElementById("textarea").style.color="green";
//         document.getElementById("textarea").style.textDecoration="underline";
//     }
//     else{
//         document.getElementById("textarea").style="";
//     }
// }

window.onload = function(){
    "use strict";
    // put all of your code here

    const button1 = document.getElementById("button1");
    button1.onclick=biggerText;

    const button2 = document.getElementById("button2");
    button2.onclick=incrementText;

    const button3 = document.getElementById("button3");
    button3.onclick=intervalIncrement;

    const button4 = document.getElementById("button4");
    button4.onclick=intervalStop;
    
    function biggerText(){
        document.getElementById("textarea").style.fontSize="24pt";
    }
    
    function incrementText(){
        var textSize = window.getComputedStyle(document.getElementById("textarea")).fontSize;
        var increasedSize = parseInt(textSize)+2;
        document.getElementById("textarea").style.fontSize=increasedSize+'pt';
    }
    
    function intervalIncrement(){
        window.myTimer = setInterval(incrementText, 2000);
    }
    
    function intervalStop(){
        clearTimeout(window.myTimer);
    
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
}


/**
 *  My scripts for lab 4
 */

window.onload = function(){
    "use strict";

    // [6]
    // ... define a "count" object with two methods: add() and reset.
    let counter=0;
    const count = {
        add(){
            return function(){
                return counter+=1;
            }(); // note
        },
        reset(){
            return function(){
                return counter=0;
            }(); //note
        }
    }
    
    this.document.write("[6]");
    this.document.write("<br><br>");
    document.write("Increment: " + count.add())
    this.document.write("<br>");
    document.write(`Reset: ${count.reset()}`)

    // [6]
    // ... define a "count" object with two methods: add() and reset.
    let counter2=0;
    const count2 = {
        add(){
            return counter2+=1;
        },
        reset(){
            return counter=0;
        }
    }
    
    this.document.write("<br><br>");
    this.document.write("[6]");
    this.document.write("<br><br>");
    document.write("Increment: " + count2.add())
    this.document.write("<br>");
    document.write(`Reset: ${count2.reset()}`)


    // 8
    // ... 

    var add = (function(){
        var counter = 0;
        return function(){
            return counter +=1;
        }
    })();

    // make_adder(inc)

    var make_adder = (function(increment){
        var counter=0;
        return function(){
            return counter +=increment;
        }
    });

    this.document.write("<br><br>");
    this.document.write("[8]");
    this.document.write("<br><br>");
    add = make_adder(5)
    document.write("Increment by 5: " + add())
    // this.document.write("<br>");
    // document.write(`Reset: ${count2.reset()}`)



    // 10
    

}
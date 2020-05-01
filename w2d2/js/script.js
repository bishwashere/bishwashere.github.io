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

    const add = (function(){
        let counter = 0;
        return function(){
            return counter +=1;
        }
    })();

    // make_adder(inc)

    let make_adder = (function(increment){
        let counter=0;
        return function(){
            return counter +=increment;
        }
    });

    this.document.write("<br><br>");
    this.document.write("[8]");
    this.document.write("<br><br>");
    const add2 = make_adder(5)
    document.write("Increment by 5: " + add2())
    // this.document.write("<br>");
    // document.write(`Reset: ${count2.reset()}`)



    // 10
    
    const Person = function(){
        // note - no variable declaration for each variables.
        let name = "Bishwas",
            age = 26,
            salary = 150000;

        function getName(){
            console.log(`Name: ${name}`);
        };

        function getAge(){
            console.log(`Age: ${age}`);
        }

        function getSalary(){
            console.log(`Salary: ${salary}`);
        }

        function setAge(newAge){
            age = newAge;
        }

        function setSalary(newSalary){
            salary = newSalary;
            console.log(salary);
        }

        function setName(newName){
            name = newName;
        }

        function increaseSalary(percentage){
            setSalary(salary + ((percentage/100) * salary));
        }

        function incrementAge(){
            setAge(age+1);
            console.log(age);
        }

        return {
            increaseSalary: increaseSalary,
            incrementAge: incrementAge
        };
    }();

    // note - Revealing Module Pattern
    // [1] Define all functions and variables.
    // [2] Return an anonumous function with:
    //    [2.1] pointer to private function
    //    [2.2] 

    document.write("<br><br>");
    document.write("<br><br>");
    document.write("[10] ( check console - F12 )");
    Person.increaseSalary(5);
    Person.incrementAge();

}
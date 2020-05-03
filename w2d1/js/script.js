window.onload = function(){
    // "use strict"

    function getValue1(){
        this.value = 10;
        function printValue(){
            console.log("This: ", this);
            console.log("Value: ", this.value);
        }
        printValue();
    }

    var value = 20;
    new getValue1();

    // this.document.write("Write all your answers in a document (MS Word or PDF only) and submit by uploading to Sakai.");


    // function myFunction(){
    //     const car = "Lamborghini";
    //     console.log(car);
    //     function mileage(){
    //         const mileage = 10;
    //         console.log(mileage);
    //     }
    //     console.log(mileage());
    //     console.log(mileage);
    // }

    // myFunction();

    // { 
	// 	const a = "Lamborghini";
	// 	console.log(a); 
	// }
    // console.log(a);
    


    // Normal function:

    // function add(num1, num2){
    //     const a=1;
    //     return num1+num2;
    // }

    // const navin = add(2,3);
    // console.log(navin);

    // const bishwas = add(4,5);
    // console.log(bishwas);

    // const sum = function(a, b){
    //     return a+b;
    // };

    // const pradip = sum(7, 8);
    // this.console.log(pradip);

    // // const pradip2 = new add(7,8);
    // // console.log(pradip2);

    // // Constructor function: - Object
    
    // function add1(num1, num2){
    //     this.a=num1;
    //     this.b=num2;
    // }

    // const addition = new add1(5,7);
    // addition.sum = function(){
    //     return this.a+this.b;
    // }

    // console.log(addition.sum());

    // // Many values: - Object

    // var car = {
    //     type:"Fiat",
    //     model:"500",
    //     color:"white"
    // };

    // console.log(car.type);

    // // Object Method: - Object
    // const person = {
    //     firstName: "John",
    //     lastName : "Doe",
    //     id       : 5566,
    //     fullName : function() {
    //       return this.firstName + " " + this.lastName;
    //     }
    //   };

    // console.log(person.firstName);
    // console.log(person.fullName());

    // person.firstName="Navin";
    // person.lastName="Paudel";
    // console.log(person.fullName());


}


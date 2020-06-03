
//  QUESTION-1
 const person = {
    name: "",
    dateOfBirth: "",
    getName: function() {
        return this.name;
    },
    setName: function(newName) {
        this.name = newName;
    },
    toString: function() {
        return `{name: ${this.name}, dateOfBirth: ${this.dateOfBirth}}`;
    }
}

const john = Object.create(person);
john.setName("John");
john.dateOfBirth = new Date("1998-12-10");

console.log(`The Person's name is ${john.getName()}`);
console.log(`${john.name} was born on ${john.dateOfBirth}`);


//  QUESTION-2
const anna = Object.create(person);     
    
anna.employee = function() {
    salary= 0,
    hireDate= new Date();
    var self=this;
    setSalary= function(salary) {
        self.salary = salary;
    }, 
//    setSalary= (salary => this.salary = salary), 
    getSalary= function() {
        return this.salary;
    },
    doJob= function(jobTitle) {
        return `${self.name} is a ${jobTitle} who earns ${'$'+self.salary}`;
    }
    return {
       setSalary: setSalary,
       doJob: doJob
       }       
      
};

anna.setName("Anna");
anna.dateOfBirth = new Date("1988-12-10");
anna.employee().setSalary(24999550);
console.log(anna.employee().doJob("Programmer"));

//  QUESTION-3
function Person(name, dateOfBirth) {
   this.name = name;
   this.dateOfBirth = dateOfBirth;
}

Person.prototype.toString = function() {
    return `{Name: ${this.name}, DateOfBirth: ${this.dateOfBirth}}`;
}

const peter = new Person("Peter", new Date("1985-11-10"));
console.log(peter.toString());

//  QUESTION-4
$(document).ready(function(){

$( "#showLoginFields" ).submit(function( event ) {
    console.log( "Handler for login from .submit() called." );
    event.preventDefault();
    const websiteURL = $("#website-url").val();
    const exampleInputEmail = $("#exampleInputEmail1").val();
    const exampleInputPassword = $("#exampleInputPassword1").val();
    console.log("Website URL: " + websiteURL);
    console.log("Email Id: " + exampleInputEmail);
    console.log("Password: " + exampleInputPassword);
  })

  $( "#newProductFields" ).submit(function( event ) {
    console.log( "Handler for Product from .submit() called." );
    event.preventDefault();
    const productNumber = $("#product-number").val();
    const productName = $("#name").val();
    const unitPrice = $("#unit-price").val();
    const quntityInStock = $("#quntity-in-stock").val();
    const supplier = $("#supplier").val();
    const dateSupplied = $("#date-supplied").val();

    var tableRow="<tr ><td>" + productNumber + "</td>"+
    "<td>" + productName + "</td>"+
    "<td>" + unitPrice + "</td>"+
    "<td>" + quntityInStock + "</td>"+
    "<td>" + supplier + "</td>"+
    "<td>" + dateSupplied + "</td></tr>";

    $("#mytable tbody").append(tableRow);

    $("#divProductTable").show();

  })

});

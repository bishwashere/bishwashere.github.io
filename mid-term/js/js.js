"use strict"

// Question 1 of part 2 begins
function myFunction(){
    if (document.getElementById("idNumber").value==""){
        alert("Enter Patient ID");
        return;
    }
    else{
        if (!document.getElementById("idNumber").value.match("E?P-[0-9]{3}-[0-9]{6}")){
            alert("Not a valid patient ID format. \nShould be EP-XXX-XXXXXX or p-XXX-XXXXXX, where X is a number");
            return;
        }
    }
    if (document.getElementById("firstName").value==""){
        alert("Enter Patient First Name");
        return;
    }
    if (document.getElementById("middleName").value==""){
        alert("Enter Patient Middle Name");
        return;
    }
    if (document.getElementById("lastName").value==""){
        alert("Enter Patient Last Name");
        return;
    }
    if (document.getElementById("dateOfBirth").value==""){
        alert("Enter Patient Date of Birth");
        return;
    }
    if (document.getElementById("isOutPatient").value==""){
        alert("Enter Patient is out patient or not");
        return;
    }
    process();
}
let result = '';
let outPatient = '';
let nonOutPatient = '';

function process(){
    const idNumber = document.getElementById("idNumber").value;
    const firstName = document.getElementById("firstName").value;
    const middleName = document.getElementById("middleName").value;
    const lastName = document.getElementById("lastName").value;
    const dateOfBirth = document.getElementById("dateOfBirth").value;
    const dateEntered = new Date(dateOfBirth);
    const resultDateFormat = `${dateEntered.getFullYear()}-${dateEntered.getMonth()}-${dateEntered.getDate()}`

    const department = document.getElementById("department").value;
    let isOutPatient = "No"
    if(document.getElementById("isOutPatient").checked){
        isOutPatient="Yes"
        outPatient=`<tr><td>${idNumber}</td><td>${firstName}</td><td>${middleName}</td><td>${lastName}</td><td>${resultDateFormat}</td><td>${department}</td><td>${isOutPatient}</td></tr>`;
    }
    else{
        nonOutPatient=`<tr><td>${idNumber}</td><td>${firstName}</td><td>${middleName}</td><td>${lastName}</td><td>${resultDateFormat}</td><td>${department}</td><td>${isOutPatient}</td></tr>`;
    }

    const result = outPatient+nonOutPatient;
    document.getElementById("post").innerHTML = result;

}

function showResults(checkBoxElem){
    if(checkBoxElem.checked){
        result = outPatient;
    }
    else{
        result = outPatient+nonOutPatient;
    }
    document.getElementById("post").innerHTML = result;
}

// Question 1 of part 2 end

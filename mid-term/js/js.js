"use strict"
let counter=1;
function myFunction(){
    const citizenId = document.getElementById("citizenId").value;
    const socialSecurity = document.getElementById("socialSecurity").value;
    const fullName = document.getElementById("fullName").value;
    const state = document.getElementById("state").value;

    let isSenior = "No"
    if(document.getElementById("isSeniorTrue").checked){
        isSenior="Yes"
    }

    const result=`<tr><th>${counter}</th><td>${socialSecurity}</td><td>${fullName}</td><td>${state}</td><td>${isSenior}</td></tr>`;

    document.getElementById("post").innerHTML = document.getElementById("post").innerHTML+result;
    counter+=1;
}
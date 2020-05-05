"use strict"
// Question 2 of part 2 begins

const Account = {
    accountNumber: null,
    balance: 0.0,
    accountType: null,
    toString: function(){
        return `AccountNumber: ${this.accountNumber}, balance: ${this.balance}, AccountType:${this.accountType}`;
    }
}

const savingsAccount = Object.create(Account);
const checkingAccount = Object.create(Account);

savingsAccount.accountNumber=10001;
savingsAccount.balance=125000.00;
savingsAccount.accountType="Savings";

checkingAccount.accountNumber=10002;
checkingAccount.balance=75090.50;
checkingAccount.accountType="Checking";

console.log("// Initialization");
console.log(savingsAccount.toString());
console.log(checkingAccount.toString());

savingsAccount.addInterest = function(interestRate){
    this.balance=((this.balance*(interestRate/100))+this.balance);
}

checkingAccount.deductMaintenanceFee = function(maintenanceFeeRate){
    this.balance=(this.balance-(this.balance*(maintenanceFeeRate/100)))
}

console.log("// After fee calcluation");
savingsAccount.addInterest(1.5);
checkingAccount.deductMaintenanceFee(10);

console.log(savingsAccount.toString());
console.log(checkingAccount.toString());
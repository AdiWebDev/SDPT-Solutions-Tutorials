/* Create a programm that checks the age(number) and isRegistered(boolean) variable. Given the condition and output below

-Regiesterd and 18 above 0 Valid Voter. 
-Not Registered and 18 above - Register First 
-Registered and below 18 - Invalid Voter. 
-Not Registererd and below 18 - Non Voter.  
*/ 

let isRegistered = false; 
let age = 19; 

// if(isRegistered && age>=18){ 
//     alert("Valid Voter");
// }
// else if (!isRegistered && age>=18){ 
//     alert("Register First.")
// }
// else if (isRegistered && age<18){ 
//     alert("Invalid Voter.")
// } 
// else if (!isRegistered && age<18){ 
//     alert("Non Voter.")
// } 

// Easy method

if(isRegistered){ 
    if(age >= 18) alert ("Valid Voter"); 
    else alert("Invalid Voter");
} 
else{ 
    if(age>=18) alert("Register First.");
    else alert("Non Voter");
}
/* IF Statement.
Use the IF keyword and {} to check for a certain condition.
The code inside {} will only be executed if the comparison is true. 
if true ang condition irarun niya yung nasa loob ng curly brace natin.
*/


/* ELSE Staement. 
 Uses the ELSE keyword and {} it used in combination with the IF keyword.
 ELSE runs when their comparison is false. */  

//  If ang age mo ay greater than or equal sa 18, edi true siya, so ang i-ra-run niya ay Legal Age. 
//  let age = 18; 

//  if(age>=18){ 
//     alert("Legal Age");
//  }else{ 
//     alert("Minor Age");
//  } 

 /*ELSE IF Statement. 
 - You can use this if you want additonal specific conditions. 
 - You can add as many as you want. 
 - It runs when the if comparison is false. */ 

  let age = 17; 

 if(age>=18){ 
    alert("Legal Age");
 }else if(age>=60){ 
    alert("Old Age");
 } else if(age>0) { 
    alert("Minor Age");
 }
 else{ 
    alert("Invalid Age")
 }

/* RETURN Keyword
- The return keyword returns the value in the method invocation. 
- This can be assigned to a variale. */ 

// function add(num1, num2){ 
//     return num1 + num2;
// }

// let sum = add(5, 10) + add(5, 5);
// console.log(sum);

/*
Explanation:

1. Una, tatawagin ni JavaScript ang function na `add(5, 10)`:
   - num1 = 5, num2 = 10
   - 5 + 10 = 15 → irereturn niya ito

2. Susunod, tatawagin ang `add(5, 5)`:
   - num1 = 5, num2 = 5
   - 5 + 5 = 10 → irereturn din ito

3. Ngayon, may dalawang result na tayo:
   - 15 (galing sa add(5,10))
   - 10 (galing sa add(5,5))

4. I-a-add niya ang dalawang result:
   - 15 + 10 = 25

5. Kaya ang final value ng `sum` ay **25**

6. `console.log(sum)` → magpi-print ng: **25**
*/ 



// Calculator Example

// function add (num1, num2){ 
//     return  num1 + num2; 
  
// }

// function subtract (num1, num2){ 
//     return num1 - num2; 
   
// }

// function multiply (num1, num2){ 
//    return num1 * num2; 
  
// } 
// function div (num1, num2){ 
//     return num1 / num2; 
 
// }

// Example 3
let lastname= "SDPT"; 
function appendtoLastname(name){ 
    return name +  " " + lastname;
}
let fullname = appendtoLastname("Adrian"); 
console.log(fullname); 

// Example 4
function average(num1, num2, num3){ 
    return(num1 + num2 + num3)/ 3; 
} 
let ave = average(98,98,87); 
console.log(ave);  


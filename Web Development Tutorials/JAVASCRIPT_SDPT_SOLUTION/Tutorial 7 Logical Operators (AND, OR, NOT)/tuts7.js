/* LOGICAL Operators 
- Are used in combinaton with conditional statements to create more complex conditions. 

- It Allows programmers to put 2 or more conditions in one expression.

- Are operators used to create more complex conditions*/ 
 

let age = 18; 
let experience = 3; 

// 1. &&  - All CONDITIONS should be true. 
console.log("---------&&-------");
console.log(age>=18 && experience>2); 
// Output: true; 
console.log(age>18 && experience>3); 
//Output: false;
console.log("---------||--------");

// 2. || At least one condition should be true. 
let hasDegree = true; 
let exp = 3;
console.log(hasDegree || exp>2); 
// Output: true; 
console.log(hasDegree || exp>3); 
//Output: true;

console.log("---------!--------");
//3. !  - Inverts the result of a CONDITION
console.log(!hasDegree); 
//Output: false;
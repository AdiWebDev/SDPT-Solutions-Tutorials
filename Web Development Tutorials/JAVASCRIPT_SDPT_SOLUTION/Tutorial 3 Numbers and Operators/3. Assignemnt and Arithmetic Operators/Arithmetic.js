// Assignment Operator is "=" 

// Arithmetic Operators 
/* Operator than can perform mathematical equations on numbers. */ 
let num1 = 10; 
let num2 = 2;    
// 1. Addtion 
 
let sum = num1 + num2;
alert(`Addition result: ${num1} + ${num2} =  `+ sum);
// 2. Subtraction
sum = num1 - num2;
alert(`Subtraction result: ${num1} - ${num2} =  `+ sum);
// 3. Division.  
sum = num1 / num2;
alert(`Division result: ${num1} / ${num2} =  `+ sum);

// 4. Multiplication
sum = num1 * num2;
alert(`Multiplication result: ${num1} * ${num2} =  `+ sum);
// 5. Modulus
sum = num1 % num2;
alert(`Modulus result: ${num1} % ${num2} =  `+ sum);
// 6. Exponent
sum = num1 ** num2;
alert(`Exponent result: ${num1} ** ${num2} =  `+ sum);


// Arithmetic Precedence 
// PEMDAS is followed in the order of precedence. 
/*
1. Parethesis.
2. Exponent 
3. Multiplication.    
4. Division.
5. Addtion. 
6. Subtraction. */  
// Multiplication and Division (left to right solving)
// Addition and Subtraction (left to right solving)

// Example of Precedence
let equal = ((5+5) - 2 ** 2 * 4 + 10 / 5 ) 

/* Paremthesis = (5+5) = 10 
   Expenonent =  2*2 = 4 
   Multiplication = 4 * 3 = 12
   Division = 10/5 = 2
   Addition =  14 
   Subtraction = */ 

alert("Precendence result: "+ equal); 


// Shorthand 
// Performs an arithmetic operator to a variable and assigns it to itself 

/*
1. +=  x += 5   x = 5 + 5
2. -= 
3. *= 
4. /= 
5. **=
6. %= */ 

// Example
let x = 5 ;    

// x = 5 + 5;  
alert(`Shorthand result 1: ${x+=5}`);

let y = 5;
// y = 5 + y** 2; 
// 5 X 5 = 25 
// 25 + 5 = 30
alert( `Shorthand result 2: ${y += 5**2}`) ;

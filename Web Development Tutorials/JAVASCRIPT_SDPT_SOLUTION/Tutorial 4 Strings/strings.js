/* Strings 
- One of datatype in JavaSCRIPT. 
- It maybe a character, word or sentence surrounded by "" or ' `
- The are used to display text information. */ 

/* String Length 
.length - gives the number of characters in string. 
- kasama yung space sa binibilang niya.*/

let wordnamayspace = "Hello World";  
let wordnawalangspace = "HelloWorld"; 
let len = wordnamayspace.length; 
let len2 = wordnawalangspace.length;
// With space: 11
console.log(`Total Characters with space: ${len}`);   
// Without space: 10
console.log(`Total Characters without space: ${len2}`); 


/* String Indices
- Characters can be accessed by using an index. 
- Ang start ng bilang ay 0.  
- We use [] square brackets to access the indices of a string. */  
// Example: 
let firstname = `Adrian`; 
console.log(`Indices result: ${firstname[2]}`); 
// Example para makuha mo yung last letter 
// Bakit nbag minus? Dahil si legnth ay nag uumpisa ang bilang sa 1 
console.log(`Indices result using legnth: ${firstname[firstname.length-1]}`); 


// /* These different methods can manipulate strings in different ways.  
let met = "Dion Severilo"
// met = met.stringMethod();
// 1. toUpperCase() - Turns string to uppercase. 
console.log(`toUpperCase() result: ${met.toUpperCase()
}`) 
// 2. toLowerCase() - Turns string to lowercase. 
console.log(`toLowerCase() result: ${met.toLowerCase()
}`);  


let fullname = "    Adrian Salvania     " 
let totaloffullname = fullname.length
console.log(`Original Legnth of full name ${fullname.trim()}: ${totaloffullname} `)
// 3. trim() - Removes extra spaces on start and end of a string.  
// fullname = fullname.trim(); 
// console.log(`trim() result: ${fullname.length
// }`) 
// Output: 15

// 4. trimEnd() - Removes extra spaces on the end of a string. 
// let trimEnd = fullname.trimEnd();  
// console.log(`trimEnd() result: ${trimEnd.length
// }`) 
// //Output: 19
 
// 5. trimSttart() - Removes extra spaces on the start of a string.  
// let trimStart = fullname.trimStart();
// console.log(`trimEnd() result: ${trimStart.length
// }`)
// Output: 20;

// These different methods can manipulate strings in different ways.
let story = "Ang pusa na si Muning ay cute at malambot ang balahibo. Kaya gusto ko ang aking alagang pusa na si Muning" 

// 1. replace() - Replaces first matching word on a string 
// Example ay gusto kong palitan ang word na pusa ng aso 
// replace("Word na papalitan" to "Word na ipapalit");
// let replaceFirst = story.replace("pusa", "aso");  
// Anng pinalitan niya lang ay ang first matching word
// console.log(replaceFirst); 
// Output: Ang "aso" na si Muning ay cute at malambot ang balahibo. Kaya gusto ko ang aking alagang pusa na si Muning. 
// Kung makikita niyo ang first na ay aso, hindi na pusa.  

// 2. replaceAll() - Replaces all matching words on a string. 
// let replaceAll = story.replaceAll("pusa", "aso"); 
// console.log(replaceAll); 
// Output: Ang aso na si Muning ay cute at malambot ang balahibo. Kaya gusto ko ang aking alagang aso na si Muning.

// 3. slice() - Gets a part of a string by specifying the start and end index. 
// let fn = "Adi Severilo" 
// let slice = fn.slice(0 , 6)
// console.log(`Slice result: ${slice}`); 
// slice (start Index, end Index); 
// Output: Adi Se
// Magsisimula sa index 0, na ang laman ay "A".
// Titigil bago ang index 6, kaya hindi kasama ang character sa index 6 na "v" 
/*
Index 0 = "A"
Index 1 = "d"
Index 2 = "i"
Index 3 = " "
Index 4 = "S"
Index 5 = "e"
 */ 

/* 
String Template Literals 
- Create string values by using `` (backticks).
- You can use ${} to add an expression inside a string such as variables or mathematical expression.  */

// let exampleLiterals = `The word "cat"`;
// console.log(exampleLiterals);

// let number1 = 1 ; 
// let number2 = 2;  
// let sum = number1 + number2 ; 

// Using single qoute 
// console.log(number1+" + "+number2+" = " + sum) 
// Using backticks 
// console.log(`${number1} + ${number2} = ${sum}`); 
// Same output and walang mali, pero mas madaling gamitin ang backticks.


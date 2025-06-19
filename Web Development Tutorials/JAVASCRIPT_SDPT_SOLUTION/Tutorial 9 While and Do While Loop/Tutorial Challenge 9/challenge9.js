/* Create a program that uses while loop to get the summation (sum of all numbers) of an array of numbers */

let numbers = [2, 5, 6, 8 ,10]; 
let i = 0;  
let sum = 0 ;
while (numbers[i]){  
    sum += numbers[i];
    i++; 
}  
console.log(sum);   
// 2 + 5 = 7 
//  7 + 6 = 13 
//  13 + 8 = 21 
//  21 + 10 = 31 
// Output: 31;
 

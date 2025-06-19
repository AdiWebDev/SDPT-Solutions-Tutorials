// Updating Arrays 
// We need to specify the index in order to change/add certain element value.

// Example of Updating
// let cars = ["Mustang", "Dodge"]; 
// si Mustang ay magiging BMW
// cars[0] = "BMW"; 
// alert(cars); 
// Output: BMW, Dodge. 

// Example of Adding  
//Itong Lambo ay ma-add sa dulo kasi ang huling index ay 1.
// cars[2] = "Lamborghini" 
// alert(cars);   
// Output: BMW, Dodge, Lamborghini.


// There more ways to ADD  an element on the array. 

let shirts = ["Uniqlo", "Blue Corner", "Lululemon"];
// 1. length - Use length as an index to add an element to the last index. 
// ADD using .length  
shirts[shirts.length] = "Essentials";
alert(shirts);
// 2. push(value) - Adds an element on the last index. 
shirts.push("OXGYN");
alert(shirts);
// 3. unshift(value) - Adds an element on the first index ; 
shirts.unshift("DBTK"); 
alert(shirts);
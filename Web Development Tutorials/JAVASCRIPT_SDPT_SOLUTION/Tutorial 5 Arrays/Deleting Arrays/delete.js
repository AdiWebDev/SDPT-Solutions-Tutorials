// There are many ways to DELETE an element on the array.  
// index          0         1       2         3     4 
let names = ["Alenere", "David", "Jaymar", "Maye", "Ace"];
// 1. length - Change length to desired number.  
// Ang idisplay lang niya ay bago dumating lang sa sinet mong index 
// names.length = 3; 
// alert(names);  
// Output: Alenere, David, Jaymar. 
// 0, 1, 2  yang lang ang idinisplay
// parang ang sisabi rito na huwag mo ng idisplay mula 3 hanggang sa mga susunod.

// 2. pop() - Deletes the last element. 
// names.pop(); 
// alert(names);  
// Output: Alenere, David, Jaymar. Maye.

// 3. shift() - Deketes the first element. 
// names.shift(); 
// alert(names); 
// Output:  David, Jaymar. Maye, Ace.

// 4. slice(start, end) - Gets a part of the array.  
// index 1 to index 3; 

let sliced = names.slice(1 ,3);   
alert(sliced); 
// Output: David, Jaymar.

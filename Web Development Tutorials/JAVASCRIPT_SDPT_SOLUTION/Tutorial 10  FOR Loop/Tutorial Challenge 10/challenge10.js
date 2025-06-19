/* Create an array of names then search a name using any for loop on the array. 

OUTPUT: Found{name} if the name exists in the array, otherwise output "Not Found* if the name does not exist in array*/ 

let names = ["Adrian", "Adi", "Dion", "Sevi"]; 
let search  ="Adi" 
let isFound = false;

// For Loop
// for(let i = 0; i < names.length; i++){ 
//     if(names[i].toLowerCase() === search.toLowerCase()){ 
//         isFound = true;
//          console.log(`Found ${names[i]}`); 
//          break;
//     }  

// }  
// if(!isFound) console.log("Not Found");


// FOR IN Loop
// for(let i in names){ 
//     if(names[i].toLowerCase() === search.toLowerCase()){ 
//         isFound = true;
//          console.log(`Found ${names[i]}`); 
//          break;
//     }
// } if(!isFound) console.log("Not Found");
 

// FOR OF Loop
// for(let name of names){ 
//     if(name.toLowerCase() === search.toLowerCase()){ 
//         isFound = true;
//          console.log(`Found ${search}`); 
//          break;
//     } 

// } if(!isFound) console.log("Not Found");  




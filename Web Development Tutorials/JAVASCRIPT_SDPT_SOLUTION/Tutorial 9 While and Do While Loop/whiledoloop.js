/* WHILE loop 
- Used to execute a block of code, while the condition is met/true*/
 
let i = 0; 

// while (i<5){ 
//     console.log(i); 
//     i++;
// }

/* ITERATE Array 
- You can use while loop to read through all the array elements. */

let people = ["David", "Alenere", "Gilbert", "James"]; 
let x = 0 ; 
// while(people[x]){ 
//     console.log(people[x]); 
//     x++;
// }

//  if gusto mo reverse

// let x = people.length-1 ; 

// while(people[x] !==undefined){ 
//     console.log(people[x]); 
//     x--;
// } 


/* BREAK Keyword 
- You can use the break keyword to break out of a loop earlier than expected
- Kung mameet na yung condition hindi na siya tutuloy kasi brineak mo na*/

// let search = "Gilbert"
// while(people[i]){ 
//     // if index ang hahapin, gamitin mo yung i or incrementation.
//     // if(i === 2){ 
//     //     break;
//     // } 
//     // if ang hahanapin mo ay ang array element, gamitin mo ito variable[i] === "string_value"; 
//     if(people[i] === search) { 
//         console.log(`You found ${search}`); 
//         break;
//     } 
//         i++; 
// } 


/* DO-WHILE Loop
- Always runs the code once before checking the condition. 
- Gagawin niya muna yung code bago mag iterate  */ 

// do{ 
//     console.log("Hello"); 
//     i++;
// }while(i<5);
// ✅ while → Check muna bago execute
// ✅ do...while → Execute muna bago check
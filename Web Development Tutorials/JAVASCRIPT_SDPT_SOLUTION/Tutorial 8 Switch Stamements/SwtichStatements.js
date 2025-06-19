/* SWITCH staement
- Are used to execure code depending on a case. It acts like Conditional Statements but can only check equality.*/

/* BREAK Keyword
- break; is neccessary after a case since it will let the program break out of the switch statement. 
- Without it, the switch statmement will continue running all code blocks. */ 

/* DEFAULT Keyword 
- Default is used to handle all cases that were'nt specified. */


// let diifficulty = 3;  

// switch(diifficulty){ 
//     case 1 : 
//         alert("Easy"); 
//         break; 
//     case 2: 
//         alert("Normal"); 
//          break; 
//     case 3 :
//         alert("Hard");
//         break;
//     default: 
//         alert("Invalid Difficulty."); 
//         break;
    
// } 


/* COMMON Case 
- You can speicift two or more cases in a code block  
- Kumbaga sa Logical Operator isa siyang OR*/  

let letter = "a"; 

switch(letter){ 
    case "a": 
    case "A": 
        alert("Apple");
        break; 
    case "b": 
    case "B": 
        alert("Ball");
        break; 
    default: 
        alert("Unknown Letter");
        break;
    
}
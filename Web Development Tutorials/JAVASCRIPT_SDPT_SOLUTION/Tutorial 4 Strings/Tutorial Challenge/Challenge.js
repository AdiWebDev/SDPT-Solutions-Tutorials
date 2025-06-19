/* Create a program that uses variables to display the output below.

OUTPUT

Adi, the friendly neighbor, waved at Dion as she walked by Dion's house. Dion smiled back and invited Adi in for a cup of coffee.
*/  

let adi = "Adi"; 
let dion = "Dion"; 
let pronouns ="she"; 

// Using qoute
// alert(adi + ", the friendly neighbor, waved at " + 
//     dion +  " as "+ pronouns + 
//      " walked by "+ dion +"'s house. " +
//       dion + " smiled back and invited "
//      + adi + " in for a cup of coffee.");   

// Using backticks 
pronouns = pronouns.replace("she", "he");
alert(`${adi}, the friendly neighbor, waved at ${dion} as ${pronouns} walked by ${dion}'s house. ${dion} smiled back and invited ${adi} in for a cup of coffee.`);



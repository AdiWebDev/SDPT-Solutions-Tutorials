let people ={
    firstname:"Adi",
    lastname: "Dia",  
    age: 22,
     province: "Bulacan"
    //, { 
    //     firstname:"Dion",
    //     lastname: "Severilo",  
    //     age: 22,
    //     province: "Cebu"
    // }, 
    // {
    //     firstname:"Honey",
    //     lastname: "Matula",  
    //     age: 22, 
    //     province: "Davao"
    // } 
};   
// i is the key, and the people is JSON.
/* We can use FOR/IN Loop to ITERATE over all the keys inside a JSON. */
// for(let i in people){  
//     console.log(i);
//     console.log("Personal Information");
//     console.log(`First name: ${[people[i].firstname]}`); 
//     console.log(`Last name: ${[people[i].lastname]}`); 
//     console.log(`Age: ${people[i].age}`);
//     console.log(`Province: ${people[i].province}`)
// } 

/* Object.keys() Method,
- Returns the keys of a JSON in an array format. */ 

let keys = Object.keys(people);
for(let i = 0; i<keys.length; i++){ 
    console.log(people[keys[i]]);
} 
// Para malaman kung ilan laman ng JSON
let size = Object.keys(people).length; 
console.log(size);
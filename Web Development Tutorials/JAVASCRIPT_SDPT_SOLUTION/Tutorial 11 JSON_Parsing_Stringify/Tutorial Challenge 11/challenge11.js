/* Create an array of JSONs with differenet keys and values
Iterate the array and display all its values in an orderly way*/

 

let people =[
    { 
        firstname:"Adi",
        lastname: "Dia",  
        age: 22,
        province: "Bulacan"

    }, { 
        firstname:"Dion",
        lastname: "Severilo",  
        age: 22,
        province: "Cebu"
    }, 
    {
        firstname:"Honey",
        lastname: "Matula",  
        age: 22, 
        province: "Davao"
    } 
 
];  
 
// Using for in loop
// for(let i in people){ 
//     console.log("Personal Information");
//     console.log(`First name: ${[people[i].firstname]}`); 
//     console.log(`Last name: ${[people[i].lastname]}`); 
//     console.log(`Age: ${people[i].age}`);
//     console.log(`Province: ${people[i].province}`)
// } 

// for loop  
for(let i = 0; i<people.length; i++){ 
    console.log(`First name : ${[people[i].firstname]}`); 
    console.log(`Last name  : ${[people[i].lastname]}`); 
    console.log(`Age        : ${people[i].age}`);
    console.log(`Province   : ${people[i].province}`) 
    console.log(" ");
}
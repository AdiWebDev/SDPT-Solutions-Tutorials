/* You can READ specific values of a JSON by using its key surrounded by []  
- You can READ specific values of a JSON by using a period followed by the key
- You can READ specific values of a JSON by using a period follow by the key.
- You can read array values in a JSON by using its key and accessing it normally by index. 
- You can read JSON values in a JSON by using its key an accessing it normally by key.
*/  


let person = { 
    firstname: "David", 
    lastname: "SDPT",
    age: 22 ,
    //Array 
    hobbies:["Coding", "Basketball", "Sleeping"],
    // Nested Json 
    pets:{
        1:{
            name: "Shadow",
            type: "Dog",
            breed: "Shihtzu"
        },
        2:{
            name: "Mocha",
            type: "Cat",
            breed: "Persian"
        }, 
    } 
};  

// Read using square bracket[] 
// console.log(person["firstname"])

// Read using period . 
// console.log(person.lastname);

// Reading the array
// console.log(person["hobbies"][1]);
// console.log(person.hobbies[2]);

// Reading the json value inside a json value
console.log(person["pets"][2]["name"]); 
console.log(person.pets[2].type);

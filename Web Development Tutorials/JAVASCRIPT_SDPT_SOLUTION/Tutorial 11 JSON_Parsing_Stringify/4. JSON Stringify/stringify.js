/* JSON Stringify
- You can convert JSON into string by using the JSON.stringify{}*/

// Cinovert niya yung JSON to string
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

console.log(person) 
let strPerson = JSON.stringify(person); 
console.log(strPerson);
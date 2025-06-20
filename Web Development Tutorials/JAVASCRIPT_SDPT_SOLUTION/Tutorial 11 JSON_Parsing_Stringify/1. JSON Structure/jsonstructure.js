/* JSON (JavaScript Object Notation) 
- File format that is commonly used in transporting data, via API or other means. */ 

/* JSON Structure 
- A JSON Data should have a key|value pair and a colon in the middle JSONs should be surrounded by [] 
- JSON can have multiple JSON Data by using commans as separators. 
- JSONs should be surrounded by []
- JSON can also have arrays as its value.
- JSON can also have JSONs as its vale*/  

//Example
// If array json []
//  If isang json lang {}
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



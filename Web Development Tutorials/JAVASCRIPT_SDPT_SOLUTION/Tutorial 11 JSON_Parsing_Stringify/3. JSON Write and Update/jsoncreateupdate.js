/* JSON Write
- You can UPDATE specific values of a JSON by using its key surrounded by [] and assigning a value to it. 
- Assingning value to a non-exisient key will result into adding it.
- You can also  UPDATE speicific values of a JSON by using a period followed by the key and assigning a value to it.*/ 

let person =  { 
    firstname: "David",
    lastname: "SDPT", 
    age: 22, 
    hobbies: ["Coding", "Basketball", "Eating"], 
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
} 
// If hindi pa nag eexist yung key na yon ma-add siya sa JSON natin.
// Create New key|value 
person["sex"] = "M"; 
console.log(person); 

// Update value
person.firstname = "Alenere"; 
person.hobbies[1] = "Volleyball"; 
console.log(person);  


/* Create a JSON and make the keys a subject name and the value a corresponding grade. 

Use FOR.IN Loop  to ITERATE through the JSON and display the subjects and their grade, make sure to also compute the average of all the grades and display it.*/ 

let grades ={
    Math: 94,
    Science: 97,
    English: 93,
    Filipino:95,
    Computer:92
};
  
let average = 0;
let size = Object.keys(grades).length;
for( let i in grades){ 
    console.log(`${i} : ${grades[i]}`); 
  average = average + grades[i]; 
   
} 

 console.log(average/size);

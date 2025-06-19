/* Use three arrays and use each index as a data for a person.  
    Access and output one of the data by using a variable for the index.
*/ 

/* Information       Example Output
             Index 0
   - First Name      First Name: David. 
   - Last Name       Last Name: SDPT. 
   - Age             Age: 21   */
let firsname = ["David", "Adi",     "Dion"];
let lastname = ["SDPT", "Lorenzo", "Severilo"]; 
let age = [21, 22, 24]; 

// maganda if id or kahit anong value  na mag sstore ng index na hinahabap mo. 
// kung ano ang value ng id mo, yun ang index na hahanapin. 
// if id = 0 lahat ngayon ng index na 0 ay iyon ang idedesplay niya. 

let id = 0
alert(`First Name: ${firsname[id]}`) ;
alert(`Last Name: ${lastname[id]}`) ;
alert(`Age: ${age[id]}`); 

// Firstname ay hinanap niya ang index 0 kasi yun ang laman ng variable id natin.
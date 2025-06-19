/* Variables 
- Temporary containers that can hold different data such as  text, numbers, collections objects and etc. 
- Can be named for easy rea/write acess by the programmer it is called an identifier.
*/

/*Identifier - variable name that has been set by the programmer. 
1. Idetifiers must be UNIQUE. 
2. Identifiers are CASTE SENSITIVE.
3. RESERVE KEYWORDS are NOT Allowed as Identifiers. 
4. Idetifiers MUST start with a LETTER, $ or _ 
5. Idetifiers CANNOT  contain SPEICIAL CHARACTERS.*/ 

// 4 Ways of Decrlaring Variables
// 1. Automatic variables automatically decalre themselves. 
/*example: 
    x = 5; 
    y = 12.5; 
    z = "Hello Wolrd"; */ 



/* 2. Using let - reccomended way. 
- Uses the let keyword, it cannot be redeclared. It is preferred to be used by default when declaring variables. 
- Cannot be redeclared means is bawal mo na ulit gamitin if nagamit mo na yung let na yon. for example is nagamit mo na yung let x, baweal ka na ulit gumawa non.

example: 
    let x = 5;
    let y = 12.5; 
    let z ="Hello World"; 
*/ 
/* 3. Using const - it cannot be redeclared these variables cannot be reassigned/changed. 
example: 
    const x = 5; 
    const y = 12.5; 
    const z = "Hello World*/  

/* 4. Using var - it can be redeclared and should only be used when you want to support older brosers. 

example:
    var x = 5; 
    var y = 12.5; 
    var z = "Hello World;*/


let $name = "Adi";  
// Using console
// console.log($name); 
// // Using innerHTML 
// document.getElementById("idforp").innerHTML = $name; 
// Using alert
alert($name); 

// Pwede ka ulit mag lagay ng value sa kaniya 
$name = "Salvania";
alert($name); 

// if sa cons ka gagawa niyan. hindi gagana kasi hindi isya pwede baguhin e.


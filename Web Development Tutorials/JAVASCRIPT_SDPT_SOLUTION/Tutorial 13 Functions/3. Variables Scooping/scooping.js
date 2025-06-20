/* Variable Scooping. 
- Is the scope of where a variable can be accessed. */

/* Global Variables. 
- Variables that can be accessed everywhere in our avaScript file it is typically declared outside any code blocks. 
- You can access anywhere.*/ 
let x = 5; 
function sayX(){ 
    console.log(x);
} 
sayX() 

/* Local Variables. 
- Variables that can only be accessed in a specific code block. 
- Maaccess mo lang siya sa loob ng block na iyon or kinakapalooban ng parenthesis na iyon*/
/* Local Variable */
function addX(num){ 
    let x = 5;
    console.log(x+num);
} 
addX(2);

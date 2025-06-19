/* NESTED Conditional Statements  
You can nest condition statements inside a condition statement. */ 
let age = 17; 
let experience = 0; 

if(age >= 18){ 
    if(experience > 1){ 
        console.log("You're Hired");
    }
    else{
         console.log("You don't have experience. ");
    }
} 
else{ 
    console.log("You are a Minor");
} 

/* Explanation :  
    Una i-check niya if ang age mo ay greater than 18. Kapag true, tatanungin ka ulit ng isa condition, kung ikaw ba ay may experience na greter than 1, kung ganon ikaw ay hired, pero pag hindi, sa else dederetso na masasabi na wala kang experience or hindi sapat. 
    Pag false naman sa age, gagawin niya ang condition na you are a minor, at pagtapos non mag eend na.
*/

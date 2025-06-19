/*  Create a program that outputs the standing of a student based on their general average.
Given the following conditions. 
- 101 above = Invalid Grade 
- 98-100 = With Highest Honor.
- 95-97 = With High Honor. 
- 90-94 = With Honor. 
- 75-89 = Passed.
- 74 below = Failed.
*/ 

let grade = 74;

// if(grade>100){ 
//     alert("Invalid Grade");
// }
// else if(grade>=98){ 
//     alert("With Highest Honor");
// }
// else if(grade>=95){ 
//     alert("With High Honors");
// }else if(grade>=90){ 
//     alert("With Honors.");
// }else if(grade>=75){ 
//     alert("Passed.");
// }else if (grade<=74){ 
//     alert("Failed")
// }else{ 
//     alert("Invalid Grade"
//     )
// }

// Another method 

if (grade<74){ 
    alert("Failed") } 

else if(grade<=89){ 
    alert("Passed.");
} 
else if(grade<=94){ 
    alert("With Honors.");
}
else if(grade<=97){ 
    alert("With High Honors");
}
else if(grade<=100){ 
    alert("With Highest Honor");
}
else{ 
    alert("Invalid Grade"
    )
}
/**
   Create a Function that accepts an array of numbers. Iterate the array inside the function and return the summation (sum o all numbers) of the arry and display it.
 */ 


   let number =  [1,1,1,1,1]; 
  let num = 0;
   function summation(numbers){ 
       for( let i = 0; i< number.length;  i++){ 
              num += number[i];
       } 
       return  num;
   }   
    let summm = summation(num); 
   console.log(summm); 


  //  Better 
   function SUMMATION(arrNum){ 
        let total  = 0; 
       for( let i = 0; i< arrNum.length;  i++){  
              total += arrNum[i];
       } 
       return  total;
   }   
   
  let sumtotal =  SUMMATION([2,2,2,2,2,]); 
  console.log(sumtotal);
  
  


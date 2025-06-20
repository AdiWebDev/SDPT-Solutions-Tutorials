/* You can convert valid Strings into JSON by using the JSON.parse{} method.  */
// String convert to JSON

let strPerson = `{"firstname" : "David", "lastname": "SDOT", "age":22}`; 

console.log(strPerson);

let parsePerson = JSON.parse(strPerson);
console.log(parsePerson);
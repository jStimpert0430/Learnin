//Joshua Stimpert - week 6 GA part 1

function myFunction(){
  var a = 100;
  try{
    alert("Value of variable a is: " + a);
  }

  catch(e){
    alert("Error: " + e.description);
  }
}


//example 2
var empcode = prompt('Input the Employee code (Between 3 to 8 characters): ', "");

try{
  if(empcode.length>8)
    throw "error1";
  else if(empcode.length<3)
    throw "error2";
}
catch(err){
  if(err=="error1")
    console.log("The employee code length exceeds 8 characters.");
  else if(err=="error2")
    console.log("The employee code length is less than 3 characters.");
}

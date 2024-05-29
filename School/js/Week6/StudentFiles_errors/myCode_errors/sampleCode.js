/*
var x = 2;
var y = 3;


console.log(x + y);

/*
var windowObject;
var windowFeatures = "menubar = yes, location = yes, scrollbars = yes, status = yes";

function openPopup()
{
	windowObject = window.openObject("http://www.msn.com", "MSN_WindowName" , strWindowFeatures)
}

try...catch...finally syntax

 try 
 {
         // Code to run
         [break;]
 } 
      
      catch( e ) 
	  {
         // Code to run if an exception occurs
         [break;]
      }
      
      [ finally 
	  {
         // Code that is always executed regardless of 
         // an exception occurring
      }]
*/

//Example 1

/*
function myFunctionn()
{
	var a = 100;
	try 
	{
		alert("Value of variable a is: " + a );
	}
	
	catch(e) 
	{
		alert("Error: " + e.description );
	}
}

*/

//Example 2
/*
var empcode = prompt("Input the Employee code : (Between 3 to 8 characters):","");
try
{
	if(empcode.length>8)
	{
	throw "error1";
	}
	
	else if(empcode.length<3)
	{
		
	throw "error2";
	}
	}
	catch(err)
	{
	if(err=="error1")
	{
	console.log("The Employee code length exceed 8 characters.");
	}
	if(err=="error2")
	{
	console.log("The Employee code length is less than 3 characters");
	}
}
*/
























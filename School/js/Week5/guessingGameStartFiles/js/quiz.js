//Joshua Stimpert - Week 5 GA - Fall 2019 - Quiz


let answer = prompt('What programming language is the name of a gem?').toUpperCase();

if(answer == 'RUBY' || answer == 'PERL'){
  document.write("<p>You are right, good thinking!</p>");
}
else{
	document.write("<p>Wrong!, the answer was either ruby or perl!");
}

//question 2
answer = prompt('The [answer here] language is the symbolic programming language that lies closest to the machine language in form and content.').toUpperCase();

if(answer == "ASSEMBLER" || answer == "ASSEMBLY"){
	document.write("<p>Congratulations! You got this one right too!");
}
else{
	document.write("<p>Wrong!, the answer was [Assembler]");
}

















// On your own, complete the following tasks:
/*
 1)  Update the condition to incorporate the .toUpperCase method === 'RUBY'
     this way, it doesn't matter if the user enters the answer in lowercase,the condition
     is passed since the answer is converted to upper case letters; therfore matching the string

 2)  Create another question that relates to programming, incorporating code blocks for
     a correct and incorrect answers from the user.

*/

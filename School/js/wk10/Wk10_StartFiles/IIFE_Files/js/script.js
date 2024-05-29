//Joshua Stimpert - Week 10GA - Web Development with Javascript - Fall 2019

//Normal Function
function guessNumber(){
  let numGuess = Math.round(Math.random() * 100);
  if(numGuess > 50){
    console.log("You guessed!");
  }
  else{
    console.log("You did not guess correctly!");
  }
}
guessNumber();

//Anonymous Function
let guessNumber = function(){
  let numGuess = Math.round(Math.random() * 100);
  if(numGuess > 50){
    console.log("You guessed!");
  }
  else{
    console.log("You did not guess correctly!");
  }
}

let myGuess = guessNumber();

//IIFE function - Error trying to access data from within
//(function(){
  //let aName = "Donald";
//})();

//console.log(aName);

//IIFE function which returns its data
let Name = (function(){
  let aName = "Donald";
  return aName;
})();

console.log(Name);

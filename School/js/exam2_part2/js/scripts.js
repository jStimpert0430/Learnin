//Joshua Stimpert - Exam 2 pt 2 - Web Development with Javascript - Fall 2019

'use strict';

function sumInput(){

  let numbers = [];
  let sum = 0;
  let name = prompt("Please enter the name of the person perfoming this calculation");
  while(true){
    let value = prompt("Please enter a number to add to a sum! press \"Cancel\" to quit!", 0);
    if(value == "" || value == null || !isFinite(value))
      break;
    numbers.push(+value);
  }

  for(let number of numbers){
    sum += number;
  }

  return name.toUpperCase() + " has entered the total sum of: " + sum;
}

document.write(sumInput());

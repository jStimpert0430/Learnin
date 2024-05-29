//Joshua Stimpert Week 3 GA script.js
let year = 2019;
let fName = 'Joshua';
let yrKMI = year - 31;
console.log('Wow ' + fName + ', you were born in the year: ' + yrKMI + '!');

document.write('Wow ' + fName + ', you were born in the year: ' + yrKMI + '!')

//part2
x = 400;
y = 600;
sum = x+y;
console.log(sum);

//modulo
a = 5;
b = 3;
answer = a % b;
console.log(answer);

//bool
c = 5;
d = 8;
e = c == d;
console.log(e);

//logical operators
let m = 3;
let n = -2;

console.log(a>0 && b>0)
console.log(a>0 || b>0)
console.log(!(a>0 || b>0));
console.log(m>n);

//order precedence
let num1 = 10;
let num2 = 50;
let ans1 = (num2 + num1) / (8 + 2);
console.log(ans1);

let num3 = 20;
let num4 = 75;
let ans2 = num4 / num3 + 8 - 3;
console.log(ans2);

let wholesalePrice = 5.45;
let retailPrice = 9.99;
let quantity = 47;
let salesTotal = retailPrice * quantity;
let profit = salesTotal - (wholesalePrice * quantity);
console.log(profit);

//escape Characters;

let msg = 'it\'s alright!';
console.log(msg);

//Unary operators
let studentID = 100;
let curStudentID;

curStudentID = ++studentID;
console.log(curStudentID);
curStudentID = ++studentID;
console.log(curStudentID);

curStudentID = studentID++;
console.log(curStudentID);
curStudentID = studentID++;
console.log(curStudentID);

//functions

function calculateAge(birthYear){
  return 2019 - birthYear;
}

let ageKMI = calculateAge(1988);

document.write('<br> Your age is: ' + ageKMI);

let ageJMJ = calculateAge(1944);
let ageDMV = calculateAge(1963);
document.write('<br> KMI is: ' + ageKMI + '<br> JMJ is: ' + ageJMJ + '<br> DMV is: ' + ageDMV);

function yearsUntilRetirement(year, firstName){
  let age = calculateAge(year);
  let retirement = 65 - age;

  if(retirement > 0){
    document.write('<br><br>' + firstName + ' retires in ' + retirement + 'years.<br>');
  }
  else{
    document.write(firstName + ' is already retired.');
  }
}

yearsUntilRetirement(1988, 'Joshua');
yearsUntilRetirement(1944, 'Andy');
yearsUntilRetirement(1963, 'Marie');

//anonymous functions
let prodNumbers = function (a, b){return a * b};
let answer2 = prodNumbers(4, 3);
document.write('<br> ' + answer2 + '<br>');

function alertRandom(){
  var randomNumber = Math.floor(Math.random() * 10) + 1;
  alert(randomNumber);
}

alertRandom();
alertRandom();
alertRandom();
alertRandom();


let alertRandom2 = function(){let randomNumber = Math.floor(Math.random() * 10) + 1; alert(randomNumber);}

function getRandomNumber(upper){
  let randomNumber = Math.floor(Math.random() * upper) + 1;
  return randomNumber;
}

console.log(getRandomNumber(20));
document.write(getRandomNumber(50));

//events

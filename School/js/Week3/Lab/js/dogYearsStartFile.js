//dogYearsStartFile --Joshua Stimpert -fall 2019

//store the value of my current age
const myAge = 31;

//store the value of 2
let earlyYears = 2;
earlyYears *= 10.5;

//subtracting 2 initial years from overall year count and storing it here
let laterYears = earlyYears - 2;

//Multiply later years by 4 to get years in dogyears, minus initial 2
laterYears *= 4;


console.log(earlyYears);
console.log(laterYears);

//add years
myAgeInDogYears = earlyYears + laterYears;

//myName
myName = "Joshua".toLowerCase();
//print to the console values stored in variables
document.write('My name is ' + myName + '. I am ' + myAgeInDogYears + ' years old in dog years.');

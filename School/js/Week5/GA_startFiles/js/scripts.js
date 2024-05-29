//Joshua Stimpert - week 5 GA - Fall 2019 Arrays script

let fruits = ["apple", "peach", "orange", "pear", "banana", "grape", "strawberry"].sort();

let vegetables = new Array("corn", "bean", "brocolli", "spinach", "celery", "cabbage", "kale");
console.log(fruits + "\n");

console.log(fruits.length + "\n");

console.log(fruits[3]);

document.getElementById("items").innerHTML = fruits;

var fruits2, uList, frtLen, i;

fruits2 = ['apple', 'peach', 'orange', 'pear', 'banana', 'grape', 'strawberry'];

frtLen = fruits2.length;
uList = "<ul>";

for(i = 0; i < frtLen; i++){
  uList += "<li>" + fruits2[i] + "</li>";
}
uList += "</ul>";

document.getElementById("items").innerHTML = uList;

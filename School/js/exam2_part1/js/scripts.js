//Joshua Stimpert - Exam 2 - Web Development with Javascript - Fall 2019

// 1: Select / (get) the element with the ID 'about'.
//    Store the element in the variable `about`.
//	  Use a method to modify the about id with a color border of your choice

const about = document.getElementById("about");
about.style.color = randomColor(120);


// 2: Select all the <h2> elements in the document.
//    Using a loop, set the color of the <h2> elements to a different color.

const header2 = document.querySelectorAll("h2");

for(let i = 0; i < header2.length; i++){
  header2[i].style.color = randomColor(120);
}


// 3: Select all elements with the class '.card'.
//    Using a loop, set their background color to the color of your choice.

const cards = document.getElementsByClassName("card");

for(i = 0; i < cards.length; i++){
  cards[i].style.backgroundColor = randomColor(155);
}

// 4: Select only the first <ul> in the document.
//    Assign it to a variable named `ul`.
//    Modify the color to one of your choice.

const ul = document.querySelector("ul");

ul.style.border = "2px solid " + randomColor(120);  // just need to change the hex value

// 5: Select only the second element with the class '.container'.
//    Assign it to a variable named `container`.

const container = document.getElementsByClassName('container')[1];



// 6: Select all <a> elements that have a 'title' attribute.
//    Set their color value to the color of your choice.

const titles = document.querySelectorAll('[title]');
for(i = 0; i < titles.length; i++){
  titles[i].style.color = randomColor(155);
}


//Just found this function on stack overflow @ https://stackoverflow.com/a/17373688 to generate random colors for the assignment.
//Builds a color from hue, saturation, and a value then returns either a string of the hsv color or the built hsv color with an extra 0 to prevent a short value.
function randomColor(brightness){
  function randomChannel(brightness){
    var r = 255-brightness;
    var n = 0|((Math.random() * r) + brightness);
    var s = n.toString(16);
    return (s.length==1) ? '0'+s : s;
  }
  return '#' + randomChannel(brightness) + randomChannel(brightness) + randomChannel(brightness);
}

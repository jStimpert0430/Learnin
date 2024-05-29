//Joshua Stimpert - Week5Lab - Fall 2019

let colorArray = ['Green', 'Yellow', 'Blue', 'Black', 'Gray', 'Red'];

document.write("<h1>Elements of the first array</h1>");
document.write("<ul>");
for(let i = 0; i < colorArray.length; i++){
  //Since each value in the array is just a color string, we can convert that to lowercase to use for a dynamic inline styling on the <li> elements
  document.write("<li style=\"color:" + colorArray[i].toLowerCase() + ";\">" + colorArray[i] + "</li>");
}
document.write("</ul>");
//Divider line
document.write("<div class = \"nav-bar\"></div>");

document.write("<h1>Fun Japanese Arcade Games</h1>");
let gameArray = ['Beatmania IIDX', 'Initial D', 'Pop\'n music', 'Street Fighter', 'Parodious', 'Taiko no Tatsujin'];

document.write("<ul>");
for(i = 0; i < gameArray.length; i++){
  document.write("<li>" + gameArray[i] + "</li>");
}
document.write("</ul>");
document.write("<div class = \"nav-bar\"></div>");

document.write("<h1>My favorite items from both of these arrays are the color \'" + colorArray[0] + "\' and the game \'" + gameArray[0] + "\'.")

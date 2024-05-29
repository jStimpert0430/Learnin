//Joshua Stimpert - Week 7 GA - Web development with Javascript fall 2019
const myHeading = document.getElementById('myHeading');
const myButton = document.getElementById('myButton');
const myColorInput = document.getElementById('myColorInput');
const myGreenList = document.getElementsByTagName('li');

for(let i = 0; i < myGreenList.length; i++){
  myGreenList[i].style.color = '#21a221';
}

const notGreen = document.querySelectorAll('.notGreen');

for(let i = 0; i < notGreen.length; i++){
  notGreen[i].style.color = '#f00';
}

const evens = document.querySelectorAll('li:nth-child(even)');

for(let i = 0; i < evens.length; i++){
  evens[i].style.backgroundColor = '#bdc2bd';
}

myButton.addEventListener('click', () => {
  myHeading.style.color = myColorInput.value;
});

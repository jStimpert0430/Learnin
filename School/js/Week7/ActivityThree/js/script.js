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

const toggleList = document.getElementById('toggleList');
const listDiv = document.querySelector('.list');
const input = document.querySelector('input');
const p = document.querySelector('p.description');
const button = document.querySelector('button');

toggleList.addEventListener('click', () => {
  if(listDiv.style.display == 'none'){
    toggleList.textContent = 'Hide list';
    listDiv.style.display = 'block';
  }
  else{
    toggleList.textContent = 'Show list';
    listDiv.style.display = 'none';
  }
});

button.addEventListener('click', () => {
  p.innerHTML = input.value + ':';
});

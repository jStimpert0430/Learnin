//Joshua Stimpert W3 GA part 2

let btn = document.querySelector('button');

function random(number){
  return Math.floor(Math.random()*number);
}

function bgChange(){
  let randomColor = 'rgb(' + random(255) + ',' + random(255) + ',' + random(255) + ')';
  document.body.style.backgroundColor = randomColor;
}

btn.addEventListener('click', bgChange);

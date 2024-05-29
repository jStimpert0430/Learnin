//Joshua Stimpert - Week 14 GA - playSounds -  Web Development with Javascript - Fall 2019


function removeTransition(e){
  if(e.propertyName !== 'transform')
    return;
  this.classList.remove('playing');
}

function playSound(e){
  const audio = document.querySelector(`audio[data-key="${e.keyCode}"]`);
  const key = document.querySelector(`div[data-key="${e.keyCode}"]`);
  if(!audio) return;
  key.classList.add('playing');
  audio.currentTime = 0;
  audio.play();
}

const keys = document.querySelectorAll('.key');
keys.forEach(key => key.addEventListener('transitionend', removeTransition));
window.addEventListener('keydown', playSound);
//<!--Joshua Stimpert- Week 13 GA - Web Development with Javascript - Fall 2019!-->



let startBtn = document.getElementById('start'),
    stopBtn = document.getElementById('stop'),
    pauseBtn = document.getElementById('pause'),
    hour = document.getElementById('h'),
    minute = document.getElementById('m'),
    second = document.getElementById('s');

startBtn.addEventListener('click', start);
stopBtn.addEventListener('click', stop);
pauseBtn.addEventListener('click', pause);

var stop = false;
var pause = false;

function start(){
  let h = parseInt(hour.innerText),
      m = parseInt(minute.innerText),
      s = parseInt(second.innerText);

  s = s + 1;

  if(s == 60){
    s = 0;

    if(m == 60){
      m = 0;
      h = h + 1;
      hour.innerText = h + " h";
    }
    m = m + 1;
    minute.innerText = m + " m";
  }
  if(!stop){
    if(!pause){
      second.innerText = s + " s";
      setTimeout(start, 5);
    }
    else{
      pause = !pause;
    }
  }
  else{
    stop = !stop;
  }
}

function stop(){
  stop = true;
  second.innerText = 0 + " s";
  minute.innerText = 0 + " m";
  hour.innerText = 0 + " h";
}

function pause(){
  pause = true;
}

//Joshua Stimpert - Week 10GA - Web Development with Javascript - Fall 2019

"use scrict";

function parseData(){
  let formData = document.cookie;
  let formArray = [];
  let list = document.querySelector("div.results ul");
  formArray = formData.split("; ");
  for (let i = 0; i < formArray.length; i++){
    let newItem = document.createElement("li");
    newItem.innerHTML = formArray[i];
    list.appendChild(newItem);
  }
}

if(window.addEventListener){
  window.addEventListener("load", parseData, false);
}
else if(window.attachEvent){
  window.attachEvent("onload", parseData);
}

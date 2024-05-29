//Calculate tip -- Joshua Stimpert - Web Development with Javascript -- Fall 2019
function calculateTip(){
  const billAmt = document.getElementById("billamt").value;
  const serviceQual = document.getElementById("serviceQual").value;
  let numOfPeople = document.getElementById("peopleamt").value;

  if(billAmt == "" || serviceQual == 0){
    alert("please enter values");
    return;
  }

  if(numOfPeople == "" || numOfPeople <= 1){
    numOfPeople = 1;
    document.getElementById("each").style.display = "none";
  }
  else{
    document.getElementById("each").style.display = "block";
  }

  let total = (billAmt * serviceQual) / numOfPeople;

  total = Math.round(total * 100) / 100;

  total = total.toFixed(2);

  document.getElementById("tip").innerHTML = total;
};
  document.getElementById("calculate").onclick = function() {calculateTip();}

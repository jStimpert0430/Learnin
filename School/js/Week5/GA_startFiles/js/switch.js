//Joshua Stimpert -- Week 5 GA -- Fall 2019 -- switch script

let feeling = prompt("How are you feeling today?").toLowerCase();

switch(feeling){
  case "happy":
    console.log("Awesome, I'm feeling happy too!");
    break;
  case "sad":
    console.log("That's too bad, I hope you feel better soon.");
    break;
  case "hungry":
    console.log("Me too, let's get some pizza!");
    break;
  default:
    console.log("I see, thanks for sharing!");
}

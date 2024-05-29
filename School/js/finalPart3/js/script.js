//Joshua Stimpert - Final- Web Development with Javascript

//globals
let wordArray;
let randomWord;
let playerLetters  = [];
let alreadyGuessed = [];
let gameOver = true;
let livesLeft;
let points = 0;
let highScore = 0;
let guessBoxTemplate = $("<div class=\"guessBox\"> </div>")
let guessBoxes = [];
//Added support for random colors on the letter panels, but decided to just stick with one color for aesthetic.
let colorCatalog = ["#D34B3F"]

//Once document is ready, grab word dictionary from ajax call and store it in array
$(document).ready(function(){
    $.ajax({
        url:  'words.txt',
        dataType: "text",
        async: false,
        success: function(data){
          wordArray = data.split("\n");
        }
    })
    //once wordArray is initialized, call reset game to start.
    resetGame();
});

//main game function - each keypress represents a "turn"
$("body").keydown(function(e){
  //valid character inputs
  const charList = 'abcdefghijklmnopqrstuvwxyz';
  const key = event.key.toLowerCase();
  //search valid characters string to see if input matches, if no match is found or letter has already been guessed, end function here; else continue.
  if(charList.indexOf(key) === -1){
    console.log("Not a key");
    return;
  }
  //already guessed this key
  else if(alreadyGuessed.indexOf(key) != -1 && !gameOver){
    $('.guesses h4').html('Already tried this letter!' + '<br><br>Attemps remaining this word:  ' + livesLeft);
    $('.guesses h4').css('color', "#D35B3F");
    return;
  }
  else if(gameOver){
    return;
  }
  //no more attempts
  else if(livesLeft <= 0){
    $('.guesses h4').html('Out of attempts! Press \"New Word\" button to try again!' + '<br><br>Attemps remaining this word:  ' + livesLeft);
    $('.guesses h4').css('color', "#D35B3F");
    return;
  }
  console.log("You have pressed a key.");
  //since key was valid, add to guessed array to prevent from guessing this key again
  alreadyGuessed.push(key);
  console.log(alreadyGuessed.indexOf(key));
  guessLetter(key);
  $('.guesses').find("h3").append(key);
});

$(".newGame").click(function(){
  resetGame();
});

//use this function to initialize gamestart to start
function resetGame(){
  livesLeft=10;
  alreadyGuessed =[];
  playerLetters=[];
  $('.guesses').empty();
  $('.guesses').append("<h2>Enter letters on your keyboard to solve the word!</h2>")
  populateWordPanel();
  $('header h5').html("Total Score<br>" + points)
}

function populateWordPanel(){;
  //Generate new random word
  let lastWord = randomWord;
  //Keep generating a new word until a different word than last time is found
  while(lastWord == randomWord){
    randomWord = wordArray[Math.floor(Math.random() * wordArray.length - 0) - 0];
  }
  //DEBUG: Left this in so people can just test with. Answer is printed in the console each word.
  console.log(randomWord);
  //Add letter panels and fill player's letters with blank spaces equal to word length
  for(var i = 0; i < randomWord.length; i++){
    createLetterPanel('_');
    playerLetters.push('_');
  }
  $('.guesses').append("<h3>Letters entered so far: </h3>");
  //Penalize player for generating a new word before solving previous
  if(!gameOver){
    points -= 3;
    $('.guesses').append('<h4><br><br>-3 point penalty for unfinished word!\n'+ '<br><br>Attemps remaining this word:  ' + livesLeft + '</h4>');
    $('.guesses h4').css('color', "#D35B3F");
  }
  else{
    $('.guesses').append("<h4><br><br>Attemps remaining this word: " + livesLeft + "</h4>");
  }
  //active game
  gameOver =false;
}

//appends a new guessBoxTemplate to the guesses class and initializes it to the value specified by the function call.
function createLetterPanel(inputLetter){
  $(".guesses").append(guessBoxTemplate.clone());
  guessBoxes = document.querySelectorAll(".guessBox");
  guessBoxes[guessBoxes.length - 1].innerHTML = inputLetter;
}


function guessLetter(letter)
{
    //initialize booleans used to check letter guesses
    let goodGuess = false;
    let moreToGuess = false;
    //for loop which loops through the wordLetters array and checks the input letter against them to see if they're correct.
    for (let i = 0; i < randomWord.length; i++){
        if (randomWord.charAt(i) == letter){
          //set guessedletter slot to input letter
            playerLetters[i] = letter;
            guessBoxes[i].innerHTML = letter;
            guessBoxes[i].style.backgroundColor = colorCatalog[Math.floor(Math.random() * colorCatalog.length - 0) - 0];
            goodGuess = true;
        }
        //check to see if the next letter hasn't already been guessed
        if (playerLetters[i] == '_'){
            moreToGuess = true;
        }
    }
    //If correct, add letter to guessed letter string and check if there is more to guess, else print bad guess message and loop again
    if (goodGuess){
        $('.guesses h4').html('Great Job! You found a letter!\n'+ '<br><br>Attemps remaining this word:  ' + livesLeft);
        $('.guesses h4').css('color', "#B0C38D");
        console.log(playerLetters.join(''));
        if (!moreToGuess){
            $('.guesses h4').html('Got it!<br><br> +' + livesLeft + ' points <br><br> Press the \"new word\" button to keep playing!');
            $('.guesses h4').css('color', "#DED797");
            points += livesLeft;
            gameOver = true;
        }
    }
    else{
        livesLeft--;
        $('.guesses h4').html('Letter not found! Minus 1 point.' + '<br><br>Attemps remaining this word:  ' + livesLeft);
        $('.guesses h4').css('color', "#D35B3F");
    }
}

//jQuery hover event handlers
$("button").mouseenter(function() {
  $(this).css("background-color", "#D35B3F");
});

$("button").mouseout(function() {
  $(this).css("background-color", "#718C6A");
});

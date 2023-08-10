
//행맨
var POSSIBLE_WORDS = ["obdurate", "verisimilitude", "defenestrate", 
"obsequious", "dissonant", "today", "idempotent"];

var MAX_GUESSES = 6;
// global variables
var guesses = "";                // all letters guessed so far
var guessCount = MAX_GUESSES;    // number of guesses player has left
var word;

function newGame(){
    var ram = parseInt(Math.random()*(POSSIBLE_WORDS.length));
    word = POSSIBLE_WORDS[ram];
    guessCount = MAX_GUESSES;
    guesses = "";
    var guessbutt =document.getElementById("guessbutton");
    guessbutt.disabled = false;
    updatePage();
}

function updatePage(){
    var cluestr ="";
    for (var i = 0; i < word.length; i++) {
        var letter = word.charAt(i);
        if (guesses.indexOf(letter)>=0) {
            cluestr+=letter+" ";
        }
        else
            cluestr+="_ ";
    }
    document.getElementById("clue").innerHTML = cluestr;
    var guessArea  = document.getElementById("hguessstr");
    if (guessCount==0) {
        guessArea.innerHTML = "You Lose.";
    } else if(cluestr.indexOf("_")<0){
        guessArea.innerHTML = "You Win";
    }else{
        guessArea.innerHTML = "Guesses: "+guesses;
    }
    var image = document.getElementById("hangmanpic");
    image.src = "hangman"+guessCount+".gif";
}

function guessLetter(){
    var input = document.getElementById("hguess");
    var clue = document.getElementById("clue");
    var letter = input.value;
    if(guessCount==0||clue.innerHTML.indexOf("_")<0||guesses.indexOf(letter)>=0){
        return;
    }
    guesses+=letter;
    if(word.indexOf(letter)<0)
        guessCount--;
    updatePage();
}

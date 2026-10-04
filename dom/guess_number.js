const randomNum = parseInt(Math.random() * 100 + 1);
const submit=document.querySelector('#subt');
const userInput=document.querySelector('#guessField');
const guess=document.querySelector('.guesses');
const remaining=document.querySelector('.lastResult');
const loworHi=document.querySelector('.loworHi');
const startOver=document.querySelector('.resultParas');
const p=document.createElement('p')
let prevGuess=[];

let numGuess=1;
let playGame=true;
if (playGame){
    submit.addEventListener('click',function(e){
     e.preventDefault()
     const guess=parseInt(userInput.value)
     console.log(guess)
     validateGuess(guess)
    })};


function validateGuess(guess){
    if(isNan(guess)){
        alert('please enter a valid number')}
        else if(guess<1){
            alert('please enter a number more than 1')
        }
        else if(guess>100){
        alert('please enter a number less than 100')}
        else{
            prevGuess.push(guess)
            if(numberGuess===11){
                displayGuess(guess)
                displayMessage(`game over.random number was ${randomNumber}`)
                
            }
        }
            
            

}
function checkGuess(guess){
    if (guess===randomNum){
        displayMessage(`u guessed right`)
        endGame()
    }
    else if(guess<randomNum){
        displayMessage(`number is too low`)
    }
    else{
        displayMessage(`number is too high`)
    }
}
function displayGuess(guess){
    
//
}
function displayMessage(message){
    //
}
function endGame(){
    //
}
function newGame(){
    //
}








console.log("Welcome to your Magic 8 Ball horoscope!");
//introduction to the programme
let userName = prompt("Please enter your first name");
if (userName != "null") {
    console.log(`Hello ${userName}`);
    //if the user does enter a name then print a greeting using the name
} else{
    console.log("Hello");
    //otherwise just print a general greeting
}

let userQuestion = prompt('What would you like to ask the Magic 8 Ball? (Simple yes or no question please)');
//asking the user to type a question
alert("Your question is: "+ userQuestion);
//printing the question

randomNumber = Math.floor((Math.random() *7) + 1);
//Asking the programme to pick a random number from 0 - 7
console.log(randomNumber);
//log the number picked

if (randomNumber == 0){
    console.log("Answer: It is certain");
}else if (randomNumber == 1){
    console.log("Answer: It is decidedly so");
}else if (randomNumber == 2){
    console.log("Answer: You should be so lucky!");
}else if (randomNumber == 3){
    console.log("Answer: Why are you asking me - I can't tell the future?!");
}else if (randomNumber == 4){
    console.log("Answer: If you need to ask, the answer is probably no!");
}else if (randomNumber == 5){
    console.log("Answer: Outlook not so good");
}else if (randomNumber == 6){
    console.log("Answer: All signs point to yes!");
}else{ (randomNumber == 7);{
    console.log("Answer: Without a doubt!");
    }
}
//Depending on the number selected, the programme prints the response that mataches the number.



console.log("Welcome to the TechTalent-athon!")
let userName = prompt("please enter your first name: ")
//asking for the runner to enter a name
if (userName !="null") {
    console.log(`hello ${userName}`);
//if the user enters a name then use it in a greeting. 
}else{
    console.log("Hello");
}
//if the user enters does not enter a name then use a standard greeting. 

let userQuestion = prompt('How old are you?:');
// asking the user for their age

if (userQuestion >= 18) {
    console.log('You are an adult runner.');
    let userQuestion2 = prompt('Did your register early or late?');
    if (userQuestion == "early") {
    console.log('Your race time will be 9.30am');
//As they are registered early and are over 18 they will race at the early time
    randomNumber = Math.floor((Math.random() *1000) +1);
    console.log (`Your race number is ` + randomNumber);
//print the number picked and let the user know their race number
    console.log (`Thank you for completing this form. Just to confirm that your race will start at 9.30am and your race number is ${randomNumber}. Please report to the runners desk for more information.`) 
//final statement
    
} else{
    console.log('Your race time will be 11.00am')
//As they are registered late and are over 18 they will race at the early time
    randomNumber = Math.floor((Math.random() *1000) +1);
    console.log (`Your race number is ` + randomNumber);
    }
}
//print the number picked and let the user know their race number;
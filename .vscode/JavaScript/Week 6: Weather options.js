let sunny;
let cloudy;
let rain;
let snow;
let thunder;
let cold;
let ok;
let warm;
let hot;

function conditions(){
//creating a variable to check conditional statements for the weather conditions.
    let condition = prompt("What are the current weather conditions? sunny, cloudy, raining, snowing or thunder")
  //asking the user for input
    if (condition == "sunny"){
        sunny = condition
        //using the global variable called sunny and assigning condition result value
        console.log(`You have written that it is ${sunny} outside`)
        //printing to the console
        return sunny
        //retain the value of sunny for use later
    }else if (condition == "cloudy"){
        cloudy = condition
        console.log(`You have written that it is ${cloudy} outside`)
        return cloudy
        //Doing the same thing as above but for cloudy
    }else if (condition == "raining"){
        rain = condition
        console.log(`You have written that it is ${rain} outside`)
        return rain
        //Doing the same thing as above but for rain
    }else if (condition == "snowing"){
        snow = condition
        console.log(`You have written that it is ${snow} outside`)
        return snow
        //Doing the same thing as above but for snow
    }else if (condition == "thunder"){
        thunder = condition
        console.log(`You have written that it is ${thunder} outside`)
        return thunder
        //Doing the same thing as above but for thunder
    }else{
        console.log("Please enter a valid weather type")
        //just trying to avoid any bugs if user types something else not listed. 
    }
}


function temperature(){
    var blue = prompt("What is the current weather?")
    var Temp = parseInt(blue); 
    //making the variable blue into an integer rather than a string and assigning it to Temp
    if (Temp < 10){
        //if Temp less than 10
        cold = Temp
        //assigning Temp value to global variable cold
        console.log(`You have written that it is ${cold} degrees`)
        //printing the user input so they can check it is correct
        return cold
        //save the value of cold to use later
    }else if (Temp >= 10 && Temp <20){
        ok = Temp
        console.log(`You have written that it is ${ok} degrees`)
        return ok
        //repeating all of the above for warmer temperature
        }else if (Temp >= 20 && Temp <30){
        warm = Temp
        console.log(`You have written that it is ${warm} degrees`)
        return warm
        //repeating all of the above for warmer temperature
    }else if (Temp >=30){
        hot = Temp
        console.log(`You have written that it is ${hot} degrees`)
        return hot
        //repeating all of the above for hot temperature
    }
}

function weatherCheck() {
    //created a new function to run the weather check programme 
    conditions()
    //run the function conditions
    temperature()
    //run the temperature function
    while (sunny) {
        if (ok || warm) {
            console.log(`Go to work!`)
            break;
            //if the weather is sunny but also ok and warm print this
        }else if (hot){
            console.log(`It's too HAWT!`)
            break;
            //if the weather is sunny but also hot print this instead
        }else if (cold){
            console.log(`BRRRR It's too cold!`)
            break;
            //if the weather is sunny but also cold print this instead
        }else{
            console.log(`try again!`)
            break;
            //if wrong typed input from user type this
        }
    }
    while (cloudy){
        if (ok || warm) {
            console.log(`Go to work!`)
            break;
        }else if (hot){
            console.log(`It's too HAWT!`)
            break;
        }else if (cold){
            console.log(`BRRR It's too cold`)
            break;
        }else{
            console.log(`try again!`)
            break;
            //same as above but with cloudy variable instead
        }
    }
    while (rain){
        if (ok) {
            console.log(`No one likes wet and cold! Don't go to work`)
            break;
        }else if (warm){
            console.log(`Go to work as it's warm but just a bit rainy`)
            break;
        }else if (hot){
            console.log(`It's too HAWT!`)
            break;
        }else if (cold){
            console.log(`BRRR It's too cold`)
            break;
        }else{
            console.log(`try again!`)
            break;
            //same as above but with rain variable instead
        }
    }
    while (snow){
        if (ok) {
            console.log(`Don't go to work!`)
            break;
        }else if (warm || hot){
            console.log(`Don't go to work as the weather is WEIRD!?`)
            break;
        }else if (cold){
            console.log(`BRRR It's too cold`)
            break;
        }else{
            console.log(`try again!`)
            break;
            //same as above but with snow variable instead
        }
    }
    while (thunder){
        if (ok||warm) {
            console.log(`Thunder! Don't go to work as you work with metal!`)
            break;
        }else if (hot){
            console.log(`It's too HAWT!`)
            break;
        }else if (cold){
            console.log(`BRRR It's too cold`)
            break;
        }else{
            console.log(`try again!`)
            break;
            //same as above but with thunder variable instead
        }
    }
}
weatherCheck()
//run the function weatherCheck


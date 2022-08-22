let addition;
let multiply;
let minus;
let divide;
let powerOf;
let sum;

//definint global variables to use later;

function comparators(){
//creating a variable to check which comparator is picked;

    let comparator = prompt('Please choose a comparator for your sum (a,b,c etc): a. addition,b. multiply,c.minus,d.divide,e.power of');
    //asking the user for input;

    if (comparator == "a"){
        addition = comparator;
        //using the global variable called addition to assign the user input to;
        return addition;

        //retain the assignment of addition for use later;

    }else if (comparator == "b"){
        multiply = comparator;
        return multiply;

        //Doing the same thing as above but for multiply;

    }else if (comparator == "c"){
        minus = comparator;
        return minus;

        //Doing the same thing as above but for minus;

    }else if (comparator == "d"){
        divide = comparator;
        return divide;

        //Doing the same thing as above but for divide;
        
    }else if (comparator == "e"){
        powerOf = comparator;
        return powerOf;

        //Doing the same thing as above but for powerOf;

    }else{
        console.log("Please enter a valid comparator");
        sums()

        //bug fix if user puts wrong input;
    }
}

function sums(){
//function to do the sums
    
    console.log("Welcome to Katherine's marvellous calculator!");   //welcome message
    let firstValue = parseFloat(prompt('Enter the first number '),10);  //making sure the input accepts decimal numbers

    let secondValue = parseFloat(prompt('Enter the second number '),10);   //bug fix answers only allow for numbers so if user puts in string they get a answer = NaN response

    switch (comparators()){  //switch statement to list different sum methods

        case (addition):
            sum = firstValue+=secondValue;
            return(sum);   //sum for variable addition;

        case (multiply):
            sum = firstValue*secondValue;
            return(sum);   //sum for variable multiply;

        case (minus):
            sum = firstValue-secondValue;
            return(sum);    //sum for variable minus;

        case (divide):
            sum = firstValue/secondValue;
            return(sum);   //sum for variable divide;

        case (powerOf):
            sum = (Math.pow(firstValue, secondValue));;
            return(sum);   //sum for variable power of multiplication;

        default: 
            console.log('Please enter valid numbers');
        }
    }

sums();   //run the sum function

console.log(`Your answer is = ${sum}`);   //print the answer of the sum function

roundAgain();  //run the roundagain function

//Offers the chance to calculate again
function roundAgain(){

    question2 = prompt(`would you like to do another calculation today?`);

    //while loop which will run continuously until the user types no to the question above
    while (question2) {

        switch (question2){  //switch statement to handle the different outcomes of the question

            case 'yes':   //if user wants to do another calculation
                sums();    //run the sum function again
                console.log(`Your answer is = ${sum}`);    //answer includes the sum variable
                roundAgain();    //ask the user if they want to try with other numbers 

            case 'no':    //if user does not want to do another calculation
                break;    //stop the programme

            default:
                console.log(`User typo try again`);  //bug fixing for wrong input
                sums();
                console.log(`Your answer is = ${sum}`);  
                roundAgain();

            break;  //stop the programme
        }
    }
}
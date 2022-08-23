var Fruits = ["Apple","Orange","Banana","Pear","Peach","Strawberry","Cherry","Acai"]; //array list

const lowerCased = Fruits.map(fruit => fruit.toLowerCase());//changing the array to lower case

var Fruitfinal = lowerCased; //putting the new array in a new variable

var vowel = 0; //setting vowel count to 0

var consonant = 0; //setting consonant count to 0

const vowelCount = str => { //arrow function to check the vowels
    var vowels = 'aeiou'; //list of characters to check
    
    for(var i = 0; i < str.length ; i++) { //for loop to iterate over the array  using i
        if (vowels.indexOf(str[i]) !== -1){ //if character checked against vowel list is not equal to false then add 1 to the vowel count
            vowel += 1; //add to vowel count
        }else{
            consonant +=1; //add to consonant count
        }
    }
    return vowel; //return the vowel count
    return consonant;  //return the consonant count
}

function eachString(){   //function to see which string from the array the user would like to check
    console.log(Fruitfinal);  //printing the array list
    
    whatString = prompt("What fruit would you like to use to calculate vowels and consonants?");   //prompt to ask the user
    
    if (whatString == "apple"){  
        vowelCount(Fruitfinal[0]);
        console.log(`An ${Fruits[0]} has ${vowel} vowels and ${consonant} consonants`);

        //if prompt return "apple" run the vowelcount function and return the answer printed as shown.

    }else if (whatString == "orange"){
        vowelCount(Fruitfinal[1]);
        console.log(`An ${Fruits[1]} has ${vowel} vowels and ${consonant} consonants`);

        //if prompt return "orange" run the vowelcount function and return the answer printed as shown.

    }else if (whatString == "banana"){
        vowelCount(Fruitfinal[2]);
        console.log(`An ${Fruits[2]} has ${vowel} vowels and ${consonant} consonants`);

        //if prompt return "banana" run the vowelcount function and return the answer printed as shown.

    }else if (whatString == "pear"){
        vowelCount(Fruitfinal[3]);
        console.log(`An ${Fruits[3]} has ${vowel} vowels and ${consonant} consonants`);
        
        //if prompt return "apple" run the vowelcount function and return the answer printed as shown.

    }else if (whatString == "peach"){
        vowelCount(Fruitfinal[4]);
        console.log(`An ${Fruits[4]} has ${vowel} vowels and ${consonant} consonants`);

        //if prompt return "apple" run the vowelcount function and return the answer printed as shown.

    }else if (whatString == "strawberry"){
        vowelCount(Fruitfinal[5]);
        console.log(`An ${Fruits[5]} has ${vowel} vowels and ${consonant} consonants`);

        //if prompt return "apple" run the vowelcount function and return the answer printed as shown.

    }else if (whatString == "cherry"){
        vowelCount(Fruitfinal[6]);
        console.log(`An ${Fruits[6]} has ${vowel} vowel and ${consonant} consonants`);

        //if prompt return "apple" run the vowelcount function and return the answer printed as shown.

    }else if (whatString == "acai"){
        vowelCount(Fruitfinal[6]);
        console.log(`An ${Fruits[6]} has ${vowel} vowels and ${consonant} consonant`);

        //if prompt return "apple" run the vowelcount function and return the answer printed as shown.

    }else{  //bug fix in case user has typed something wrong
        console.log('Please use lowercase or check the fruit is in the list above');  
    }
}

eachString();  //run the function

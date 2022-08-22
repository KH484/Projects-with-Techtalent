var Fruits = ["Apple","Orange","Banana","Pear","Peach","Strawberry","Cherry","Acai"]; //array list

const lowerCased = Fruits.map(fruit => fruit.toLowerCase());//changing the array to lower case

var Fruitfinal = lowerCased; //putting the new array in a new variable

let FruitToString = Fruitfinal.toString(); //Getting each word to be an indiivdual string

const Fruity = Fruitfinal.join('');
//need to remove the comma!

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
    return vowel;

    return consonant;
};

vowelCount(Fruity);  //calling the function

console.log(`There are ${vowel} vowels in this array`);  //print the result of vowels

console.log(`There are ${consonant} consonant in this array`);  //print the result of consonants


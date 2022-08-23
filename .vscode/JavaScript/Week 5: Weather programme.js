const kelvin = 293;
//created a constant variable called kelvin and we have assigned the number 293
let celsius = kelvin - 273;
//The answer of the calculation of kelvin (293) - 273 is stored in a variable called celsius
let farenheit = celsius * (9/5) + 32;
//New changeable variable called farenheit made from the calculation above
farenheit = Math.floor(farenheit);
//If necessary, farenheit value will change to a whole number
console.log(`The temperature is ${celsius} degrees celsius and ${farenheit} degrees farenheit`);
//The final results put together


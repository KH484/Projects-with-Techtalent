//open the side nav 

function openNav() {
    document.getElementById("mySidenav").style.width = "100%";
    document.body.style.backgroundColor = "white";
}

//close / hide the side nav

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.body.style.backgroundColor = "white";
}

//function to validate the form 

function validateForm() {

    var title1 =document.forms["myForm"]["title"].value;
    if (title1 ==""){
        alert("Title must be filled out");
        return false 
}

    var author1 =document.forms["myForm"]["author"].value;
    if (author1 =="") {
        alert("Author name must be filled out");
        return false;
    
}

    var blog1 =document.forms["myForm"]["text"].value;
    if (blog1 =="") {
        alert("Blog text name must be filled out");
        return false;

}

//If the fields are all filled out then run the post blog function

    if (blog1 !==false && author1 !== false && title1 !== false){
        myFunction() 
    }
}

//function to post the text to the blog

function myFunction() {

    //creating variables to use as parameters in the function

    let title = document.getElementById('title').value;
    let author = document.getElementById('author').value;
    let text = document.getElementById('text').value;
    let photo = document.getElementById('photo').value;

    // create a paragraph element

    let heading = document.createElement("h1");
    let heading2 = document.createElement("h3");
    let para = document.createElement("p");
    let para1 = document.createElement("p");

    // adding the text

    heading.appendChild(document.createTextNode(title));
    heading2.appendChild(document.createTextNode(author));
    para.appendChild(document.createTextNode(text));
    para1.appendChild(document.createTextNode(photo));

    //Adding the new data to the specific blog post section of the page

    document.getElementById("blog_post").appendChild(heading);
    document.getElementById("blog_post").appendChild(heading2);
    document.getElementById("blog_post").appendChild(para);
    document.getElementById("blog_post").appendChild(para1);

    // just resets the text area that was originally created

    document.getElementById('title').value = "";
    document.getElementById('author').value = "";
    document.getElementById('text').value = "";
    document.getElementById('photo').value = "";
}

//Function to get the background to change colour on each page

function colourChange() {
    if (document.body.style.background == "white")
    document.body.style.background = "#A2CBC4";
    else {
        document.body.style.background = "white";
    }
}

//Alert button will show when the user subscribes to the website

function subscribe() {
    alert("Thank you for subscribing to our website!")
    document.getElementById('subscribeEmail').value = "";

}


















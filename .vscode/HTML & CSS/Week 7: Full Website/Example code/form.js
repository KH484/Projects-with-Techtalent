function validateForm() {

    var x=document.forms["myForm"]["Title"].value;
    if (x==null || x==""){
        alert("Title must be filled out");
        return false;
}

    var y=document.forms["myForm"]["Author"].value;
    if (y==null || y=="") {
        alert("Author name must be filled out");
        return false;
    }

    var y=document.forms["myForm"]["Text"].value;
    if (y==null || y=="") {
        alert("Blog text name must be filled out");
        return false;
    }
}


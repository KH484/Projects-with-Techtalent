function myFunction(){
    let data = "";  
    let title = document.getElementById("title").value
    let author = document.getElementById("author").value
    let blogContent = document.getElementById("blogContent").value

    data = "title : "+title+"<br/>author: "+author+ "<br/>blogContent : "+blogContent

   document.getElementById("data").innerHTML = data  // display data to paragraph

}

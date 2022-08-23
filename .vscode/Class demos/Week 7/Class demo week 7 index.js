function toggleParaColour() {
  const element = document.getElementById("para1");

  if (element.style.color == "red") {
    element.style.color = "black";
  } else {
    element.style.color = "red";
  }
}

function setGreen() {
  const element = document.getElementById("para1");
  element.style.color = "green";
}

function setRed() {
  const element = document.getElementById("para1");
  element.style.color = "red";
}

function setColor(colour) {
  const element = document.getElementById("para1");
  element.style.color = colour;
}
//document.body.style.backgroundColor = "purple"

function submit_form() {
  const element = document.getElementById("fname");
  if (element.value.length >= 3) {
    alert("hello " + element.value);
  } else {
    alert("Name must be at least 3 characters")
  }

  let options = document.getElementsByName("collection_1");
  for (i = 0; i < options.length; i++) {
    if (options[i].checked) {
      alert("you selected " + options[i].value);
    }
  }
}

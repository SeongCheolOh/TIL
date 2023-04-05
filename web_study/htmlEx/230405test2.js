function result() {
  var num = document.getElementById("num").value;
  if (num === "1") {
    document.getElementById("result").textContent = "Seoul";
  } else if (num === "2") {
    document.getElementById("result").textContent = "Washington";
  } else if (num === "3") {
    document.getElementById("result").textContent = "Tokyo";
  } else if (num === "4") {
    document.getElementById("result").textContent = "Beijing";
  } else {
    document.getElementById("result").textContent = "none";
  }
}

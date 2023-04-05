function login() {
  var id = document.getElementById("id").value;
  var password = document.getElementById("password").value;
  if (id === "ezen" && password === "ezen1234") {
    document.getElementById("loginResult").textContent = "로그인 되었습니다.";
  } else {
    document.getElementById("loginResult").textContent =
      "아이디 또는 비밀번호가 일치하지 않습니다.";
  }
}

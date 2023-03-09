let text = document.getElementById("text");
text.onclick = function () {
  text.style.fontSize = 20;
  text.style.backgroundColor = "yellow";
  text.style.color = "red";
  let number = 100;
  alert(number + " 클릭을 하셨습니다");
  console.log(number + "콘솔창에 출력하기");
}; //확인 버튼밖에 없다

let t1 = document.getElementById("text1");
t1.onclick = function () {
  let name = "홍길동";
  let result = confirm(name + " 자바스크립트를 클릭하셨습니다");
  //alert(result);
  if (result) {
    name = "오성철";
    alert(name);
    for (let i = 1; i <= 10; i++) {
      console.log(name + i);
    }
  } else {
    alert("다른 사람입니다");
  }
}; //확인 or 취소 버튼 >> true or false가 출력

let t2 = document.querySelector("#text2");
t2.onclick = function () {
  let name = prompt("이름을 입력해주세요");
  let korean = parseInt(prompt("국어 점수를 입력하세요"));
  let math = parseInt(prompt("수학 점수를 입력하세요"));
  alert(
    // 입력>>출력까지 가능
    "이름 : " +
      name +
      " / 국어 점수 : " +
      korean +
      " / 수학 점수 : " +
      math +
      " / 합계 : " +
      (korean + math) +
      " / 평균 : " +
      (korean + math) / 2
  ); //국어점수와 수학점수 입력받기
  //이름 : 홍길동 / 국어 : 100 / 수학 : 80 / 합계 : 180 / 평균 : 90

  //결과를 웹브라우저에 출력하기
  document.write(
    "<p> 이름 : " +
      name +
      " / 국어 점수 : " +
      korean +
      " / 수학 점수 : " +
      math +
      " / 합계 : " +
      (korean + math) +
      " / 평균 : " +
      (korean + math) / 2 +
      "</p>"
  );
};
//구구단 연습을 클릭하면
let ggd = document.getElementById("gugudan");
ggd.onclick = function () {
  //알고싶은 구구단은 ? 3 prompt
  let stage = parseInt(prompt("출력 할 단의 수를 입력하세요"));
  //웹화면 3단을 보이기 - for문, document.write()를 이용
  for (let i = 1; i <= 9; i++) {
    document.write(stage + " * " + i + " = " + stage * i + "</br>");
    console.log(stage + " * " + i + " = " + stage * i);
  }
};

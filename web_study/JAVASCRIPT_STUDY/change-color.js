let text = document.getElementById('text');
text.onclick = function () {
  text.style.fontSize = 20;
  text.style.backgroundColor = 'yellow';
  text.style.color = 'red';
  let number = 100;
  alert(number + ' 클릭을 하셨습니다');
  console.log(number + '콘솔창에 출력하기');
}; //확인 버튼밖에 없다

let t1 = document.getElementById('text1');
t1.onclick = function () {
  let name = '홍길동';
  let result = confirm(name + ' 자바스크립트를 클릭하셨습니다');
  //alert(result);
  if (result) {
    name = '오성철';
    alert(name);
    for (let i = 1; i <= 10; i++) {
      console.log(name + i);
    }
  } else {
    alert('다른 사람입니다');
  }
}; //확인 or 취소 버튼 >> true or false가 출력

let t2 = document.querySelector('#text2');
t2.onclick = function () {
  let name = prompt('이름을 입력해주세요');
  let korean = parseInt(prompt('국어 점수를 입력하세요'));
  let math = parseInt(prompt('수학 점수를 입력하세요'));
  alert(
    // 입력>>출력까지 가능
    '이름 : ' +
      name +
      ' / 국어 점수 : ' +
      korean +
      ' / 수학 점수 : ' +
      math +
      ' / 합계 : ' +
      (korean + math) +
      ' / 평균 : ' +
      (korean + math) / 2
  ); //국어점수와 수학점수 입력받기
  //이름 : 홍길동 / 국어 : 100 / 수학 : 80 / 합계 : 180 / 평균 : 90

  //결과를 웹브라우저에 출력하기
  document.write(
    '<p> 이름 : ' +
      name +
      ' / 국어 점수 : ' +
      korean +
      ' / 수학 점수 : ' +
      math +
      ' / 합계 : ' +
      (korean + math) +
      ' / 평균 : ' +
      (korean + math) / 2 +
      '</p>'
  );
};
//구구단 연습을 클릭하면
let ggd = document.getElementById('gugudan');
ggd.onclick = function () {
  //알고싶은 구구단은 ? 3 prompt
  let stage = parseInt(prompt('출력 할 단의 수를 입력하세요'));
  //웹화면 3단을 보이기 - for문, document.write()를 이용
  for (let i = 1; i <= 9; i++) {
    document.write(stage + ' * ' + i + ' = ' + stage * i + '</br>');
    console.log(stage + ' * ' + i + ' = ' + stage * i);
  }
};

let ageCalc = document.getElementById('ageCalc');
ageCalc.onclick = function () {
  //현재 년도를 구하는 함수 찾아서
  let now = new Date();
  let currentYear = now.getFullYear();
  console.log(now + ' ' + currentYear);
  let birthYear = prompt('태어난 년도를 입력하세요');
  let age = 2023 - Number(birthYear) + 1;
  confirm('당신의 나이는 ' + age);
  document.write('당신의 나이는 ' + age + '입니다');
};
//prompt로 입력받고
//가고싶은 부서를 선택하세요
//(1-프론트 개발자 / 2-백엔드 개발자 / 3-풀스택 개발자)
//1>> 305호 가세요 // 2>>307호 가세요 // 3>>309호 가세요
let switchCase = document.getElementById('switchCase');
switchCase.onclick = function () {
  let part = prompt(
    '가고싶은 부서를 선택하세요 \n(1-프론트 개발자 / 2-백엔드 개발자 / 3-풀스택 개발자'
  );
  switch (part) {
    case '1':
      document.write('305호 가세요');
      break;
    case '2':
      document.write('307호 가세요');
      break;
    case '3':
      document.write('309호 가세요');
      break;
    default:
      document.write('잘못 입력하셨습니다');
  }
};

let whileVar = document.getElementById('while');
whileVar.onclick = function () {
  let conOk = true;
  while (conOk) {
    let inPerson = parseInt(prompt('입장객수'));
    let seatC = parseInt(prompt('한줄에 앉을 수 있는 사람 수'));
    let chInPerson = parseInt(prompt('한 줄에 앉을 수 있는 사람 수'));
    let c = inPerson / seatC; //23/5=4.xxx
    let c1 = inPerson % seatC; //23%5= 4...3
    if (c1 > 0) c = c + 1;
    document.write('필요한 자리는 ' + c + '줄 입니다');
    let YorN = prompt('계속 하시겠습니까?');
    if (YorN == 'y') conOk = false;
  }
};

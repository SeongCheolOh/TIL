const name = "누시다";
const age = 24;
const message = "내 이름은 " + name + ", 나이는 " + age + " 입니다";
console.log(message);

const message2 = `내 이름은 ${name}이고, 나이는 ${age} 입니다`;
console.log(message2);

//내 이름은 xxx이고, 생일은 xxxx년 xx월 xx일이야 나이는 xx이야 내년에는 xx살이 돼
const name1 = "오성철";
const birthDay = "1996년 09월 04일";
const age1 = 28;
const calAge = () => {
  return age1 + 1;
};
const message3 = `내 이름은 ${name1}이고, 생일은 ${birthDay}이야 나이는 ${age1}이야 내년에는 ${calAge()}살이 돼`;
console.log(message3);
//함수 정의하는 방법 1
//function 함수명(인수 또는 매개변수){처리할 내용}
function func1(value) {
  return value;
}
console.log(func1("홍길동"));
console.log(func1(100));
console.log(func1("홍길동"), func1(100));
function func2(name, score) {
  return `${name}이고 ${score}점 입니다`;
}
//함수 호출하기
const result = func2("홍길동", 100);
console.log(result);

const aa = func2("이순신", 80);
console.log(aa);

//함수 정의하는 방법 2
//const 변수 = function(인수){처리할 내용}
const func3 = function (name) {
  return name;
};
console.log(func3("홍길동"));

//함수 정의하는 방법 3(function 생략)
//const 변수 = (인수)=>{처리할 내용}
const func4 = (name, age) => {
  return name + "은 " + age + "살 입니다";
};
console.log(func4("오성철", 28));

//인수가 하나일 때는 괄호 생략 가능하다
const func5 = (age) => {
  return age;
};
console.log(func5(35));
//함수 내부에 콘솔을 찍고 바깥에서 값만 주는 방식
const fun6 = (age) => {
  return console.log(age);
};
fun6(48);
//반환할 문장이 1행이면 {},return도 생략 가능
//*주의* {}과 return은 함께 생략한다(한쪽만 사용 불가능)
const func7 = (v1, v2) => v1 + v2;
console.log(func7(3, 5));
//리턴이 여러 행일 경우, 한 행으로 모으려면 {}를 ()로 감싼다
const func8 = (v1, v2, v3) => ({
  name: v1,
  age: v2,
  phone: v3,
});
console.log(func8("A", 6, "010"));
let result2 = func8("홍길동", 25, "010-1");
console.log(result2);
//gender : true, point = 100
const func9 = (a, b) => ({
  gender: a,
  point: b,
});
console.log(func9(true, 100));
let result3 = func9(true, 100);
console.log(`${result3.gender}이고 ${result3.point}이다`);

//객체 분할 대입
const myProfile = {
  //객체
  name3: "김자바",
  age3: 29,
};
//원래같으면
console.log(`${myProfile.name3}${myProfile.age3}`);
//객체분할대입
const { name3, age3 } = myProfile;
console.log(`${name3}${age3}`);
const message4 = `내 이름은 ${name3}입니다. 나이는 ${age3}세 입니다`;
console.log(message4);

//객체
const myProfile2 = {
  name4: "홍길동",
  email4: "AA@naver.com",
  phone4: "010-3433-8465",
};
//이메일 출력
console.log(`${myProfile2.email4}`);
//객체 분할 후 phone, name 출력
const { name4, email4, phone4 } = myProfile2;
console.log(`${name4}${phone4}`);
//name4 >> newName // email4 >> newEmail 별명붙이기
const { name4: newName, email4: newEmail } = myProfile2;
const message5 = `내 이름은 ${newName} 입니다. 이메일은 ${newEmail} 입니다`;
console.log(message5);

//배열
const myProfile3 = ["홍길동", 36, 87];
//배열 분할대입
const [name5, age5, score5] = myProfile3;
//전체 출력
console.log(`${name5}${age5}${score5}`);
//일부 출력
console.log(`${name5}${age5}`);
console.log(`${name5}${score5}`);

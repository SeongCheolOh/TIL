var val1 = "var 변수";
console.log(val1);
val1 = "var 변수 덮어쓰기";
console.log(val1);
var val1 = "다시 선언함"; //이클립스에서는 에러나지만 여기선 가능
console.log(val1);

let val2 = 100;
console.log(val2);
val2 = 300;
console.log(val2);
//let val2 = 600; let에서는 재선언 할 수 없음

const val3 = 2.5;
console.log(val3 + 3.1);
// val3 *= 2.7; const에서는 덮어쓰기 불가능
//const val3 = 10.78; 재선언도 불가능
console.log(val3);

const obj1 = {}; // { }=객체
const arr1 = []; // [ ]=배열
const function1 = () => {}; // 함수

const obj2 = {
  name: "홍길동",
  age: 24,
  fun2: () => {
    console.log(age - 10);
  },
};
console.log(obj2.name, obj2.age);
obj2.fun2;

obj2.name = "이순신";
obj2.age = obj2.age + 5;
console.log(obj2.name, obj2.age);

obj2.address = "경기도 하남시";
console.log(obj2.address);

//객체
let obj3 = {
  phone: "01012341234",
  email: "aa@naver.com",
  pPhone: () => {
    console.log(this.phone);
  },
  mEmail: () => {
    email = "bb@naver.com";
  },
};
//출력
console.log(obj3.phone, obj3.email);
//필드바꾸기
obj3.phone = "010-789-4567";
//함수를 호출
obj3.pPhone();
obj3.mEmail();

const arr2 = ["dog", "cat"];
console.log(arr2);
console.log(arr2.length);
console.log(arr2[0]);
arr2.push(1000); //배열 수정(뒷열에 추가)
console.log(arr2);

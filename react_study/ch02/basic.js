var val1='var 변수';
console.log(val1);

val1 ="var 변수 덮어쓰기";
console.log(val1);

var val1="다시 선언함";
console.log(val1);

let val2=100;
console.log(val2);

val2 += 300;
console.log(val2);

//let val2=600; //재선언 안됨
const val3 = 2.5;
console.log( val3 + 3.1);
// val3 *= 2.7;//덮어쓰기 안됨
//const val3 = 10.78; 재선언 안됨
console.log(val3);

//오브젝트 타입의 종류 및 형식
const obj1 = { }; //객체 { }
const arr1 = [ ] ; //배열
const function1 = () => { } ;//함수 

const obj2 = {
    name: "홍길동",
    age: 24,
    fun2: function(){
        console.log( this.name );
    },
    fun3: ()=>{
         console.log(this.age + 5); 
    } 
}
console.log( obj2.name, obj2.age );
obj2.fun2();
obj2.fun3();
console.log( obj2.name, obj2.age );

obj2.name = "이순신";
obj2.age = obj2.age + 5;
console.log( obj2.name, obj2.age );

obj2.address="경기도 하남시";
console.log( obj2.name, obj2.age, obj2.address );
//객체
let obj3 = {
   phone: "0101231234",
   email: "aa@naver.com",
   pPhone: ()=>{
      console.log(this.phone);
   },
   mEmail: ()=>{
      email = "bb@naver.com";
   }
}
const obj4 = {
    phone2: "aa",
    email2: "cc"
}
const { phone2, email2 } = obj3;
console.log(phone2, email2);
//출력해보고
console.log( obj3.phone, obj3.email );
// 필드 바꿔보고
obj3.phone="010-789-4561";
// 함수를 호출해 보고
obj3.pPhone();
obj3.mEmail();
console.log( obj3.phone, obj3.email );

const arr2 = ["dog", "cat"];
console.log( arr2 );
console.log( arr2.length );
console.log( arr2[1] );
console.log( arr2[2] ); //에러 undefined
arr2.push( 1000 );//배열안에 새로운 값을 넣기
console.log( arr2 );
arr2[1]="pet";//배열안에 값을 변경하기
console.log( arr2 );
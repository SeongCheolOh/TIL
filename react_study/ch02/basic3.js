//기본값에 대하여

//화살표함수
const sayHello =  name => console.log(  name  );
 
sayHello( "홍길동 ");
sayHello(); //undefined로 
sayHello("홍길동", 10);//홍길동만 입력된다
sayHello(10, "홍길동"); // 10만 입력된다.

//화살표 함수에 기본값을 넣기
const sayHello1 = (name="이순신") => console.log(name);
sayHello1( "홍길동 "); //홍길동
sayHello1(); //이순신 
sayHello1("홍길동", 10); //홍길동
sayHello1(10, "홍길동"); //10 

const myProfile1 = {
    age: 24,
   
}

//위의 객체안에 name 필드를 나중에 추가하려면
//방법1) 
myProfile1.name = "최수연";
//방법2) 객체분할 대입을 이용
const { name="최수연", age } = myProfile1;

//객체분할 대입
//const { name, age } = myProfile1;
//console.log( `${name}    ${age}`); // undefined 24

//객체분할 대입
// const { name="홍길동", age } = myProfile1;
// console.log( `${name}    ${age}`); // 홍길동 24

// const { name="이순신", phone="0101231234", age} = myProfile1;
// console.log( `${name} ${phone}  ${age}`);
myProfile1.age = 30;
myProfile1.name = "최수연"; //객체의 필드를 추가하기

console.log( `${myProfile1.name}  ${myProfile1.age}`);

// const { name="이순신", phone="0101231234", age} = myProfile1;
// console.log( `${name} ${phone}  ${age}`);
// 아래 코드는 에러 발생  별칭은 안됨(객체 분할 대입에서 만들어진 필드는 별칭이 안됨)
//const { name="이순신": newName, phone="0101231234": newPhone, age: newAge} = myProfile1; (X)
//console.log( `${name} ${phone}  ${age}`);

//배열 분할 대입을 이용하여서 새로운 요소를 추가할 수 있다.
const arr1 = [ 1,2,3 ];
const [ kor=100, eng, mat, sci=80 ] = arr1;
console.log( kor, eng, mat, sci);//배열 분할 대입에서 추가로 요소를 넣는 것은 됨

//배열안에 요소를 추가하고 싶다
arr1[3] = 4;
console.log( arr1 );


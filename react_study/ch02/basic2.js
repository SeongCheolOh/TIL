const name="누시다";
const age=24;
const message= "내이름은 " + name + " 나이는 " + age + "입니다";
console.log( message );

const message2 = `내이름은  ${name} 이고, 나이는 ${age} 입니다`;
console.log( message2 );

//내 이름은 각자이름이고 생일은 2005년 10월 10일이야 나이는 24이야 내년은 25살이 돼!!
const name1="정현희";
const birth1 = "2005년 10월 10일";
const age1 = 24;
const calAge = ()=>{ return  age1 + 1 };
const message1 = `내이름은 ${name1}이고 생일은 ${birth1}이야 나이는 ${age1} 이야 내년은 ${ calAge() }살이 돼!!`;
console.log(message1);
//함수 만들기 방법1
// function 함수명(  인수 또는 매개변수 ) {  처리할 내용 }
function func1( value ){
    return value;
}

console.log( func1( "홍길동"  ) );
console.log( func1( 100 )  );
// "홍길동", 100 인수 전달하고 싶다
function func2( name, score  ){
    return `${name}이고 ${score}점입니다`;  
}

//함수호출하기
const result = func2( "홍길동", 100 );
console.log( result );

const aa = func2( "이순신", 80 );

//함수정의하는 방법2 - 함수명을 생략함
// const 변수선언 = function ( 인수 ){ 처리할 내용 };
const func3 = function ( name ) {
     return name;
}

func3( "홍길동 ");

//함수 정의하는 방법3 - function을 생략하고 화살표함수 정의
// const 변수선언 = (인수) => {  처리할 내용 }
const func4 = ( name )=> {return name;};
func4("홍길동");
// (인수1)일때 인수 ()생략  
const func5 = age => {return age; };
console.log(  func5( 24 ));

// 반환할 문장이 1행이면 { } return 2개다 같이 생략
const func6 = ( v1, v2) =>  v1+v2 ;
console.log( func6( 100, 200) );

//오류인 경우
const func7 = (v1, v2)=>{ v1 * v2 };
console.log( func7( 10, 20) );

// 중요함 반환값이 여러행일 경우에는 ()로 감싼 뒤 단일행과 같이 모아서 반환한다. 
const func8 = ( v1, v2, v3 ) =>( {
    name: v1,
    age: v2,
    phone: v3
} );

console.log( func8( "홍길동", 24, "0101231234") );
let result8 = func8( "홍길동", 24, "0101231234") ;
console.log( result8.name );

// 인수로 2개를 넣어서 필드에 담고 2개 모두 리턴을 받으세요
// gender: true, point: 100
const func9 = ( v1, v2)=> ({
      gender: v1,
      point: v2,
});
console.log( func9( true, 100 ));
let result9 = func9( true, 100);
console.log(  `${result9.gender} 이고  ${result9.point}`);

//객체
const myProfile = {
   name11: "누시다",
   age11: 24,
};

console.log( `${myProfile.name11}`);
const { name11 } = myProfile; //객체 분할 대입하면 해당 필드와 동일한 이름의 필드 값이 자동으로 바인딩됨
console.log( `${name11} ${myProfile.age11}`); 

//객체
const myProfile2 = {
    name22: "홍길동",
    email22: "aa@naver.com",
    phone22: "0101231234",
}

//email출력해 보세요. 객체명.필드명
console.log( `${myProfile2.email22}` );

// 별명을 붙여서 name22->newName email22-> newEmail 객체분할 대입하시고 출력하기 
// 별명을 붙이면 name22는 사용할 수 없고 별명 사용하여 합니다
const { name22: newName, email22: newEmail } = myProfile2;
console.log(  newName );


//배열
const myProfile3 = ["홍길동", 24, 100];
//배열 분할 대입
const [ name33, age33, score33 ] = myProfile3;
//출력해보기
console.log( `이름은 ${name33}이고 나이는 ${age33}이고 점수는 ${score33}입니다 `);
//배열 분할 대입 - 일부분만 추출
const [ name44, age44  ] = myProfile3;
console.log( `이름은 ${name44}이고 나이는 ${age44}입니다 `);
//배열 분할 대입 - 일부분만 추출
const [ name55, ,score55  ] = myProfile3;
console.log( `이름은 ${name44}이고 점수는 ${score55}입니다 `);
// 배열 분할 대입 - 별명 붙여서 안됨
// const [ name66: newName33, age66: newAge33, score66: newScore33 ] = myProfile3;
//출력해보기
console.log( `이름은 ${name33}이고 나이는 ${age33}이고 점수는 ${score33}입니다 `);

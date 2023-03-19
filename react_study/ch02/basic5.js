//58page 
//객체 생략 표기법
const name="홍길동";
const age=24;

/*
const 객체명 = { 
    속성명(또는 필드명): 값

}*/
// const user={
//     name: name,
//     age: age,
// }
//console.log( user.name, user.age ); //객체명.필드명(속성명)
const user={
    name, // name:name; 인데 name: 를 생략한 것임
    age,
}
console.log( name, age ); //객체명.필드명(속성명)

//2. map() - 자바식 forEach() - 스트림 방식
// const 새로운배열명 = 배열명.map()
const nameArr1 = ["홍길동", "이순신", "최민수"];
const nameArr2 = nameArr1.map(  (name)=> { return name + "님" } );
const nameArr3 = nameArr1.map( name => `${name} 귀하`  ); 
console.log(nameArr1);
console.log(nameArr2);
console.log(nameArr3); //홍길동 귀하 

const ageArr1 = [10,20,30,40];
//나이가 20살 미만은 미성년이라고 출력, 20살 성년이라고 출력하기
//출력결과는 미성년, 성년, 성년, 성년
const ageArr2 = ageArr1.map( age =>  (age<20)  ? "미성년":"성년" );
console.log( ageArr1 );
console.log( ageArr2 );

//출력결과는 1번째는 미성년, 2번째는 성년, 3번째는 성년, 4번째는 성년
const ageArr3 = ageArr1.map(  ( age, index )=>
                      (index + 1) + "번째 " +  (  (age < 20 )   ? "미성년" : "성년"  )   );
console.log( ageArr3 );

const nameArr4 = ["홍길동", "이순신", "최수연"];
const ageArr4 = [ 24, 14, 15 ];

//출력 내용은 홍길동은 24살 성년입니다, 이순신은 14살 미성년입니다. 최수연은 15살 미성년입니다.
ageArr4.map( (age, index ) => {
         const majorityOK = ( age  ) => ( age < 20 ) ? "미성년" : "성년";
         console.log(  `${nameArr4[index]}은 ${age}살 ${ majorityOK( age  ) }입니다.` );
});

//3. filter() 함수 조건이 참이면 새로운 배열이 만들어 지는 것

const intArr1 = [1,2,3,4,5,6,7,8,9,10];
//짝수만 evenArr1로 만들고 싶다
 const evenArr1 = intArr1.filter( (n) => { return n%2 ===  0}  ); // 0 == "0" true  0 === "0" false 0 === 0 true
// == 값만 같으면 같은 것 === 값과 자료형이 같으면 같은 것

console.log( evenArr1 );

const evenArr2 = intArr1.filter( n =>  n%2 === 0     );
console.log( evenArr2 );

//홀수만 oddArr2에 담고 싶다 같지 않다 !==
const oddArr2  = intArr1.filter( n=> n%2 !== 0);
console.log( oddArr2 );

const personName = ["홍길동", "이순신", "최수연"];
const gender = [ true, true, false];
const age8 = [10, 24, 23];

//조건 남자이고 나이가 20살 이상인 사람만 신검 대상이라고 출력하세요
// 출력 내용 이순신은 신검대상자입니다. 병무청으로 오세요~~
//최종적으로 배열 담기는 내용은 이름 이순신
const ok = age8.filter( (age, index) =>  gender[index] && age >= 20  );
 console.log( ok );// 24

//원하는 것은 군대 대상자의 이름을  배열로 만들기
// 형식 const 군입대상 = personName.filter( 남자인 것만 통과 ).filter( 나이가 20살 이상인 것만 통과);
const 군입대상 = personName.filter( (name, index)  =>  gender[index]  )
                          .filter( (name, index) => age8[index]>=20 );
console.log(군입대상);
console.log( ...군입대상 + "은 신검대상자입니다. 병무청으로 오세요~~"  );


const schoolName = ["서울대", "연세대", "고려대"];
const level = [1,2,2];

//이순신이 2등급 졸업했다. 출력결과 "이순신씨가 갈수 있는 대학은? 연세대 고려대 지원할 수 있다." 
//조건은 등급이 맞아야 되고 졸업을 해야 되고
const student = {
    name: "이순신", 
    grade: 2,
    graduate: true //졸업여부 
}
const obSchool   = schoolName
                   .filter( (schoolName, index) =>  student.graduate && level[index] === student.grade );
console.log(obSchool);  
console.log( student.name + "씨가 갈 수 있는 대학은 " + obSchool + " 지원할 수 있다.");









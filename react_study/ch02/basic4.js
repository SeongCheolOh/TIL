//2.6 스프레드 구문 ...

//1.요소전개

const arr1 = [1,2];
console.log( arr1 );
console.log( ...arr1 ); //내부요소를 순차적으로 전개할 수 있다. 

const obj1 = {
    name: "홍길동",
    age: 24
 };
 console.log( obj1.name, obj1.age) ;
 //console.log( ...obj1); (X)

const summaryFunc = ( num1, num2 ) => console.log( num1 + num2 );//화살표함수 정의

summaryFunc( arr1[0], arr1[1] );//함수호출

summaryFunc( ...arr1 ); //1 2  요소의 갯수와 상관없이 모든 요소를 전달할 수 있다.

const arr2 = ["홍길동", 24, 100];
//함수를 만드시고
//함수호출해서 출력 홍길동은 24살 국어점수는 100점입니다
//스프레드구문으로 함수호출해서 출력하세요
const printFunc = ( name, age, score) =>
           console.log( `${name}은 ${age}살이고 국어점수는 ${score}점입니다`);
printFunc( arr2[0], arr2[1], arr2[2]);
printFunc( ...arr2 );

//2. 요소모으기 
const arr3 = [ 1,2,3,4,5];
//배열 분할 대입
const [num1, num2, ...arr4 ] = arr3;
console.log( num1, num2, arr4);//1 2 [3,4,5]

const arr5 = ["홍길동", 24, 100,80,90,65];
//점수를 jumsu배열에 만들어 두고 합계(함수호출해서 계산)를 구하기
//출력은 함수만들어서 출력 홍길동은 24살이고 합계는 335입니다.
const [ name5, age5, ...jumsu ] = arr5;

const jumsuSum = ( v1, v2, v3, v4 )=> {
      return v1 + v2 + v3 + v4;
} ;
//함수 정의
const printFunc5 = ( name5, age5, jumsu )=>               
console.log( ` ${name5}은 ${age5} 이고 합계는 ${ jumsuSum( ...jumsu ) }입니다.`   );

//함수 호출
printFunc5( name5, age5, jumsu );


/* 방법1
const jumsuSum = ( arr )=> {
                                let sum = 0;
                                for( let i=0; i< arr.length; i++) {
                                    sum += arr[i];
                                }
                                return sum;
                            } ;
//함수 정의
const printFunc5 = ( name5, age5, jumsu )=>               
       console.log( ` ${name5}은 ${age5} 이고 합계는 ${ jumsuSum( jumsu ) }입니다.`   );

//함수 호출
printFunc5( name5, age5, jumsu ); */

//3. 요소 복사와 결합

const arr6 = [ 10, 20 ];
const arr7 = [ 30, 40 ];
const arr8 = [...arr6 ];
console.log( arr8 );

const arr9 = [ ...arr6, ...arr7 ]; // [ 10,20, 30, 40]
console.log( arr9 );

const obj6 = {val1: 10, val2: 20 };
const obj7 = {val3: 30, val4: 40 };
const obj9 = {...obj6};// obj6을 풀어서 { }안에 감쌌다
console.log( obj9 ); //
const obj10 = { ...obj6, ...obj7 };// obj6과 obj7을 풀어서 { }안에 감쌌다
console.log( obj10 );



//4. =을 써서 복사하지 않는 이유는 주소가 복사가 되기 때문에 중간에 바꾸면 연결되어서 같이 값이 바뀐다.
const arr11 = [10,20];
const arr12 = arr11;//얕은 복사 - 주소만 복사가 된다.
console.log( arr12 );
console.log( arr11 );

arr11[0] = 100;
console.log( arr12 ); //[100,20]
console.log( arr11 ); //[100,20] 

//깊은 복사 : 새로운 배열이 만들어져서 값이 복사된다. 
const arr13 = [90,100];
const arr14 = [ ...arr13 ];
arr13[0] = 500;
console.log( arr13 );//500, 100
console.log( arr14 );//90, 100 










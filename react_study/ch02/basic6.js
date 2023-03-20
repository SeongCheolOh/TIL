// 삼항연산자
const val1 = (1 > 0) ? "참":"거짓";
console.log(val1);

//화살표함수 선언(정의, 만들기)
const printFormattedNum = (num)=>{
    const formattedNum = (typeof num === "number") ? num.toLocaleString(): "숫자를 입력하십시오";
    console.log(formattedNum);
};

//함수 호출
printFormattedNum( 123467000 );
printFormattedNum( "홍길동" );

const checkSumOver100 = (num1, num2)=> {
    return (num1 + num2 > 100) ? "100을 넘었습니다" : "허용 범위입니다";
}
console.log( checkSumOver100(50, 40) );
console.log( checkSumOver100(50, 70) );

// 15, 5, 20 입력을 하면 중간값을 출력하기 답은 15


//2. && ||의미
const num = null; //null, undefined false
const fee = num || "금액을 설정하지 않았습니다";// false || " asda"
console.log(fee);

const num1 = 100; //true
const fee1 = num1 || "금액을 설정하지 않았습니다";// false || " asda"
console.log(fee1); //100

// ||연산은 처음에 조건인 true이면 그것을 반환, 만약 거짓이면 계속 뒤로가면서 true 찾기 
// &&연산은 처음부터 마지막까지 조건이 모두 true이면 마지막 것을 반환합니다. 
const num2 = 100;
const fee2 = num2 && 200 && "무엇가가 설정되었음" && null;
console.log(fee2);

const fee3 = null || undefined || 100;
console.log( fee3 ); //출력은? 100 

const fee4 = null && undefined && 100;
console.log( fee4 ); //출력은? null


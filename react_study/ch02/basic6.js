//삼항연산자
const val1 = 1 > 0 ? "true" : "false";
console.log(val1);
const printFormatNum = (num) => {
  const formatNum =
    typeof num === "number" ? num.toLocaleString() : "숫자가 아님";
  // console.log(formatNum);
};
//함수호출
console.log(printFormatNum(1300));
console.log(printFormatNum("abcdefg"));

const checkSumOver100 = (n1, n2) => {
  return n1 + n2 > 100 ? "100초과" : "100이하";
};
console.log(checkSumOver100(50, 40));
console.log(checkSumOver100(80, 25));

//14, 25, 20을 입력하면 중간값을 출력
const midNum = (n1, n2, n3) => {
  if (n1 > n2 && n1 > n3) {
    return n2 > n3 ? n2 : n3;
  } else if (n2 > n1 && n2 > n3) {
    return n1 > n3 ? n1 : n3;
  } else {
    return n1 > n2 ? n1 : n2;
  }
};
console.log(midNum(14, 17, 20));

//&& || 의미
const num = null; //null, undefined false
const fee = num || "금액을 설정하지 않았습니다";
console.log(fee);
const num1 = 100;
const fee1 = num1 || "금액을 설정하지 않았습니다";
console.log(fee1);
// ||연산은 true면 값을 리턴, false면 계속 연산하며 true 찾기

const fee2 = num1 && "30" && num && "무언가가 설정되었음";
console.log(fee2);
// && 연산은 처음부터 마지막까지 true여야 마지막것을 반환
// 중간에 null값이 있으면 null을 반환
const fee3 = null || undefined || 100 || "umm";
console.log(fee3);
const fee4 = null && undefined && 100;
console.log(fee4);

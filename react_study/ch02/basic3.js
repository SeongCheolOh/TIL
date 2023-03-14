//화살표 함수
const sayHi = (name) => `${name}님 안녕하세요!`;
//입력값이 없으면 undifined로 나온다
console.log(sayHi());
//입력값 대입
console.log(sayHi("오성철"));
//name에 디폴트값을 설정
const sayhello = (name = "[guest]") => `${name}님 안녕하세요!`;
console.log(sayhello());

const title1 = document.getElementById("title");
console.log(title1);

const container1 = document.getElementsByClassName("container");
console.log(container1);

const title2 = document.querySelector("#title");
console.log(title2);
//가장 첫 번째 클래스 container만 선택된다.
const container2 = document.querySelector(".container");
console.log(container2);
//h1태그 선택
const h1Qs = document.querySelector("h1");
console.log(h1Qs);
//p태그 전체 선택
const pTag = document.querySelectorAll("p");
console.log(pTag);
//.container 전체 선택 >> 배열로 저장이 된다
const container3 = document.querySelectorAll(".container");
//.container 중 1번째 인덱스 출력
console.log(container3[1]);
//내용물 출력
console.log(container3[1].innerHTML);
//내용물 수정
container3[1].innerHTML = "<h3>수정 할 내용</h3>";
console.log(container3[1].innerHTML);

//DOM 작성
//태그 만들기 1) 태그명 있는 것 만들기 ex)<h1> / <p>
//              2) 태그명 없는 것 만들기 ex) <abc></abc> / <name></name>
const div1 = document.createElement("div");
console.log(div1);
const img1 = document.createElement("img");
console.log(img1);
const abceEl = document.createElement("abc");
console.log(abceEl);
const nameEl = document.createElement("name");
console.log(nameEl);
const irumEl = document.createElement("name");
console.log(irumEl); //같은 이름, 변수명 달라도 생성 가능

//태그 추가
const divEl3 = document.createElement("div");
const pEl3 = document.createElement("p");
const h3El3 = document.createElement("h3");
divEl3.appendChild(pEl3);
divEl3.appendChild(h3El3);
console.log(divEl3);

//divEl3을 삭제하기
//부모객체.removeChild(자신)
//자식객체가 있으면 에러 발생
//1. body 선택
const bodyEl = document.querySelector("body");
console.log(bodyEl);
bodyEl.appendChild(divEl3);
//2. 자식 삭제
divEl3.removeChild(pEl3);
divEl3.removeChild(h3El3);
//3. 자신 삭제
bodyEl.removeChild(divEl3);

const div2 = document.createElement("div");
const table2 = document.createElement("table");
const tr2 = document.createElement("tr");
const td2 = document.createElement("td");
div2.appendChild(table2);
table2.appendChild(tr2);
tr2.appendChild(td2);
tr2.appendChild(td2);

const title1 = document.getElementById("title");
console.log(title1);

const container1= document.getElementsByClassName( "container");
console.log(container1);

const title2 = document.querySelector("#title");
console.log(title2);
//제일 처음 클래스 container만 선택해준다. 
const container2 = document.querySelector(".container");
console.log(container2);
//<h1>태그를 선택해 준다.
const h1Qs = document.querySelector("h1");
console.log(h1Qs);

//<p> 태그를 선택해 준다. 
const pQs = document.querySelector("p");
console.log(pQs);

// .container 모두를 선택하시오 배열결과를 리턴
const container3 = document.querySelectorAll(".container");
console.log(container3);
console.log(container3[2].innerHTML);
container3[2].innerHTML = "<h3> 이걸로 수정해줘 </h3>";
console.log(container3[2].innerHTML);

//2. 태그를 만들기
// 1) 태그명이 있는 것 만든다 <h1> <p>
// 2) 태그명 없는 것 만들기 <abc> </abc> <name></name>

const divEl = document.createElement("div");
console.log(divEl);

const imgEl = document.createElement("img");
console.log(imgEl);

const abcEl = document.createElement("abc");
console.log(abcEl);

const irumEl = document.createElement("name");
console.log(irumEl); //<name> </name>

//3. 태그를 추가하기
const divEl3 = document.createElement("div");
const pEl3 = document.createElement("p");
const h3El3 = document.createElement("h3");

divEl3.appendChild( pEl3 );
divEl3.appendChild( h3El3 );
console.log( divEl3 );


// divEl3을 삭제하기 부모객체.removeChild(자신것)
// 1. body를 선택한다. 
const bodyEl = document.querySelector("body");
console.log( bodyEl );

bodyEl.appendChild(divEl3);

//2. 삭제한다
// bodyEl.removeChild(divEl3); //에러 발생 왜? 자식 요소가 있기때문

//3. 자식 삭제한다
divEl3.removeChild(h3El3);
divEl3.removeChild(pEl3);
//4. 자신을 삭제한다.
bodyEl.removeChild(divEl3);

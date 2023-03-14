let text = document.getElementById("text");
text.onclick = function(){
    text.style.fontSize = 20;
    text.style.backgroundColor = 'yellow';
    text.style.color="red";
    let number=100;
    alert(  number +" 클릭을 하셨습니다~~"); 
    console.log( number + " 콘솔창에 출력하기 ");
}

let t1 = document.getElementById("text1");
t1.onclick = function(){
    let name="홍길동";
    let result = confirm( name + " 자바스크립트를 클릭하셨습니다!! ");
    //확인 - true, 취소 - false
    if( result ) {
        name = "정현희";
        alert( name );

        for( let i=0; i<10; i++) {
            console.log( name + i );
        }
        
    }else {
        alert( name );
    }
}

let t2 = document.querySelector("#text2");
t2.onclick = function(){
    let name = prompt("이름을 입력해 주세요");
    let kor = prompt("국어점수을 입력해 주세요",100);
    let mat = prompt("수학점수을 입력해 주세요", 100);
    let total = Number(kor) + Number(mat); //"100" --> 100 "80"--> 80
    let avg = total/2;
    // 출력하기 이름 : 홍길동  국어 :  100 수학 : 80 합계 180 평균 : 90
    alert("이름 : " + name + "국어 " + kor + "수학" + mat  + "총합" + total + "평균 " + avg);
    //결과를 웹브라우저에 출력하기  document.write("<p> 내용 </p> " )
    document.write("<p> 이름 : " + name + "국어 " + kor + "수학" + mat  + "총합" + total + "평균 " + avg +"</p>");
    
}

let gugudan=document.getElementById("gugudan");
gugudan.onclick = function(){
    // 3단 ~ 8단까지 출력하기  
    let n1= prompt("알고 싶은 구구단 시작은?");
    let n2 = prompt("알고 싶은 구구단 끝은?");
    for( let k=n1; k<=n2; k++) {
        document.write( k + " 단 "+ "<br><br>");
      for( let i=1; i<=9; i++){
        document.write(  k + " X " + i + " = " + Number(k) * i +"<br>");
        console.log(  k + " X " + i + " = " + Number(k) * i );
      }
    } 
}

let ageCalc = document.getElementById("ageCalc");
ageCalc.onclick = function(){
    // 현재 년도를 구하는 함수 찾아서
    let now = new Date();
    let  currentYear = now.getFullYear();
    console.log( now + "  " + currentYear );
    let birthYear=prompt("태어난 연도를 입력하세요");
    let age = currentYear - Number(birthYear) + 1;
    confirm("당신의 나이는 " + age);
    document.write("당신의 나이는 " + age + "입니다");
}

var  sw = document.getElementById("switchcase");
sw.onclick=function(){
    let input=prompt("가고싶은 부서를 선택하세요(1-프론트개발자 2-백앤드개발자 3-풀스택개발자)");
    
    switch( input ) {
        case "1" : document.write("305호 가세요"); break;
        case "2" : document.write("307호 가세요"); break;
        case "3" : document.write("309호 가세요"); break;
        default : document.write("잘못입력하셨습니다");
    }
    
}

let whileVar = document.getElementById("while");
whileVar.onclick=function(){
    let conOk=true;
     while(  conOk ){
        let inPerson = Number(prompt("입장객수"));
        let seatC = Number( prompt("한줄에 앉을 수 있는 사람수") );
        let c = parserInt(inPerson / seatC); // 23 / 5 = 4
        let c1 = inPerson % seatC; // 23 % 5 = 3
        if( c1 > 0) c = c + 1;
        confirm("필요한 자리는 " + c + "줄입니다. 계속하시려면 확인, 아니면 취소");


     }
}

let hoisting=document.getElementById("hoisting");
hoisting.onclick=function(){
     
    console.log(a);
}
let a=100; 

import ReactDOM from "react-dom";
// import  {App}  from "./App"; // import { } from "패키지명/파일명" { } : 보낸는 파일에서 export 
import  App  from "./App"; // App.js(보내는쪽)이 export default App; 
//default는 1개만 가능하니깐 
// 여러개를 보내려면 import { react, useState } from "react"; 이렇게 받아야 한다
const App1 = ()=>{
    const name="홍길동";
    const age=24;
    return(
        <>
           <h3> { name }</h3>
           <p> { age } </p>
        </>
    );
}
//                <App/> 컴포넌트를, "root"에 적용하세요
ReactDOM.render( <App/>, document.getElementById("root"));
// <App1/>컴포넌트를 "root1"에 적용하세요.
ReactDOM.render( <App1 />  ,  document.getElementById("root1"));




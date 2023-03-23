//   const[변수명, 변수를 바꿀 함수명] = useState(초기값);//배열분할대입
import { useState } from "react";

export const UseStateEx01 = () => {
  const [num, setNum] = useState(0);
  const [name, setName] = useState("");
  const onClickButton1 = () => {
    console.log("재렌더링 합니다");
    setNum(setNum + 1);
  };
  const onClickButton2 = () => {
    setNum(setNum - 1);
  };
  const onChangeName = (event) => {
    console.log("렌더링 합니다");
    setName(event.target.value);
  };
  const [age, setAge] = useState(20);
  const onChangeAge = (event) => {
    setAge(event.target.value);
  };
  const [score, setScore] = useState(60);
  const onChangeScore = (event) => {
    setScore(event.target.value);
  };
  return (
    <>
      <p>{num}</p>
      <button onClick={onClickButton1}>useState연습버튼+1</button>
      <p></p>
      <button onClick={onClickButton2}>useState연습버튼-1</button>
      <p></p>
      <input value={name} onChange={onChangeName}></input>
      <p>{name}</p>
      <input value={age} onChange={onChangeAge}></input>
      <p>{age}</p>
      <input value={score} onChange={onChangeScore}></input>
      <p>{score}</p>
    </>
  );
};

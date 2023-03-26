import { ChangeEvent, useState, FC } from "react";
import styled from "styled-components";

export const App1Basic: FC = () => {
  //텍스트 박스 state
  const [ text, setText ] = useState<string>("");
  //메모 목록 state 
  const [ memos, setMemos ] = useState<string[]>([]);

  //텍스트 박스 입력시 입력 내용을 State에 설정
  const onChangeText = ( e: ChangeEvent<HTMLInputElement>) => setText(e.target.value);
  //추가 버튼 클릭시
  const onClickAdd = ()=>{
    const newMemos = [...memos];
    newMemos.push(text);
    setMemos(newMemos);
    setText("");
  };
  //삭제 버튼 클릭시
  const onClickDelete = ( index: number) => {
    const newMemos = [...memos];
    newMemos.splice(index, 1);
    setMemos(newMemos);
  };

  return(
    <div>
       <h1> 간단 메모 애플리케이션</h1>
       <input type="text" value={text} onChange={onChangeText}/>
       <SButton onClick={onClickAdd}>추가</SButton>
       <SContainer>
        <p>메모목록</p>
        <ul>
          {memos.map((memo, index)=> (
            <li key={memo}>
              <SMemoWrapper>
                <p>{memo}</p>
                <SButton onClick={ ()=> onClickDelete(index)}>삭제</SButton>
              </SMemoWrapper>
            </li>
          ))}
        </ul>
       </SContainer>
    </div>
  );

};

const SButton = styled.button`
        margin-left: 16px;`;
const SContainer = styled.div`
       border: solid 1px #ccc;
       padding: 16px;
       margin: 8px;
       `;
const SMemoWrapper = styled.div`
      display: flex;
      align-items: center;
     `; 

export default App1Basic;
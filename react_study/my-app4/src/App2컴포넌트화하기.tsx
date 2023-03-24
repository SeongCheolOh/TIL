import { ChangeEvent, useState, FC, useCallback} from "react";
import styled from "styled-components";
import { MemoList } from "./components/MemoList";
export const App2컴포넌트화하기: FC = () => {
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
  const onClickDelete = useCallback( ( index: number) => {
    const newMemos = [...memos];
    newMemos.splice(index, 1);
    setMemos(newMemos);
  }, [memos] );

  return(
    <div>
       <h1> 간단 메모 애플리케이션</h1>
       <input type="text" value={text} onChange={onChangeText}/>
       <SButton onClick={onClickAdd}>추가</SButton>
       <MemoList memos={memos} onClickDelete = {onClickDelete}/>
     </div>
  );

};

const SButton = styled.button`
        margin-left: 16px;`;


export default App2컴포넌트화하기;
import { ChangeEvent, useState, FC, useCallback} from "react";
import styled from "styled-components";
import { MemoList } from "./components/MemoList";
import { useMemoList } from "./hooks/useMemoList";

export const App: FC = () => {
  //사용자 정의 훅으로 각각 얻기 - 추가
  const { memos, addTodo, deleteTodo } = useMemoList();

  //텍스트 박스 state
  const [ text, setText ] = useState<string>("");
  //메모 목록 state 
  // const [ memos, setMemos ] = useState<string[]>([]); 삭제

  //텍스트 박스 입력시 입력 내용을 State에 설정
  const onChangeText = ( e: ChangeEvent<HTMLInputElement>) => setText(e.target.value);
  //추가 버튼 클릭시
  const onClickAdd = ()=>{
    // const newMemos = [...memos];
    // newMemos.push(text);
    // setMemos(newMemos); -- 삭제
    addTodo(text);//추가
    setText("");
  };
  //삭제 버튼 클릭시
  const onClickDelete = useCallback( ( index: number) => {
  //   const newMemos = [...memos];
  //   newMemos.splice(index, 1);
  //   setMemos(newMemos);
  // }, [memos] ); -- 삭제
   // 사용자 정의 훅의 메모 삭제 로직 실행
   deleteTodo(index);
  }, [deleteTodo] );
  
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


export default App;
import { useContext } from "react";
import { AdminFlagContext5 } from "./providers/AdminFlagProvider";

const style = {
    width: "100px",
    padding: "6px",
    borderRadius: "8px"
};
export const EditButton = ()=>{
    // const { isAdmin, name } = props;
    const modifyButton = ()=>{
        alert(" 수정버튼을 눌렀습니다 ");
    }
    // 글로벌 State를 사용할 것을 지정함
   // const contextValue = useContext(AdminFlagContext5);
    const { isAdmin,  name } = useContext( AdminFlagContext5 );
    console.log( isAdmin + " " + name );
    return(
        <>
           <button style={style} disabled = {!isAdmin} onClick={ modifyButton }> 수정 </button>
           { (isAdmin) ? <span> 관리자모드-{name} </span> : <span> 일반인모드-{name} </span> }
        </>
    );
};
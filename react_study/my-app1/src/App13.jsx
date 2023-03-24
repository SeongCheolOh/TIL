import { useContext } from "react";
import {Card} from "./components5/Card";
import { AdminFlagContext5 } from "./components5/providers/AdminFlagProvider";

const App13 = () =>{
   // const [isAdmin, setIsAdmin] = useState(false);
   // const [name, setName] = useState("");
    const { isAdmin, setIsAdmin, name, setName } = useContext( AdminFlagContext5 );

    const onClickName = () =>{
        const inName = prompt("이름은?");
        setName(inName);
    }
    const onClickSwitch = ()=>{
        setIsAdmin( !isAdmin );
    }
    return(
        <>
        <button onClick={ onClickName }>이름 입력</button>
        {(isAdmin) ?  <span> {name} 관리자</span> : <span> {name} 일반인</span>}
        <br></br>
        <button onClick={onClickSwitch}> 전환 </button>
        <Card isAdmin={isAdmin} name = {name} />
        </>
    );
}
export default App13;
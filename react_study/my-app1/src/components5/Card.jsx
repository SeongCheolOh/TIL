import {EditButton} from "./EditButton";
import { useContext } from "react";
import { AdminFlagContext5 } from "./providers/AdminFlagProvider";


const style={
    width: "300px",
    height: "200px",
    margin: "8px",
    borderRadius: "8px",
    display: "flex",
    flexDirection: "column",
    justifiyContent: "center",
    alignItems: "center"
};

export const Card = ()=>{
//    const { isAdmin, name } = props;
  const { isAdmin,  name } = useContext( AdminFlagContext5 );
   return(
    <div style={style}>
        <p> 여기는 Card컴포넌트 {name} { isAdmin }</p>
        <EditButton/>
    </div>
   );
}
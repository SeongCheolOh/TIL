import { useState } from "react";
import axios from "axios";

export const P252사용자정의훅 = ()=>{
    const [userList, setUserList] = useState([]);
    const [isLoading, setIsLoading] = useState(false);
    const [isError, setIsError] = useState(false);
    const onClickFetchUser = ()=>{
        setIsLoading(false);
        setIsError(false);
        
        axios
            .get("https://jsonplaceholder.typicode.com/users")
            .then( result => {
                //userId와 id가 결합하도록 변환
                const users = result.data.map( user => ({
                    street: user.address.street,
                    lat: user.address.geo.lat,

                    
                }));
                setUserList(users);
               
            })
            .catch( ()=> setIsError( true ))
            .finally( ()=> setIsLoading( false ));
        }; 

    return(
        <>
          <button onClick={onClickFetchUser}>사용자 정보 얻기 </button>
          { isError && <p style={{ color:"red"}}> 에러가 발생하였습니다.</p>}
          { (isLoading) ? 
            ( <p> 데이터를 가져오고 있습니다 </p>  )
            : ( userList.map( user => ( <p> { user.street } { user.lat} </p> 
                             ))
          )}
         
        </>
    );
}
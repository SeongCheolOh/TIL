import { useState } from "react";
import axios from "axios";
export const useFetchUsers = ()=>{
   
   
    const [userList, setUserList] = useState([]);
    const [isLoading, setIsLoading] = useState(false);
    const [isError, setIsError] = useState(false);
   const onClickFetchUser = () => {
    setIsLoading(false);
    setIsError(false);
    
    axios
        .get("https://jsonplaceholder.typicode.com/posts")
        .then( result => {
            //userId와 id가 결합하도록 변환
            const users = result.data.map( user => ({
                userId: user.userId,
                conId: `새로 만든 아이디 ${user.id} - ${user.userId}`,
                title: user.title,
                body: user.body
            }));
            setUserList(users);
        })
        .catch( ()=> setIsError( true ))
        .finally( ()=> setIsLoading( false ));
    };

   return { userList, onClickFetchUser }
}
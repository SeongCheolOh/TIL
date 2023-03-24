import axios from "axios";
import { useEffect, useState } from "react";
import { ListItem } from "./ListItem";

export const JsonDataEx01 = ()=>{
    const [ users, setUsers ] = useState([]);
    useEffect( ()=> {
        axios.get("https://jsonplaceholder.typicode.com/posts")
             .then( (res)=>{
               setUsers( res.data );
        } ) }, [] );
   
    return(**
        <>
          {/* {  users.map( user =>  console.log( user.title)  )} -- 되는 것임 */}
          { users.map( user=> <ListItem id={user.id} title={user.title} body={user.body} /> )}
        </>
    );
};
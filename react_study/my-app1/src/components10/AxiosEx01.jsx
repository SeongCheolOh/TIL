import axios from "axios";
import { useState } from "react";

export const AxiosEx01 = ()=>{
   
    const [ userList, setUserList ] = useState([]);
    const [ isLoading, setIsLoading ] = useState( false ); 
    const [ isError, setIsError ] = useState( false );
    const onClickFetchUser =()=>{
        // axios 형식
        //  axios 
        //     .get(url주소)
        //     .then( 주소가 웹페이지 들어오면 이부분을 처리 )
        //     .catch( 에러가 발생하면 이곳을 처리하세요 )
        //     .finally( 정상처리나 에러처리나 모두 이곳을 처리하세요 )
        setIsLoading(true);
        setIsError(false);

        axios
            .get("https://jsonplaceholder.typicode.com/users")
            .then( res => {
                const users = res.data.map( user => ( { 
                    id: user.id,
                    street: user.address.street,
                    lat: user.address.geo.lat,
                    lng: user.address.geo.lng
                    
                } ));
                setUserList( users );

            } ) // end then
            .catch( ()=> setIsError(true)    ) // end catch
            .finally( () => setIsLoading( false ) ) // end finally
    }
    return(
        <>
          <button onClick= {onClickFetchUser}> 사용자 정보 얻기 </button>
           {/* (조건문) ? ( 참 ): (거짓)  */}
           { isError && <p style= {{ color:"red"}}> 에러가 발생했습니다 </p> } 

           {/*로딩이 끝나면 자료를 출력하기 */}
          { ( isLoading )   ? ( <p> 데이터 가져오기 </p>) :
                    (  userList.map( user => ( <p>  id-{user.id} <br></br>
                                                        street-{user.street}<br></br>
                                                        lat-{user.lat}<br></br>
                                                        lng-{user.lng} </p> ))  ) }
        </>
    );
};

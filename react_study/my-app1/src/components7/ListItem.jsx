
export const ListItem = (props)=>{
   const { id, title, body } = props;
    return(
    <>
      <p> {id} </p>
      <p> {title} </p>
      <p> {body} </p>
    </>
    );
}
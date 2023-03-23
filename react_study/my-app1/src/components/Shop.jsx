//Shop.jsx는 Login.jsx에서 import합니다. props 속성값을 id pw shopid 넘겨준다
import { ShopDtl } from "./ShopDtl";
export const Shop = (props) => {
  const contentProps = {
    id: props.id,
    pw: props.pw,
  };
  const { id, pw } = contentProps;
  return (
    <>
      {console.log(id, pw)}
      <ShopDtl id={props.id} pw={props.pw} shopId="t-100"></ShopDtl>
    </>
  );
};

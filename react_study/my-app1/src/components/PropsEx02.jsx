// 아래 구조와 같이 컴포넌트를 구성하시고 해당 데이터 id, pw, shopid를 props로 내려주고
// PropsEx02.jsx
// - Login.jsx -id:abc pw:1234
//     -Shop.jsx - id, pw, shopid : t-100
// - ShopDtl.jsx - 모두 출력하시오

//처리 조건
// Login.jsx import합니다 props속성값을 id pw 넘겨준다
// Shop.jsx는 Login.jsx에서 import 한다. props 속성값을 id pw shopid 넘겨준다
// ShopDtl import 후 모두 출력

import { Login } from "./Login";
import { ShopDtl } from "./ShopDtl";

export const PropsEx02 = () => {
  return (
    <>
      <Login id="abc" pw="1234"></Login>
      <ShopDtl></ShopDtl>
    </>
  );
};

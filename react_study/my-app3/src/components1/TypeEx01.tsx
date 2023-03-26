
export const TypeEx01 = ()=>{
    const ex = ()=>{
        let str: string="A";
        str = "B";
        //str = 100;
        let num: number=0;
        num = 10;
       // num = "10";
       let bool: boolean=false;
       bool = true;
       bool = false;
      // bool = "B";
      const arr1: Array<number> = [0,1,2];
      arr1[0]=10;
      //arr1[1]="10";
      let n: null = null;
      n = null;
      //n = 10;
      let u: undefined = undefined; // 미지정 아직 형이 정해지지 않은 상태 
      u = undefined;
      //u = null;
      let a: any;// 모든 형을 다 넣을 수 있는 것 
      a=undefined;
      a=null;
      a=true;
      a=10;
      a="A";
      funcA( 10 );
      //funcA( "10" ); 인수의 자료형이 문자형이라 맞지 않아서
      // funcA(); ()인수가 없어서
      const r = funcA(100);
    }

    const funcA = ( num: number): void =>{
        console.log( num );
    }

    const obj: { str: string, num: number  } = {
         str: "A",
         num: 10
    }

    const obj1: { str: string } & { num: number} = {
            str: "A",
            num: 10,
           // name: "홍길동", 못씀 
    }
    //obj2는 string타입도 되고 number 타입도 됨
    let obj2: string  |  number = "";
    obj2 = "A";
    obj2 = 10;


    

    return(
        <>
            {ex} 
        </>
    );
}
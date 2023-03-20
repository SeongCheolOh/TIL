const onClickAdd = ()=>{
    const textEl = document.getElementById("add-text");
    const text = textEl.value;//input태그에 입력한 값
    console.log(text); //커피
    textEl.value = "";

    const li = document.createElement("li");
    const div = document.createElement("div");
    const p = document.createElement("p");
    p.textContent = text; //<p> 커피 </p>
    console.log(p);

    const button = document.createElement("button");
    button.textContent = "삭제";
    console.log(button); //<button>  삭제 </button>

    button.addEventListener( "click", ()=>{
        const deleteTarget = button.closest("li"); 
        //closest는 부모요소와 일치하는 문자열을 찾는 메소드
        document.getElementById("memo-list").removeChild(deleteTarget);
    } );

    div.appendChild(p);
    div.appendChild(button);

    li.appendChild(div);
    document.getElementById("memo-list").appendChild(li);
 };

    document.getElementById("add-button")
            .addEventListener("click", () => onClickAdd());

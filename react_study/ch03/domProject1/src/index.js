const onClickAdd = () => {
  const textEl = document.getElementById("add-text");
  const text = textEl.value;
  console.log(text); //텍스트 입력
  textEl.value = "";

  const li = document.createElement("li");
  const div = document.createElement("div");
  const p = document.createElement("p");
  p.textContent = text;
  console.log(p); //<p>텍스트</p>

  const button = document.createElement("button");
  button.textContent = "삭제";
  console.log(button);

  button.addEventListener("click", () => {
    const deleteTarget = button.closest("li");
    //closest = 부모 요소와 일치하는 문자열을 찾는 메소드
    document.getElementById("memo-list").removeChild(deleteTarget);
  });
  div.appendChild(p);
  div.appendChild(button);

  li.appendChild(div);
  document.getElementById("memo-list").appendChild(li);
};
document
  .getElementById("add-button")
  .addEventListener("click", () => onClickAdd());

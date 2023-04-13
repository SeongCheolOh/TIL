const form = document.querySelector("#signup-form");
const lastNameInput = document.querySelector("#last-name-input");
const firstNameInput = document.querySelector("#first-name-input");
const emailInput = document.querySelector("#email-input");
const submitButton = document.querySelector("#submit-button");
const cancelButton = document.querySelector("#cancel-button");
const errorMessage = document.querySelector("#error-message");

function validateForm() {
  if (
    lastNameInput.value === "" ||
    firstNameInput.value === "" ||
    emailInput.value === ""
  ) {
    errorMessage.textContent = "빈 칸을 입력하시오";
    return false;
  } else {
    errorMessage.textContent = "";
    return true;
  }
}

form.addEventListener("submit", (event) => {
  event.preventDefault();
  if (validateForm()) {
    alert("회원 가입이 완료되었습니다");
    form.reset();
  }
});

cancelButton.addEventListener("click", () => {
  form.reset();
});

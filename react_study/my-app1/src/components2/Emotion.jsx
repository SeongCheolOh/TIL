import { css } from "@emotion/react";
import styled from "@emotion/styled";

export const Emotion = () => {
  //1. scss 방법 하려면 라인1 필요
  const containerStyle = css`
    border: solid 1px #aaa;
    border-radius: 20px;
    padding: 8px;
    margin: 8px;
    display: flex;
    justify-content: space-around;
    align-items: center;
  `;
  //2. 인라인 스타일 방법 하려면 라인1 필요
  const titleStyle = css({
    margin: 0,
    color: "#aaa",
  });
  //3. style-components 방법 하려면 라인2 필요
  const SButton = styled.button`
    .button {
      background-color: #ddd;
      border: none;
      padding: 8px;
      border-radius: 8px;
      &:hover {
        background-color: #ddd;
        color: #fff;
        cursor: pointer;
      }
    }
  `;

  return (
    <div css={containerStyle}>
      <p css={titleStyle}> Emotion입니다</p>
      <SButton>버튼</SButton>
    </div>
  );
};

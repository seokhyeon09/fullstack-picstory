import React from "react";
import "./Button.scss";
const Button = ({ text, className, onClick, backico = "", icons }) => {
  const backIcoSrc =
    backico == "wh"
      ? "/images/arrow-back-wh.svg"
      : backico == "bh"
        ? "images/arrow-back.svg"
        : null;
  return (
    <button onClick={onClick} className={`btn ${className}`}>
      {backIcoSrc && <img src={backIcoSrc} />}
      {text}
      {icons && <img src="/images/arrow.svg" />}
    </button>
  );
};

export default Button;

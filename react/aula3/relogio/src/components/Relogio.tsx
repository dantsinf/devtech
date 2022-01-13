import React, { useState } from "react";
import "./Relogio.css";

const Relogio = () => {
  let tempo = new Date().toLocaleTimeString();
  const [otempo, setOtempo] = useState(tempo);
  const [ligado, setLigado] = useState(false);

  const AtualizaHora = () => {
    tempo = new Date().toLocaleTimeString();
    setOtempo(tempo);
    return otempo;
  };

  setInterval(AtualizaHora, 1000);

  return (
    <>
      <div className="principal">
        <h1>{ligado ? otempo : "Deligado"}</h1>
        <div>
          <button
            onClick={() => {
              setLigado(!ligado);
            }}
          >
            {otempo ? "Ligado" : "Desligado"}
          </button>
        </div>
      </div>
    </>
  );
};

export default Relogio;

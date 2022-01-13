import React, { useEffect, useState } from "react";
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

  /*useEffect(() => {
    //console.log(otempo);
    //console.log("ok");
    document.title = "Teste" + otempo;
  });*/

  setInterval(AtualizaHora, 1000);

  return (
    <>
      <div className="principal">
        <h1>{ligado ? otempo : ""}</h1>
        <div>
          <button
            onClick={() => {
              setLigado(!ligado);
            }}
          >
            {ligado ? "Desliga" : "Liga"}
          </button>
        </div>
      </div>
    </>
  );
};

export default Relogio;

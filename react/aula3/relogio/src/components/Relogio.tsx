import React, { useState } from 'react'
import './Relogio.css'

const Relogio = () => {
  let tempo = new Date().toLocaleTimeString();
  const [otempo, setOtempo] = useState(tempo);

  const AtualizaHora = () => {
    tempo = new Date().toLocaleTimeString();
    setOtempo(tempo); 
    return otempo 
  }

  setInterval(AtualizaHora, 1000);


  return (
    <>
      <div className='principal' > 
        <h1>{otempo}</h1>
          <div>
            <button onClick={()=>{console.log(otempo);
            }}>{otempo ? 'Ligado' : 'Desligado'}</button>
          </div>
      </div>
    </>
  )
}

export default Relogio

import React, { useState } from 'react'
import './Relogio.css'

const Relogio = () => {
  let tempo = new Date().toLocaleTimeString();
  const [otempo, setOtempo] = useState(tempo);

  const AtualizaHora = () => {
    tempo = new Date().toLocaleTimeString();
    setOtempo(tempo);  
  }

  setInterval(AtualizaHora, 1000);

  return (
    <>
      <div className='principal' >
        <h1>{otempo}</h1>
          <div>
            <button>Pega hor</button>
          </div>
      </div>
    </>
  )
}

export default Relogio

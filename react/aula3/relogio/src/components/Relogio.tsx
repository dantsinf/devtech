import React from 'react'
import './Relogio.css'

const Relogio = () => {
  const hora = new Date().toLocaleTimeString();

  return (
    <div className='principal' >
      <h1>{hora}</h1>
    </div>
  )
}

export default Relogio

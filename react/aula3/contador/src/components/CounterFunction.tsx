import React, { useState } from 'react'

const CounterFunction = () => {
  const [count, setCount] = useState(0);

  const handleClick = () => {
    setCount(count + 1);
  }


  return (
    <div>
      <p>You clicou {count} vezes</p>
      <button onClick={handleClick}>Me clique</button>
    </div>
  )
}

export default CounterFunction

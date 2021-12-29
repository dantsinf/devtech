import React from 'react'

const MyBotton = () => {

  const handleClick = () => {
    alert('Hello World!');
  };

  const handleClick2 = (event: React.MouseEvent<HTMLButtonElement>) => {
    alert('Clicked: '+ event.currentTarget.name);
  };

  return (
    <button onClick={handleClick2} name="hello" >
      Clique aqui
    </button>
  )
}

export default MyBotton

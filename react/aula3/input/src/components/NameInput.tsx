import React, { useState } from 'react'

const NameInput = () => {
  const [name, setName] = useState('');
  console.log('rendered');

  const handleChange: React.ChangeEventHandler<HTMLInputElement> = (event) => {
    setName(event.target.value);
  }
  
  return (
    <>
      <label htmlFor='nameInput' >Name: </label>
      <input id='nameInput' value={name} onChange={handleChange} />
      {name ? <span>Hello {name}</span>: 'Who?'}
    </>
  );
}

export default NameInput

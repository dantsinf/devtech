import React, { useState, useEffect } from 'react'

const NameInput = () => {
  //const [name, setName] = useState('') //inicia a variavel vazia
  const [name, setName] = useState((()=>{
    console.log('inicial stage');
    //aqui com getItem ele obtem/lê o que está no localStorage, para evitar iniciar sempre com vazio
    //lembrando que o valor inicial vai ser vazio, depois ele mantpem oi que tu digitou
    return window.localStorage.getItem('name') || '';
  }));
  console.log('rendered');

  const handleChange: React.ChangeEventHandler<HTMLInputElement> = (event) => {
    setName(event.target.value);
  }

  /*
  useEffect(() => {
    console.log('effect');
    window.localStorage.setItem('name', name); //aqui ele grava o que está em name no localStorage
    })
    */

    useEffect(() => {
      console.log('effect');
      window.localStorage.setItem('name', name); //aqui ele grava o que está em name no localStorage
      },[name]) //a dependência name, estão o useEffect depende do name, ai o useEffect é carregado
  
  return (
    <>
      <label htmlFor='nameInput' >Name: </label>
      <input id='nameInput' value={name} onChange={handleChange} />
      {name ? <span>Hello {name}</span>: 'Who?'}
    </>
  );
}

export default NameInput

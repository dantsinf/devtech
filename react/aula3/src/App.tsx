import React from 'react';
import logo from './logo.svg';
import './App.css';
import CounterV2 from './components/CounterV2';
import CounterFunction from './components/CounterFunction';

function App() {
  return (
    <>
      <CounterV2 initialValue={5} />
      <CounterFunction/>
    </>
  );
}

export default App;

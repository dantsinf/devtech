import React, { useState, useEffect } from 'react'
import { TodoDto } from './TodoSto';

interface TodosError {
  menssage: string,
  status: number
}

const Todos = () => {
  const [data, setData] = useState<TodoDto[]>();
  const [error, setError] = useState<TodosError>();

  useEffect(() => {
    console.log('effect');
    fetchTodos().then(() => console.log('fetched'));
  },[]);
    
  return (
    <ul>
      {data && data.map((todo:TodoDto) => {}) 
      }
    </ul>
  );


}

function fetchTodos() {
  const URI = 'https://jsonplaceholder.typicode.com/todos';
  return fetch(URI)
    .then(response => console.log(response));
}

export default Todos

import React, { useState } from "react";

interface CounterV2Props {
    initialValue: number
}

function CounterV2(props: CounterV2Props) {
   const [count, setCount] = useState(props.initialValue);

   const handleClickIncrement = () => {
       setCount(count + 1);
   };

   const handleClickDecrement = () => {
       setCount(count - 1);
   };

   return (
       <div>
           <p>Value = {count}</p>
           <button onClick={handleClickIncrement}>Incremento</button>
           <button onClick={handleClickDecrement}>Decremento</button>
       </div>
   );
}

export default CounterV2;
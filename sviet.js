export default function Sviet(props)
{
    return(
        <div>
            <h1>
                {props.title}
            </h1>
        </div>
    );
}

//app.js
import './App.css';
import Sviet from "./sviet";
function App() {
  return (
    <div className="App">
      { <header className="App-header">
      <img src={"https://www.sviet.edu.in/wp-content/uploads/2023/05/SVIET-LOGO-Edited.png"} classname="App-logo" alt="logo" />
        <p>
         <code> Sri Vasavi Institute of Engineering and Technology</code>
        </p>
        <a 
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <Sviet title="Empowering Minds"/>
        
      </header> }
      </div>
  );
}

export default App;

import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="container">
      <h1>Cadastro</h1>
      <form>
        <div className="col-6">
          <div>
            <label className="form-label">Nome</label>
            <input type="text" className="form-control"/>
          </div>
          <div>
            <label className="form-label">Gostos</label>
            <input type="text" className="form-control"/>
          </div>
        

        </div>
      </form>
    </div>
    
  );
}

export default App;

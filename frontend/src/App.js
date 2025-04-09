// import logo from './logo.svg';
import './App.css';

import { Outlet } from "react-router-dom";
import Footer from './components/Footer';

function App() {
  return (
    <div className="min-h-screen flex flex-col bg-gray-900 text-white">
      <header className="bg-gray-800 p-4 shadow-md">
        <h1 className="text-2xl font-bold text-center text-[#E50914]">WebXemPhim</h1>
      </header>

      <main className="flex-1 p-4">
        <Outlet />
      </main>

      <Footer/>
    </div>
  );
}

export default App;



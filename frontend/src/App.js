// import logo from './logo.svg';
import './App.css';

import { Outlet } from "react-router-dom";
import Footer from './components/layout/Footer';
import Header from './components/layout/Header';

function App() {
  return (
    <div className="min-h-screen flex flex-col bg-gray-900 text-white">
      <Header />

      <main className="flex-1">
        <Outlet />
      </main>

      <Footer />
    </div>
  );
}

export default App;



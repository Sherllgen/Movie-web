import { useEffect, useState } from "react";
import {
  MagnifyingGlassIcon,
  UserIcon,
  Bars3Icon,
  XMarkIcon,
} from "@heroicons/react/24/solid";
import logoimg from "../assets/logo-img.png";


function Header() {
  const [isScrolled, setIsScrolled] = useState(false);
  const [isMobileMenuOpen, setIsMobileMenuOpen] = useState(false);

  useEffect(() => {
    const onScroll = () => setIsScrolled(window.scrollY > 10);
    window.addEventListener("scroll", onScroll);
    return () => window.removeEventListener("scroll", onScroll);
  }, []);

  return (
    <>
      <header
        className={`top-0 left-0 w-full z-50 px-4 py-3 flex items-center justify-between transition-all duration-300 ${
          window.innerWidth < 1280
            ? "absolute bg-gray-800"
            : isScrolled
            ? "sticky bg-gray-800"
            : "absolute bg-gradient-to-b from-black/70 to-transparent"
        }`}
      >
        {/* Mobile: Menu Icon */}
        <div className="xl:hidden">
          {isMobileMenuOpen ? (
            <button onClick={() => setIsMobileMenuOpen(false)}>
              <XMarkIcon className="w-6 h-6 z-50 text-white" />
            </button>
          ) : (
            <button onClick={() => setIsMobileMenuOpen(true)}>
              <Bars3Icon className="w-6 h-6 text-white" />
            </button>
          )}
        </div>

        {/* Logo */}
        <div className="flex items-center gap-2">
          <img
            src={logoimg}
            alt="Logo"
            className="w-8 h-8"
          />
          <div>
            <h1 className="text-base font-bold leading-none">RoPhim</h1>
            <p className="text-xs text-gray-300">Phim hay cả rổ</p>
          </div>
        </div>
        {/* Search bar */}
        {window.innerWidth >= 1280 && (
          <div className="flex-1 mx-6 max-w-xs w-full bg-gray-500 bg-opacity-15 rounded">
            <div className="flex items-center rounded overflow-hidden px-3 py-1">
              <MagnifyingGlassIcon className="w-5 h-5 text-white" />
              <input
                type="text"
                placeholder="Tìm kiếm phim, diễn viên"
                className="flex-1 px-2 py-1 outline-none text-white text-sm bg-transparent"
              />
            </div>
          </div>
        )}

        {/* Search Icon */}
        <div className="xl:hidden">
          <MagnifyingGlassIcon className="w-5 h-5 text-white" />
        </div>

        {/* Menu (Desktop only) */}
        <nav className="hidden xl:flex items-center gap-8 text-sm text-gray-200 flex-1 justify-center">
          <a href="">Chủ Đề</a>
          <a href="">Phim Lẻ</a>
          <a href="">Phim Bộ</a>
          <a href="">Quốc gia</a>
          <a href="">Diễn Viên</a>
          <a href="">Lịch chiếu</a>
        </nav>

        {/* Thành Viên */}
        <div className="hidden xl:flex items-center gap-2 bg-white text-black px-3 py-1 rounded-full text-sm">
          <UserIcon className="w-4 h-4" />
          <span>Thành viên</span>
        </div>
      </header>

      {/* Mobile Menu Overlay */}
      {isMobileMenuOpen && (
        <div className="fixed inset-0 z-40 flex flex-col justify-start pt-16 px-6 text-white">
          <div className="w-full max-w-sm bg-[#2c3e50] p-4 rounded-lg shadow-lg space-y-4">
            <div className="flex items-center gap-2 bg-white text-black px-3 py-2 rounded-full">
              <UserIcon className="w-4 h-4" />
              <span>Thành viên</span>
            </div>
            <nav className="space-y-2 text-sm">
              <a href="" className="block">
                Chủ Đề
              </a>
              <a href="" className="block">
                Phim Lẻ
              </a>
              <a href="" className="block">
                Phim Bộ
              </a>
              <a href="" className="block">
                Quốc gia
              </a>
              <a href="" className="block">
                Diễn Viên
              </a>
              <a href="" className="block">
                Lịch chiếu
              </a>
            </nav>
          </div>
        </div>
      )}
    </>
  );
}

export default Header;

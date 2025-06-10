function Poster() {
  return (
    <div
      className="relative h-[60vh] sm:h-[70vh] md:h-[75vh] lg:h-[80vh] bg-cover bg-center flex items-center"
      style={{
        backgroundImage:
          "url('https://image.tmdb.org/t/p/original/8Y43POKjjKDGI9MH89NW0NAzzp8.jpg')",
      }}
    >
      <div className="absolute inset-0 bg-gradient-to-r from-black to-transparent"></div>

      <div className="relative z-10 px-4 sm:px-6 md:px-8 max-w-full sm:max-w-2xl text-white space-y-3 sm:space-y-4">
        {/* Logo & title */}
        <div>
          <h2 className="text-3xl sm:text-4xl md:text-5xl font-extrabold tracking-wide">
            DAREDEVIL
          </h2>
        </div>

        {/* Info badges */}
        <div className="flex flex-wrap gap-2 text-xs sm:text-sm font-medium">
          <span className="bg-yellow-500 text-black px-2 py-1 rounded">
            IMDb 8.5
          </span>
          <span className="border px-2 py-1 rounded">T18</span>
          <span className="border px-2 py-1 rounded">2025</span>
          <span className="border px-2 py-1 rounded">Phần 1</span>
          <span className="border px-2 py-1 rounded">Tập 8</span>
        </div>

        {/* Tags */}
        <div className="flex flex-wrap gap-2 text-[10px] sm:text-xs text-white/90">
          {["Chính Kịch", "Hình Sự", "Siêu Anh Hùng", "Marvel"].map((tag) => (
            <span key={tag} className="bg-white/10 px-2 py-1 rounded-full">
              {tag}
            </span>
          ))}
        </div>

        {/* Mô tả */}
        <p className="text-xs sm:text-sm text-white/80">
          Matt Murdock, một luật sư mù với khả năng đặc biệt, chiến đấu cho công
          lý thông qua công ty luật sầm uất của mình. Trong khi cựu trùm mafia
          Wilson Fisk theo đuổi những nỗ lực chính trị của riêng mình ở New
          York...
        </p>

        {/* Nút hành động */}
        <div className="flex items-center gap-3 mt-2 sm:mt-4">
          <button className="bg-yellow-400 text-black hover:bg-yellow-500 px-4 sm:px-5 py-2 rounded-full font-semibold flex items-center gap-2 text-sm sm:text-base">
            ▶ Xem Ngay
          </button>
        </div>
      </div>
    </div>
  );
}

export default Poster;

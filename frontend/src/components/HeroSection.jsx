function HeroSection() {
    return (
      <div className="relative h-[80vh] bg-cover bg-center flex items-center" style={{ backgroundImage: "url('https://image.tmdb.org/t/p/original/8Y43POKjjKDGI9MH89NW0NAzzp8.jpg')" }}>
        <div className="absolute inset-0 bg-gradient-to-r from-black to-transparent"></div>
        <div className="relative z-10 px-8 max-w-2xl text-white">
          <h2 className="text-4xl md:text-5xl font-bold">STAR WARS</h2>
          <p className="text-lg mt-2">THE RISE OF SKYWALKER</p>
          <p className="text-sm text-gray-300 mt-4">
            The surviving members of the resistance face the First Order once again...
          </p>
          <div className="flex items-center gap-4 mt-6">
            <button className="bg-blue-500 hover:bg-blue-600 px-5 py-2 rounded font-semibold"> Watch Now</button>
            <button className="border border-white px-5 py-2 rounded font-semibold">▶ Trailer</button>
          </div>
        </div>
      </div>
    );
  }
  
  export default HeroSection;
  
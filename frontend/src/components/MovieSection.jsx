// src/components/MovieSection.jsx
const mockMovies = [
    {
      id: 1,
      title: "Captain America",
      year: "2011",
      img: "https://image.tmdb.org/t/p/w300/ctOEhQiFIHWkiaYp7b0ibSTe5IL.jpg",
      rating: 4.5,
    },
    {
      id: 2,
      title: "Spider-Man",
      year: "2021",
      img: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      rating: 4.7,
    },
    // Add more as needed
  ];
  
  function MovieSection({ title }) {
    return (
      <div className="px-6">
        <h3 className="text-2xl font-bold text-white mb-4">{title}</h3>
        <div className="flex gap-4 overflow-x-auto scrollbar-hide">
          {mockMovies.map((movie) => (
            <div
              key={movie.id}
              className="min-w-[160px] bg-gray-800 rounded overflow-hidden hover:scale-105 transition-transform"
            >
              <img src={movie.img} alt={movie.title} className="w-full h-60 object-cover" />
              <div className="p-2 text-sm">
                <h4 className="text-white font-semibold">{movie.title}</h4>
                <p className="text-gray-400 text-xs">{movie.year}</p>
                <p className="text-yellow-400 text-xs">⭐ {movie.rating}</p>
              </div>
            </div>
          ))}
        </div>
      </div>
    );
  }
  
  export default MovieSection;  
function FeaturedSection() {
    return (
      <div className="relative px-6 mt-12">
        <div
          className="rounded-lg overflow-hidden h-64 md:h-96 bg-cover bg-center flex items-end"
          style={{
            backgroundImage: "url('https://image.tmdb.org/t/p/original/z2gENXbGi0ZNTzH8kz3ODwRZzBk.jpg')",
          }}
        >
          <div className="bg-gradient-to-t from-black to-transparent w-full p-6">
            <h3 className="text-2xl md:text-3xl font-bold text-white mb-2">
              House of the Dragon
            </h3>
            <p className="text-gray-300 text-sm max-w-xl">
              Lorem ipsum dolor sit amet consectetur. Rutrum ultricies amet cursus hac viverra...
            </p>
            <div className="mt-4 flex gap-4">
              <button className="bg-blue-500 text-white px-4 py-2 rounded">▶ Watch</button>
              <button className="border border-white text-white px-4 py-2 rounded">+ My List</button>
            </div>
          </div>
        </div>
      </div>
    );
  }
  
  export default FeaturedSection;
  
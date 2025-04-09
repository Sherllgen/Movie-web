import HeroSection from "../components/HeroSection";
import MovieSection from "../components/MovieSection";
import FeaturedSection from "../components/FeaturedSection";

function Home() {
  return (
    <div className="space-y-16">
      <HeroSection />

      <MovieSection title="Popular Movies" />
      <MovieSection title="Trending" />
      <MovieSection title="Action" />
      <MovieSection title="Fiction" />

      <FeaturedSection />

    </div>
  );
}

export default Home;

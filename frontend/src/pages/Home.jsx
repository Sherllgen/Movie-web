import Poster from "../components/Poster";
import MovieSection from "../components/MovieSection";
import FeaturedSection from "../components/FeaturedSection";
import RankingList from "../components/RankingList";

function Home() {
  return (
    <div className="space-y-16">
      <Poster />

      <MovieSection title="Popular Movies" />
      <MovieSection title="Trending" />
      <MovieSection title="Action" />
      <MovieSection title="Fiction" />
      <RankingList/>

      <FeaturedSection />

    </div>
  );
}

export default Home;

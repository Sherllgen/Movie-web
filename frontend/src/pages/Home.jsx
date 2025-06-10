import Poster from "../components/ui/Poster";
import MovieSection from "../components/section/MovieSection";
import FeaturedSection from "../components/section/FeaturedSection";
import RankingList from "../components/ui/RankingList";

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

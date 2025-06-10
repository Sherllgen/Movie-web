import { FaFire, FaHeart } from "react-icons/fa";
import { BsFillCaretUpFill, BsDash } from "react-icons/bs";

const rankings = {
  hot: [
    {
      rank: 1,
      title: "Bác Sĩ Nhân Ái",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "equal",
    },
    {
      rank: 2,
      title: "Hội Bạn Trai của Bunny",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "up",
    },
    {
      rank: 3,
      title: "Ăn, Chạy, Yêu",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "down",
    },
    {
      rank: 4,
      title: "Khi Cuộc Đời Cho Bạn Quả Quýt",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "up",
    },
    {
      rank: 5,
      title: "Trái Tim Bị Chôn Vùi",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "up",
    },
  ],
  fav: [
    {
      rank: 1,
      title: "Khi Cuộc Đời Cho Bạn Quả Quýt",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "up",
    },
    {
      rank: 2,
      title: "Hội Bạn Trai của Bunny",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "up",
    },
    {
      rank: 3,
      title: "Trái Tim Bị Chôn Vùi",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "up",
    },
    {
      rank: 4,
      title: "Daredevil: Tái Xuất",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "up",
    },
    {
      rank: 5,
      title: "Bậc Thầy Đàm Phán",
      image: "https://image.tmdb.org/t/p/w300/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      trend: "up",
    },
  ],
};

const getTrendIcon = (trend) => {
  switch (trend) {
    case "up":
      return <BsFillCaretUpFill className="text-green-400" />;
    case "down":
      return <BsFillCaretUpFill className="text-pink-400 rotate-180" />;
    default:
      return <BsDash className="text-gray-400" />;
  }
};

export default function RankingList() {
  return (
    <div className="px-6">
      <div className="grid grid-cols-1 md:grid-cols-2 gap-4 text-sm text-white bg-[#18181C] p-4 rounded-lg">
        {/* Lượt view */}
        <div>
          <h2 className="flex items-center gap-2 font-semibold mb-3 text-lg">
            <FaFire className="text-yellow-400" />
            XEM NHIỀU NHẤT
          </h2>
          <ul className="space-y-2">
            {rankings.hot.map((item) => (
              <li key={item.rank} className="flex items-center gap-2">
                <span className="w-5">{item.rank}.</span>
                <img
                  src={item.image}
                  alt={item.title}
                  className="w-8 h-12 object-cover rounded-sm"
                />
                <span className="truncate flex-1">{item.title}</span>
                {getTrendIcon(item.trend)}
              </li>
            ))}
            <div className="text-gray-400 mt-2 cursor-pointer hover:underline">
              Xem thêm
            </div>
          </ul>
        </div>

        {/* Yêu thích nhất */}
        <div>
          <h2 className="flex items-center gap-2 font-semibold mb-3 text-lg">
            <FaHeart className="text-yellow-300" />
            YÊU THÍCH NHẤT
          </h2>
          <ul className="space-y-2">
            {rankings.fav.map((item) => (
              <li key={item.rank} className="flex items-center gap-2">
                <span className="w-5">{item.rank}.</span>
                <img
                  src={item.image}
                  alt={item.title}
                  className="w-8 h-12 object-cover rounded-sm"
                />
                <span className="truncate flex-1">{item.title}</span>
                {getTrendIcon(item.trend)}
              </li>
            ))}
            <div className="text-gray-400 mt-2 cursor-pointer hover:underline">
              Xem thêm
            </div>
          </ul>
        </div>
      </div>
    </div>
  );
}

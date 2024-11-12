package basic.q06;

class ShowSeasons {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			int num = 8;
			String Seasons;
			switch (num) {
			case 3: case 4: case 5:
				Seasons = "春";
				break;
			case 6: case 7: case 8:
				Seasons = "夏";
				break;
			case 9: case 10: case 11:
				Seasons = "秋";
				break;
			case 1: case 2: case 12:
				Seasons = "冬";
				break;
			default:
				Seasons = "存在しない";
				break;
		}
		System.out.println(num + "月は" + Seasons + "です。");
	}
}

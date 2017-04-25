import java.util.ArrayList;

public class TempData {

	public static NovelLibrary createTempNovelList() {
		NovelLibrary tempNovelData = new NovelLibrary(new ArrayList<Novel>());
		tempNovelData.addNovel(createNovelTest1);
		return tempNovelData;
	}

	public static Novel createNovelTest2() {
		ArrayList<String> testVolume = new ArrayList<String>();
		testVolume.add("Volume 1");
		testVolume.add("Volume 2");
		testVolume.add("Volume 3");
		testVolume.add("Volume 4");
		testVolume.add("Volume 5");
		testVolume.add("Volume 6");
		testVolume.add("Volume 7");
		ArrayList<String> testRelatedSeries = new ArrayList<>();
		testRelatedSeries.add("Related Sequel");
		testRelatedSeries.add("Related Spin-off");
		testRelatedSeries.add("Related Prequel");
		
		Novel test2 = new Novel("Test 2", testVolume, 3.5, "Test Author 2", testRelatedSeries);
		return test2;
	}
}

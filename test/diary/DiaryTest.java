package diary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    @Test
    public void testThatDiaryIsEmpty(){
        Diary diary = new Diary();
        Assertions.assertTrue( diary.diaryEmpty());
    }

    @Test
    public void testThatICanAddAnEntry(){
        Diary diary = new Diary();
        Assertions.assertTrue( diary.diaryEmpty());
        assertEquals(1, diary.size());
    }

}

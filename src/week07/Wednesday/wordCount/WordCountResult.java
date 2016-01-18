package week07.Wednesday.wordCount;

/**
 * Created by inspired on 13.01.16.
 */
public class WordCountResult {
    private int wordCount;
    private int linesCount;
    private int charactersCount;

    public WordCountResult(int wordCount, int linesCount, int charactersCount){
        this.wordCount = wordCount;
        this.linesCount = linesCount;
        this.charactersCount = charactersCount;
    }

    public int getCharactersCount() {
        return charactersCount;
    }

    public int getLinesCount() {
        return linesCount;
    }

    public int getWordCount() {
        return wordCount;
    }
}

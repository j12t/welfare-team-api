package io.welfareteam.api.common;

public enum MoodLevel {

	VERY_GOOD(5), GOOD(4), NORMAL(3), BAD(2), VERY_BAD(1);

	private final int levelCode;

	private MoodLevel(int levelCode) {
        this.levelCode = levelCode;
    }
	
	public int getLevelCode() {
        return this.levelCode;
    }
}

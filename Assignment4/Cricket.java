
public abstract class Cricket {
int maxOver,targetScore,currentScore,currentOver;



public Cricket(int targetScore2, int maxOver2) {
	this.maxOver=maxOver2;
	this.targetScore=targetScore2;
}




public int getMaxOver() {
	return maxOver;
}




public void setMaxOver(int maxOver) {
	this.maxOver = maxOver;
}




public int getTargetScore() {
	return targetScore;
}




public void setTargetScore(int targetScore) {
	this.targetScore = targetScore;
}




public int getCurrentScore() {
	return currentScore;
}




public void setCurrentScore(int currentScore) {
	this.currentScore = currentScore;
}




public int getCurrentOver() {
	return currentOver;
}




public void setCurrentOver(int currentOver) {
	this.currentOver = currentOver;
}




abstract double calcCurrentRunrate(int currentScore,int currentOver);
abstract double calcReqdRunrate(int remainingRuns ,int remainingOver );
}

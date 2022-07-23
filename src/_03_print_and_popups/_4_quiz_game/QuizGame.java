package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String instructions = "Answer these questions with yes and no, your final score will be shown at the end of the game, each question youg et wrong is - 1 point and each question you get correct is + 1 point";
		JOptionPane.showMessageDialog(null, instructions);
				// 2.  Ask the user a question 
				String question_1 = JOptionPane.showInputDialog("Is WarHammer I a game on Steam?");
				// 3.  Use an if statement to check if their answer is correct
				if(question_1.equals("yes")) {
					score += 1;
				}
				else {
					score -= 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String question_2 = JOptionPane.showInputDialog("Is WarHammer II a game on Steam?");
		
		if(question_2.equals("yes")) {
			score += 1;
		}
		else {
			score -= 1;
		}
			
		String question_3 = JOptionPane.showInputDialog("Is WarHammer IV a game on Steam");
		if(question_3.equals("no")) {
			score += 1;
		}
		else {
			score -= 1;
		}
		
		String question_4 = JOptionPane.showInputDialog("Is Warthunder II a game on Steam?");
		if(question_4.equals("no")) {
			score += 1;
		}
		else {
			score -= 1;
		}
		// After all the questions have been asked, tell the user their final score 
		String final_score = "Good job, your final score is "+score+"!";
		JOptionPane.showMessageDialog(null, final_score);
	}
}

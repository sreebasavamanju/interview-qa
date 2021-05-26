package com.preparing.interview_qa;

/*
 * There are N people, numbered from 0 to N-1, playing a game. The K-th person is assigned the letter S[K]. 
 * At the beginning the oth person sends a message, consisting of a single letter S[0], to the A[O]-th person. 
 * When the K-th person receives the message, they append their letter S[K] to the message and forward it to A[K]. 
 * The game ends when the oth person receives the message. Find the final message.
 *  You can assume that A contains every integer from 0 to N-1 exactly once. 
 *  Write a function: def solution(S, A) that given a string S and an array of integers A, both of length N, 
 *  returns a string denoting the final message received by the Oth person. 
 *   Examples: 1. 
 *    Given S = "cdeo" and A = [3, 2, 0, 1), your function should returns "code". 
 *   At the beginning, the oth person sends a message 'c" to the 3rd person. 
 *   Next, the 3rd person forwards the message 'co" to the 1st person. 
 *   After that the 1st person forwards the message "cod" to the 2nd person. 
 *   After appending the letter 'e' to it,
 *   the 2nd person forward it to the o'th person. The final message, received by o'th person, is "code". 
 *   Examples: 2. Given S = "cdeenetpi" and A = [5, 2,0, 1, 6, 4,8,3,7), your function should returns "centipede". 
 *   Examples: 3. Given S = "bytdag" and A = [4, 3, 0, 1, 2, 5), your function should returns "bat".
 *   Notice, that not all letters from S have to be used. 
 *   Assume that: 
 *   • N is an integer within the range [1..1,000); 
 *   • string S consists only of lowercase letters (a-z); 
 *   • A contains all integers within range [O..N-1); 
 *   • S and A are both of length N. 
 */
public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[] { 3, 2, 0, 1 }, ""));
	}

	public String solution(int[] A, String S) {
		char[] charArray = S.toCharArray();

		StringBuffer buffer = new StringBuffer();
		buffer.append(charArray[0]);
		int i = 0;
		for (; i < charArray.length;) {

			if (A[i] == 0) {
				break;
			}
			char c = charArray[A[i]];
			buffer.append(c);
			i = A[i];

		}

		return buffer.toString();
	}

}

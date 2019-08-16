# OakNorthBankChallenge
Java coding challenge by OakNorth Bank

Problem 1:

Bilbo likes collecting different types of books and reading them whenever he gets time out of his busy schedule. One day Bilbo decided to make groups of books such that each group contains exactly one book of each type and gift each group to one of his friends. Bilbo is wondering how many different groups can he make? 
Input format: 
First line contains an integer N<=100000.
Second line contains N space separated integers where integer at index i represent the type of book i. 
Output Format:
One integer that is number of different groups Bilbo can make. 
Sample Input 1:
7
2 4 2 4 3 2 3
Sample Output 2:
2
Explanation: 
Clearly Bilbo can make 2 sets of {2,3,4} 

Sample Input 2:
2
1 2
Sample Output 2:
1




Problem 2:

The British and The French troops are stranded on the sea shore at Dunkirk. There are n piers along the sea bank in a row, on some of which a number of soldiers wait for evacuation. The i'th pier has either i or no soldiers waiting on it, i e The 6th pier may have either 6 or 0 soldiers on it . Mr Dawson, a brave sailor from England is on a mission to save the soldiers with his ship. But he can anchor his ship at only one pier at a time and save all the soldiers on it, and then move on to any of the other piers. 
Much to his dismay, as soon as he anchors on a pier, the German bomber planes sense his proximity. Thankfully, they are guided by a malfunctioning radar system. So whenever Mr Dawson anchors on a pier m, the bombers arrive and drop bombs on both the piers adjacent to m, i.e. pier m-1 and pier m+1, killing any and all soldiers on either of the two piers, but the soldiers at pier m are saved successfully. Given the list of piers on which their are any soldiers, what is the maximum number of soldiers Mr Dawson can save ? 
Input: 
One line of integers representing the index(1 <= index <= n) of piers which have soldiers separated by space. 
Output: 
A single integer representing The maximum number of soldiers that can be saved. 
Sample Input 1: 
8 12 7 3 
Sample Output 1: 
23 
Explanation: If Dawsons picks pier 12, the planes bomb 11 and 13, which do not have any soldiers. So no lives lost Then if he pic. 8, the planes bomb 7 and 9, of which 7 exists in The list. So only 7 soldiers die.

Sample Input 2: 
879103 
Sample Output 2: 
21 
Explanation: If Dawson picks 10, he loses 9 soldiers and then loses 7 more when he picks 8. 
Constraints 
0 < n < 100000 



Problem 3:

The Girls in Tech Hackathon is a code-a-thon where developers, designers, scientists, students, entrepreneurs and educators gather to collaborate on prmects including applications, software, hardware, data visualization and platform solutions.

 The Participants are sitting around a round table, a. they are numbered from team 1 to team n in the clockwise direction.This means that the Participant are numbered 1,2...,n-1,n and participants 1 and n are sitting next to each other. After the Hackathon duration, judges started reviewing the performance of each participant. However, some of participants haven't finished the project. Each participant needs t, extra minutes to complete their Project. Judges started reviewing the projects sequentially in the clockwise direction, starting with team x, and it takes them exactly 1 minute to review each project. This means the team x gets no extra time to work, whereas team x+1 gets 1 min more to work and so on. Even if the project is not completed by participant, but still the judges spend 1 min to understand the idea and rank the participant. 
 
Input Format: 
The first line contains a single positive integer, n, denoting the number of participants in the hackathon. 
given the values of t1, t2, t3...tn extra time requires by each participant to complete the project. You have to guide judges in selecting the best team x to start reviewing the project so that number of participants able to complete their projects are maximal. 

Output Format: 
Print x on a new line. If ere are multiple such teams, select the smallest one. 



# The Karel Robot 

#### There is a map and the job of Karal ropot is to divide the map into 4 equal champers (maps that can't be divided into 4 equal chambers should be divided into the biggest possible number of equal chambers (3, 2, or 1)). I tried to make Karel achieve his task with the lowest number of moves and use the lowest possible number of beepers to achieve the task. 

#### Karel is a black box that came out of the factory with certain capabilities according to it’s reference card. The only exception to that is initializing Karel’s bag with beepers. To know more about Karel you can read [this](https://doc-0g-1g-prod-02-apps-viewer.googleusercontent.com/viewer2/prod-02/pdf/f9c03fqq46pbhqj2qqepjt7s4cmc2ji1/l2lhe7h2frpsi9b0glhbqpjtn24ouqus/1735599750000/3/107586235257017864322/APznzabu-NuoFV6TdECN769bN-3H7roOgT2hJr4pZ4M3h7CN4RSXqrQBRdql8oH7F5FJZtscxO8VjFnU3APLMgimbhR5KPighXUIzqNJqhorFw2Ex6vpSGqUEuymlvJN-OOa9FwOZmZv8tmJPRZIBSQsHsCjc5z27WzPOUctYS7yEQSSanL7oJnhC6nigK6keHNHnZJs_dmUPXVFR4Rp8jalC8EmP5tJPfkf7mJhZ_02kSmxm6kZ2h7JQmsTgl_QFHojACFbS50vXlRwX6YhN-yYytsKT0Nw85tgKBIFrbMLYO_2D2i5gg4YctJNulX-xxHB47FPZcDkLRFIFWvUWOH7QgJMe4RsD9m95DvcAyc1s0dZwQQxhuXqi6HGs0ov82g2uc8XRbGI59G4RaT61zfbKeEbM6_YqjrhXheV_3FhEuUpNqJhB88-10pEcLJJkjOkZ2x-n8ANPYH2RJ5t7DUFm7gLCqvgpKZ_CpUHu4DvGBSu8YIoOyQiWlLl4R1aFxHFpuwbtEsONNAKbjnTgFHhARZjxvE2iyPMg1uZ5am-XRxOBSw2H7QhOwnuwk6OZBIL6PE-oeeMzg13pja2kI5FcYzZhxYqDqIK5wBNKfiuEoqNbvtuEEfdmZqzEzJ2cvT7OpYJttv6JOQM4h9clIUi6x0P0waSvQBPO0ZS9h2KA_vrByCQyf84dj-zoFuAKFpVBW96hIt8jMjcNdATlRFxnpgRNf2WeGEWRqIWn6jAHCHkc_7FTU8WVbT5ZQaKdb3THERU6x1Vw659Qz3sHt93RaIsF5Wq7JRKW3TmnrPLIP1CTmlS-nZ5qRkWeiqVQ09mXw8g_aHVywLzRghihI9nmIcQ5GoCYU3cd5b1RepDgVD_1oIEExINYxxbHfe8GVI_prFq-Eo6zN_YlBJPKDNZKoahodTXm4mpn7R_t1Sf_I1oVYrOO69grBA9UY0sHxLpH25mzJIkJmRkit8tC6xhwZkaKQBnpxU4rCALuxaUaws-uA5DIoldNnm3HorQU8s1DMspjK9kYS0uBx3OyEQ3LiD6nYpLIRkauMEGAotHicafTaZrTWWoOzSFxD5uFVRoRTMXjR0cSJaxF4Wz6NNMVFydM-x1QTcYxtfvGTAscqITx57LELDL85r5RJics3wXKGdiGABAZePHlNWQSXtHYOBr4wjhoBUFbMAXxm2O2bY5d9zQo70R_FvHDccV9sM9vtYCNA3uNPPrAQDGE8R-V_PDH-q8eyJa_Q-lIO-AH0F2WRfSsUfSN_1qEBCcyboQEQf0bH9DEMwM74MAR4pujr8U-q9jkGu56Ht6Klux47qnUyq3jZMmWTeAJBb2DMgpA-v4FZDR8HnDfduSyKEn5WsFKi8mhuuwj9OPtpTN4xlHTtQ2Y2aeKR38zST22NQu_rGQqsMwbYXojalpsKReCMZN1HUk3LvGHjROoZTXQi8fZ5TkbiXWruzj7SIDSM0Jsjt3ssKA9u5o663Y0oc_da-l1QDOepEMZkr5kV9P5eFj11bN6plfuoqrOap3wbLWyTAqOjYQwXNdIhc82T3mwuNysnc8vhZ19mNw3wKem1huAhtvhm40kPrD0N9H709lJARpPPD-U62m_pL1CQ6Cv5tvv_CTVZvXwlJb2Ru-8XGUZxSTAc6J0VRLORaSwQTw6k-sFYC_ruLAxXQho69adzr3rJCgv1WE7HdPfL-H7DrHWNO3QQmGbX98aiO4w9CG-wBRivXn0GY3OP6P2vomtItXn9ILdn4J_wtwgEcwjVwgJgzZtpUpK-G_lRnZYH7Ojh_XqnAHQOt1TiRQ5lWl-SHPYC0vBUHaxLP-tpZ32FoDgMA7CSSU5VnRxhbst8xjQEIDebcw7c0mOd3NavL995I0i6BspuC7jBe5UaIFn1T9CCURRk-yvhnen_heqVH2kZvlEtNcagkva4y1QwkKgcnPfXc3G4hoRQSSyVAltXdU9_PXWvc=?authuser=0&nonce=rvnr782t30u16&user=107586235257017864322&hash=dnlncmuvej7tji89erjhoh9bdjtrtfac).

### Process of thinking
To begin with, let me consider that the map comprises a board consisting of N rows and M columns.

Therefore, the first step is to calculate N and M, to accomplish this, we move the robot from the starting point to the far right and then to the uppermost point.

Now that we've calculated the number of rows and columns, we are looking for a way to divide the board into four or fewer sections.
But there is no single ideal way to solve this problem, so we will divide it into several parts.

If the number of rows or columns is equal to one: In this case, we have either a single row or a single column. Thus, it makes no difference whether N is equal to one or M. Let us assume that N is always equal to one:
- If M is less than 3 here, we cannot divide the board and it remains one piece.
- If M is greater than 2 and less than 6, in this case, we divide the board into two parts. If M is only an odd number, we put one beeper in the middle, and if M is an even number, we put two beepers in the middle.
- If M is 6, we can divide the board into 3 equal pieces, by traversing the board and placing the beeper incrementally at each two-step.
- If M is greater than 6 I can divide the board into four sections.
This general solution is if the board is horizontal or vertical or if m is divisible by 4 or not, it only affects where the beepers begin to be placed.
If the number of rows or columns is equal to two: also here it does not matter if N is equal to 2 or M is equal to 2 and I will also assume that N is always equal to 2.
- If M is equal to 2: We can divide it into two parts only by placing a space in the upper right and lower left parts.
- If M is less than 7: I employed the Zigzag method. Specifically, if M is equal to 3, the board can be divided into 3 sections. In all other cases, the board can be divided into 4 sections.
- If N is greater than 6: I can always divide the board into four sections, first, I count the number of steps between the two locations where the beepers are placed.
Approximately four distinct cases can be differentiated based on the remainder when divided by 4.
If the number of rows and columns is greater than two: Here the situation becomes more straightforward, as a single method can be identified and applied to numerous cases.
- If M is equal to N: if N is odd can I find the best solution to divide it into four sections by placing a column in the middle and a row in the middle, there is another way by dividing the map diagonally But it costs more moves and the same number of pieces in both cases.
- If N is even, I divide the map into four sections diagonally. This results in a greater number of moves but yields the largest possible size from each section. Alternatively, I can place two columns of beepers in the middle and two rows of beepers in the middle. This approach reduces the number of moves but does not maximize the size of each section. Therefore, the first method provides the fewest beepers and the largest portions of each piece.
- If N is not equal to M: If N and M are odd numbers the best way I found here to divide the map into four sections is to place a row of beepers in the middle and a column of beepers. 
- If N and M are even numbers, I acknowledge that my solution is not optimal in this scenario. Finding a better solution would have complicated the code, and the impact is minimal. Therefore, I placed two rows of blanks in the middle and two columns of blanks in the middle.

Now it remains the case that if I have an odd number and an even number:

![image](https://github.com/user-attachments/assets/bb64b07b-d191-495b-bf91-d3f9798eecdf)

This method uses placing a column or row of beepers and then dividing the column or row into two parts.

In all cases, I endeavored to balance the number of beepers and movements with the largest size of each part of the map. 




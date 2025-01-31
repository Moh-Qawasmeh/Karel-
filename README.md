
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
- If M is greater than 6 I used this approach can divide the board into four sections: 


### Process of thinking
To begin with, let me consider that the map comprises a board consisting of N rows and M columns.

Therefore, the first step is to calculate N and M, to accomplish this, we move the robot from the starting point to the far right and then to the uppermost point.

Now that we've calculated the number of rows and columns, we are looking for a way to divide the board into four or fewer sections.
But there is no single ideal way to solve this problem, so we will divide it into several parts.

If the number of rows or columns is equal to one: In this case, we have either a single row or a single column. Thus, it makes no difference whether N is equal to one or M. Let us assume that N is always equal to one:
- If M is less than 3 here, we cannot divide the board and it remains one piece.
- If M is greater than 2 and less than 6, in this case, we divide the board into two parts. If M is only an odd number, we put one beeper in the middle, and if M is an even number, we put two beepers in the middle.
- If M is 6, we can divide the board into 3 equal pieces, by traversing the board and placing the beeper incrementally at each two-step.
- If M is greater than 6 I used this approach can divide the board into four sections: 
<img width="227" alt="Capture" src="https://github.com/user-attachments/assets/963852d9-e4b6-4cc2-801b-5ac883c86110" />

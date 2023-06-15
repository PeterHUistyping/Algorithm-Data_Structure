When doing optimization problem,
*writes down "1+1+1+1+1+1+1+1 =" on a sheet of paper*
"What's that equal to?"
*counting* "Eight!"                     -- subproblem
*writes down another "1+" on the left*
"What about that?"
*quickly* "Nine!"                       -- the structure of optimal solutions is composed of optimal solutions to smaller ques
"How'd you know it was nine so fast?"
"You just added one more"
"So you didn't need to recount because you remembered there were eight! Dynamic Programming is just a fancy way to say 'remembering stuff to save time later'"              -- Top-Down Memoization
                                        -- Down-Top Tabulation

I don't believe this should be considered DP, because even when you use naive recursion, the function is only evaluated once for each distinct argument. So, no caching or tabulation of previously-solved subproblems is necessary. Dynamic programming, properly speaking, is when there are overlapping subproblems, and we need to cache previously-solved subproblems in order to avoid evaluating them over and over again.

 
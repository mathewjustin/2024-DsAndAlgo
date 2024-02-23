Jump Game
Jump Game Peak and Valley approach.


Jump game is a medium level leetcode problem which is very interesting yet brainy. Once you understand the problem correctly then the answer is obvious. The probelm goes like this according to leetcode.

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.



For example consider this array

[1,3,2,2,0,1]

When I am at position 1 then i can jump to position 2, Once i am at postition 2 I can jump to 3,4 or 5. The max i can jump from Second position is to position 5 and the element at position 5 is 0 this essentialy means i cannot jump further.

The way to solve this problem using peak and valley here I am representing this array as peaks and valleys.


![img.png](img.png)


If you look at the above image you can see peak and valleys. Once you are on the valley that is 0 You don't really have a way out of it. But you can actually make a jump from position 3 to position 5 by skipping the valley. This is the basic intuition behind the solution.

The basic steps are the following :

You create a variable called reachable which holds the maximum position you can reach.  So how do you calculate the value of reachable it is :

Max(reachable, currentPosition+input[currentPosition]).

So the max reachable index will be the maximum of reachable or currentPosition+input[currentPosition].

So our job is just to calculate this every position and if at any given point we realize that the currentPosition is greater than the reachable then we reuturn false, essentially means we are at the valley and no way to escape.

private boolean canJumpFromPosition(int i, int[] nums) {
int reachable=0;
int n=nums.length;
for(int j=0;j<n;j++){
if(j>reachable){
return false;
}else{
reachable=Math.max(reachable,j+nums[j]);
}

    }
    return true;
}


In this we iterate over the arrray and each posistion we check are we at a reachable position or not. If we are not at a reachable position then we are at valley and if we are at a reachable position then we just recalculate the reachable index by adding currentIndex and the value in the current index. 


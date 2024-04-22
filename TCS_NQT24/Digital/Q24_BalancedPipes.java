package TCS_NQT24.Digital;

import java.util.*;

public class Q24_BalancedPipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int inp[] = new int[N];
        int out[] = new int[M];
        int input = 0, output = 0, ans;
        for (int i = 0; i < N; i++) {
            inp[i] = sc.nextInt();
            input += inp[i] - R;
        }
        for (int i = 0; i < M; i++) {
            out[i] = sc.nextInt();
            output += out[i] - R;
        }
        if (input == output) {
            System.out.println("BALANCED");
            return;
        }
        if (input > output) {
            ans = 2 + input - output;
        } else {
            ans = -2 - (Math.abs(input - output));
        }


        System.out.println(ans);

    }
}

/*
. A plumber wants to check whether a pipe junction where N incoming pipes and M
outgoing pipes are balanced, and, if not,
needs to balance the junction by adding an input pipe or an output pipe of a suitable
capacity. At the junction, there are a
set of input pipes and a set of output pipes. Each pipe has a rated capacity and an
actual capacity. The actual capacity for
each pipe is lower than the rated capacity by a constant R, the "rust factor", which
depends on the material of the pipe, and
is the same for all the pipes at the junction.
For example, if the rated capacity is 65, and R is 2, the actual capacity is 63.
A junction is balanced if the sum of the actual capacities of the input pipes is the same
as the sum of the actual capacities
of the output pipes. If it is not balanced, the plumber needs to add one input pipe or
one output pipe to balance the junction,
and determine the rated capacity of that added pipe.
Here we have N incoming pipes and M outgoing pipes. The incoming pipes may be of
different rated capacities. Similarly, the
outgoing pipes may also be of different rated capacities.
Find the rated capacity of the pipe required to make the junction balanced. If the
combined actual capacity of the incoming
pipes is more than the combined actual capacity of the outgoing pipes then the
plumber will need to add an outgoing pipe.
Conversely, if the combined actual capacity of the incoming pipes is less than the
combined actual capacity of the outgoing
pipes then the plumber will need to add an incoming pipe.
If an outgoing pipe is added then denote its rated capacity as a negative number. If an
incoming pipe is added then denote its
rated capacity as a positive number.
Input
The input has three lines
The first line contains three space separated integers N M R denoting the number of
incoming pipes, outgoing pipes and rust
factor respectively.
The second line contains N space separated integers denoting the rated capacity of
each incoming pipe.
The third line contains M space separated integers denoting the rated capacity of each
outgoing pipe.
Output
Print the rated capacity of the pipe required to balance the junction OR print
"BALANCED" if the junction is already balanced.
Example 1 : ------------------------------------- Input
~~~~~
332
85 75 95
70 80 45
Output ~~~~ -62
Explanation
~~~~~
There are 3 input pipes, 3 output pipes, and the rust factor is 2. The rated capacities of
the input pip are
85,75 and 95 respectively.
The-rated capacities of the output pipes are 70,80 and 45 respectively.
Here, it will be required to add an outgoing pipe with rated capacity 62. Hence the
output is -62.
Example 2 : ------------------------------------ Input
~~~~~~
561
10 26 33 40 50
20 7 53 25 45 10
Output ~~~~~~ BALANCED
 */
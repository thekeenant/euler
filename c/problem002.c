#include "euler_solution.c"

int main() {
    execute(run);
}

long long fib(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    return fib(n - 1) + fib(n - 2);
}

long long calc() {
    long long sum = 0;
    int i = 0;
    while (1) {
        long curr = fib(i);
        if (curr >= 4000000) {
            break;
        }
        if (curr % 2 == 0) {
            sum += curr;
        }
        i++;
    }
    return sum;
}

long long fastCalc() {
    int x = 0;
    int y = 1;
    long long sum = 0;
    while (1) {
        int curr = x + y;
        x = y;
        y = curr;

        if (curr >= 4000000) {
            break;
        }

        if (curr % 2 == 0) {
            sum += curr;
        }
    }
    return sum;
}

long long run() {
    // ~80ms
    // return calc();

    // ~0ms
    return fastCalc();
}

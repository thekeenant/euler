#include "euler_solution.c"
#include <limits.h>

int main() {
    execute(run);
}

long long fib(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    return fib(n - 1) + fib(n - 2);
}

long long run() {
    long long sum = 0;
    for (int i = 1; i < INT_MAX; i++) {
        long curr = fib(i);
        if (curr >= 4000000) {
            break;
        }
        if (curr % 2 == 0) {
            sum += curr;
        }
    }
    return sum;
}

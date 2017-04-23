#include "euler_solution.c"

int main() {
    execute(run);
}

long long run() {
    long long sum = 0;
    for (int i = 1; i < 1000; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    printf("Test\n");
    return sum;
}

#include "euler_solution.h"

double timevalToMs(struct timeval time) {
 return (double) (time.tv_sec * 1000 + time.tv_usec / 1000);
}

void execute(long long (*solution)()) {
    struct timeval start, stop;
    gettimeofday(&start, NULL);
    long long result = solution();
    gettimeofday(&stop, NULL);

    double startMs = timevalToMs(start);
    double stopMs = timevalToMs(stop);

    printf("Result: %llu\n", result);
    printf("Time: %dms\n", (int) (stopMs - startMs));
}

int main() {
    execute(run);
}
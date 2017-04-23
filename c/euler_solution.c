#include "euler_solution.h"

void execute(long long (*solution)()) {
    struct timeval start, stop;
    gettimeofday(&start, NULL);
    long long result = solution();
    gettimeofday(&stop, NULL);

    printf("Result: %llu\n", result);
    printf("Time: %lums\n", (stop.tv_usec - start.tv_usec) / 1000);
}

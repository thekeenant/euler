#include "euler_solution.c"

long long run() {
    int result;
    int length = 0;
    int remainders[1000] = {0};

    for (int i = 1000; i > 1; i--) {
        if (length >= i)
            break;

        // set array to 0
        for (int j = 0; j < i; j++) {
            remainders[j] = 0;
        }

        int value = 1;
        int current = 0;
        while (value > 0 && remainders[value] == 0) {
            remainders[value] = current;
            value *= 10;
            value %= i;
            current++;
        }

        if (current - remainders[value] > length) {
            result = i;
            length = current - remainders[value];
        }
    }

    return result;
}

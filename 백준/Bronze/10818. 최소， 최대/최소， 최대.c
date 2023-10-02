#include <stdio.h>

int main() {
    int a, min, max;
    scanf("%d", &a);

    int b[a];

    min = 1000000;
    max = -1000000;
    for (int i = 0; i < a; i++) {
        scanf("%d", &b[i]);
        if (b[i] > max)
            max = b[i];
        if (b[i] < min)
            min = b[i];
    }
    printf("%d %d", min, max);

    return 0;
}

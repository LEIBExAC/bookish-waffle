#include <iostream>

int main() {
    // Create an array of integers
    int arr[] = {1, 2, 3, 4, 5};

    // Calculate the size of the array
    int size = sizeof(arr) / sizeof(arr[0]);

    // Print each element of the array
    for (int i = 0; i < size; i++) {
        std::cout << arr[i] << " \n";
    }

    return 0;
}
#include <iostream>

int main() {
    // Create an array of integers
    int arr[5];

    // Take input from the user
    for (int i = 0; i < 5; i++) {
        std::cout << "Enter element " << i + 1 << ": ";
        std::cin >> arr[i];
    }

    // Print each element of the array
    for (int i = 0; i < 5; i++) {
        std::cout << arr[i] << " \n";
    }

    return 0;
}
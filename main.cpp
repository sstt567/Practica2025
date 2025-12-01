#include <iostream>
#include <vector>
using namespace std;

// Функция для нахождения минимального значения в массиве
int findMin(vector<int> arr) {
    if (arr.empty()) {
        cout << "Массив пуст!" << endl;
        return 0;
    }
    
    int min = arr[0];
    
    for (int i = 1; i < arr.size(); i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    
    return min;
}

int main() {
    int n;
    
    cout << "Введите количество элементов: ";
    cin >> n;
    
    if (n <= 0) {
        cout << "Ошибка: количество элементов должно быть больше 0!" << endl;
        return 1;
    }
    
    vector<int> numbers(n);
    
    cout << "Введите " << n << " чисел:" << endl;
    for (int i = 0; i < n; i++) {
        cout << "Элемент " << (i + 1) << ": ";
        cin >> numbers[i];
    }
    
    int minValue = findMin(numbers);
    cout << "\nМинимальное значение в массиве: " << minValue << endl;
    
    return 0;
}

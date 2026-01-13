#include <iostream>
#include <vector>
using namespace std;

int findMax(vector<int> arr) {
    if (arr.empty()) {
        cout << "массив пуст!" << endl;
        return 0;
    }
    int max = arr[0];
    
    for (int i = 1; i < arr.size(); i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    
    return max;
}

int main() {
    int n;
    
    cout << "Введите количество эл: ";
    cin >> n;
    
    if (n <= 0) {
        cout << "Ошибка" << endl;
        return 1;
    }
    
    vector<int> numbers(n);
    
    cout << "Введите " << n << " чисел:" << endl;
    for (int i = 0; i < n; i++) {
        cout << "Элемент " << (i + 1) << ": ";
        cin >> numbers[i];
    }
    
    int maxValue = findMax(numbers);
    cout << "\nМаксимальное значение в массиве: " << maxValue << endl;
    
    return 0;
}

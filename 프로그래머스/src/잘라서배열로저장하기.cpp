#include <string>
#include <vector>
#include <iostream>
using namespace std;

vector<string> solution(string my_str, int n) {
    vector<string> answer;
    for(int i=0; i<my_str.size(); i++) {
        if(i+n > my_str.size()) {
            answer.push_back(my_str.substr(i, my_str.size()-i));
            break;
        }
        answer.push_back(my_str.substr(i, n));
        i = i+n-1;
    }
    return answer;
}
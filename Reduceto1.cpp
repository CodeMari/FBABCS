#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

/*
 * Complete the 'minStepsToOne' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER N as parameter.
 */

int minStepsToOne(int N) {

    if(N==1)
        return 0; 
    else if(N%2==0)
        return 1+minStepsToOne(N/2);
    else
        return 1+min(minStepsToOne(N-1), minStepsToOne(N+1));
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string N_temp;
    getline(cin, N_temp);

    int N = stoi(ltrim(rtrim(N_temp)));

    int result = minStepsToOne(N);

    fout << result << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}


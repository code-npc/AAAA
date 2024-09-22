#include<iostream>
using namespace std;

/**
多行注释
*/
// 宏常量
#define DAY 7

// 单行注释
int main()
{
	const int a = 10;  // 常量
	//cout << "hello" << endl;

	//c 风格的字符串
	char ch[] = "hello";
	cout << ch << endl;
	// c++ 风格的字符串
	string str = "hello";
	cout << str << endl;

	system("pause");

	return 0;
}
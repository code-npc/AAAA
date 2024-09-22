#include <iostream>
#include <Windows.h>
#include <chrono>
#include <thread>
#include <vector>


struct Pos {
	int x = 0;
	int y = 0;
};



void SetMousePos(Pos pos) {
	SetCursorPos(pos.x, pos.y);
}
void MouseLiftClick() {
	mouse_event(MOUSEEVENTF_LEFTDOWN | MOUSEEVENTF_LEFTUP, 0, 0, 0, 0);
}


bool on = true;

void CheckRightClick() {
	while (true) {
		if (GetAsyncKeyState(VK_RBUTTON) & 0x8000) {
			on = !on;
		}
	}
	return;
}

int main() {

	HWND handle = FindWindow(
		NULL,
		"植物大战僵尸杂交版v2.3.5 "
	);
	if (handle == NULL) {
		std::cout << "打开失败" << std::endl;
		return 0;
	}
	RECT rect;
	GetWindowRect(handle, &rect);
	Pos begin_pos{ rect.left + 70, rect.top + 150 };
	SetMousePos(begin_pos);

	std::cout << "窗口位置:" << rect.left << "," << rect.top;
	std::vector<std::vector<Pos>> poss(5,std::vector<Pos>(9));
	auto pos = begin_pos;
	int offset_x = 82;
	for (int i = 0; i < poss.size(); ++i) {
		for (int j = 0; j < poss[0].size(); ++j) {
			poss[i][j] = pos;
			poss[i][j].x += offset_x * j;
		}
		pos.y += 100;
	}


	Pos return_game_pos{ begin_pos.x + 400,begin_pos.y + 320 };
	SetMousePos(return_game_pos);

	std::thread check_thread(CheckRightClick);


	while (1) {
		if (on) {
			for (const auto& arr : poss) {
				for (const auto& val : arr) {
					SetMousePos(val);
					MouseLiftClick();
					MouseLiftClick();
					MouseLiftClick();
					MouseLiftClick();
					MouseLiftClick();
					MouseLiftClick();
					std::this_thread::sleep_for(std::chrono::milliseconds(10));
				}
			}

		}
		else {
			
			std::this_thread::sleep_for(std::chrono::milliseconds(100));
		}
	}




	return 0;
}
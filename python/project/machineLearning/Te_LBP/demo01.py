import cv2
import numpy as np

def lbp_calculation(image):
    # 获取图像的尺寸
    height, width = image.shape
    # 创建 LBP 特征图
    lbp_image = np.zeros((height, width), dtype=np.uint8)

    # 定义 LBP 的阈值
    for y in range(1, height - 1):
        for x in range(1, width - 1):
            # 计算周围的像素值
            center = image[y, x]
            binary_values = [
                1 if image[y - 1, x - 1] > center else 0,
                1 if image[y - 1, x] > center else 0,
                1 if image[y - 1, x + 1] > center else 0,
                1 if image[y, x + 1] > center else 0,
                1 if image[y + 1, x + 1] > center else 0,
                1 if image[y + 1, x] > center else 0,
                1 if image[y + 1, x - 1] > center else 0,
                1 if image[y, x - 1] > center else 0,
            ]
            # 计算 LBP 值
            lbp_value = sum(val * (2 ** idx) for idx, val in enumerate(binary_values))
            lbp_image[y, x] = lbp_value

    return lbp_image

def main():
    # 读取图像并转换为灰度图
    image = cv2.imread('D:/Develop/0.bmp')  # 替换为你的图像路径
    gray_image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

    # 计算 LBP 特征图
    lbp_image = lbp_calculation(gray_image)

    # 显示原图和 LBP 特征图
    cv2.imshow('Original Image', gray_image)
    cv2.imshow('LBP Image', lbp_image)
    cv2.waitKey(0)
    cv2.destroyAllWindows()

if __name__ == '__main__':
    main()
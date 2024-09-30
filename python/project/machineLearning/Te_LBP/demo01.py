import cv2
import numpy as np

from PIL import Image
import os

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
    path_to_directory = 'D:/getFeature/orl400/'
    os.chdir(path_to_directory)
    print("更改后的工作目录：", os.getcwd())
    # 列出当前目录下的所有文件和文件夹
    entries = os.listdir('.')
    print("当前目录中的文件和文件夹：", entries)
    # image_url = 'D:/Develop/rallgray/' + entries[6]
    # int num = 0
    for file in entries:
        image_url = path_to_directory + file
        image = cv2.imread(image_url)  # 替换为你的图像路径
        gray_image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

        # 计算 LBP 特征图
        lbp_image = lbp_calculation(gray_image)

    # 显示原图和 LBP 特征图
    # cv2.imshow('Original Image', gray_image)
    # cv2.imshow('LBP Image', lbp_image)

        output_folder = 'D:/getFeature/LBP_feature_image'
        if not os.path.exists(output_folder):
            os.makedirs(output_folder)

        output_file = os.path.join(output_folder, f'lbp_{file}')
        cv2.imwrite(output_file, lbp_image)

    cv2.waitKey(0)
    cv2.destroyAllWindows()

if __name__ == '__main__':
    main()
package cc.langhai.service;

import cc.langhai.domain.Image;

import java.util.List;

/**
 * 图片 service接口
 *
 * @author langhai
 * @date 2022-01-03 11:28
 */
public interface ImageService {

    /**
     * 判断用户存储的图片总大小
     *
     */
    void size();

    /**
     * 保存图片
     *
     * @param image
     */
    void saveImage(Image image);

    /**
     * 获取用户所有图片
     *
     * @param userId
     * @return
     */
    List<Image> getAllImageByUser(Long userId);


    /**
     * 返回用户使用空间
     *
     */
    String space();

    /**
     * 判断是否有操作权限
     *
     * @param objectName
     * @return
     */
    boolean power(String objectName);

    /**
     * 删除图片
     *
     * @param objectName
     */
    void delete(String objectName);
}

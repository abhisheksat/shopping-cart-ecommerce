package com.shoppingcart.ecommerce.service.image;

import com.shoppingcart.ecommerce.dto.ImageDto;
import com.shoppingcart.ecommerce.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {

    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}

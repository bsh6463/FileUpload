package hello.upload.domain;


import lombok.Data;

import java.util.List;

@Data
public class Item {
    /**
     * uploadFile
     */
    private Long id;
    private String itemName;
    private UploadFile  attachFile;
    private List<UploadFile> imageFiles;

}

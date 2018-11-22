
package chapter4.demo5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 控制器
 * http://localhost:8080/springboot/toUpload
 *
 * Date 2018/11/22 上午9:52
 * Author muse
 */
@Controller
public class UploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file) { // 使用MultipartFile接受上传的文件
        try {
            /**
             * 使用FileUtils.writeByteArrayToFile快速写文件到磁盘
             */
            FileUtils.writeByteArrayToFile(new File("/Users/lijinlong02/baidu/git_workspace/muse/springboot-demo/src/main"
                    + "/resources/uploadFiles/" + file.getOriginalFilename()), file.getBytes());
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }
}

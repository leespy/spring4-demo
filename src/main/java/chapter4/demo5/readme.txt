目的：文件上传配置

重点：
    1>使用MultipartFile接受上传的文件
    2>使用FileUtils.writeByteArrayToFile快速写文件到磁盘

依赖：
    <!-- 添加文件上传依赖 file upload -->
    <dependency>
        <groupId>commons-fileupload</groupId>
        <artifactId>commons-fileupload</artifactId>
        <version>1.3.1</version>
    </dependency>
    <!-- 非必需，可简化I/O操作 -->
    <dependency>
        <groupId>commons-io</groupId>
        <artifactId>commons-io</artifactId>
        <version>2.5</version>
    </dependency>

运行：执行Main.java
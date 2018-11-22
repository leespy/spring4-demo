package chapter4.demo6;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import chapter4.demo2.DemoObj;

/**
 * 自定义HttpMessageConverter
 * <p>
 * Date 2018/11/22 下午10:25
 * Author muse
 */
public class MyHttpMessageConverter extends AbstractHttpMessageConverter<DemoObj> { // 继承AbstractHttpMessageConverter接口来实现自定义的HttpMessageConverter


    public MyHttpMessageConverter() {
        super(new MediaType("application", "x-wisely", Charset.forName("UTF-8"))); // 新建一个自定义个媒体类型application/x-wisely
    }

    /**
     * 重写writeInternal，处理如何输出数据到response。
     */
    @Override
    protected void writeInternal(DemoObj obj, HttpOutputMessage outputMessage)
            throws IOException, HttpMessageNotWritableException {
        String out = "hello:" + obj.getId() + "-" + obj.getName();
        outputMessage.getBody().write(out.getBytes());
    }

    @Override
    protected boolean supports(Class clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

    /**
     * 重写readInternal，处理请求的数据。
     */
    @Override
    protected DemoObj readInternal(Class clazz, HttpInputMessage inputMessage)
            throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("UTF-8"));
        String[] tempArr = temp.split("-");
        return new DemoObj(new Long(tempArr[0]), tempArr[1]);
    }
}

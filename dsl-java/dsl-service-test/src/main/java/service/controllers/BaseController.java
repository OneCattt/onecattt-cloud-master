package service.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import service.base.GlobalResult;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @ClassName BaseController
 * @Description 控制层基类
 * @Author jiangruliang
 * @Date 2019/5/16 17:04
 * @Version 1.0
 */
public abstract class BaseController {
    private final static Logger LOG = LoggerFactory.getLogger(BaseController.class);

    /**
     * //处理其他异常
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public GlobalResult allExceptionHandler(Exception e) {
        //会记录出错的代码行等具体信息
        LOG.error("具体错误信息:【" + getErrorMessage(e) + "】");
        //只打印15行的错误堆栈
        int count = 0;
        for (StackTraceElement stackTraceElement : e.getStackTrace()) {
            LOG.error(stackTraceElement.toString());
            if (count++ > 13) {
                break;
            }
        }
        return GlobalResult.fail("系统异常,请稍后重试...");
    }


    /**
     * 获取异常信息
     *
     * @param e 异常
     */
    public static String getErrorMessage(Exception e) {
        StringWriter sw = null;
        PrintWriter pw = null;
        try {
            sw = new StringWriter();
            pw = new PrintWriter(sw);
            // 将出错的栈信息输出到printWriter中
            e.printStackTrace(pw);
            pw.flush();
            sw.flush();
        } finally {
            if (sw != null) {
                try {
                    sw.close();
                } catch (IOException e1) {
                    LOG.info(e1.getMessage());
                }
            }
            if (pw != null) {
                pw.close();
            }
        }
        return sw.toString();
    }
}

package com.anji.allways.common.config;

import com.anji.allways.common.entity.BaseResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

/**
 * 全局异常处理器，如果没有特殊业务需求，普通Controller无需捕获异常直接抛出即可
 *
 * @author yibo
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler implements ErrorController {
    private static final String ERROR_PATH = "/error";
    private final ErrorAttributes errorAttributes;

    @Autowired
    public GlobalExceptionHandler(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @GetMapping(ERROR_PATH)
    @ExceptionHandler(Exception.class)
    public BaseResponseModel errorApiHandler(HttpServletRequest request, Exception e) {
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        Map<String, Object> errorAttributes = this.errorAttributes.getErrorAttributes(requestAttributes, false);
        Integer statusCode = getStatus(request);
        e.printStackTrace();
        Object error = errorAttributes.get("error");
        if (error != null && !String.valueOf(error).equals("None")) {
            return BaseResponseModel.ofFailedStatus(statusCode, String.valueOf(error));
        }
        return BaseResponseModel.ofFailedStatus(
                statusCode,
                String.valueOf(errorAttributes.getOrDefault("message", "error")));
    }

    private Integer getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request
                .getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return INTERNAL_SERVER_ERROR.value();
        }
        return statusCode;
    }
}
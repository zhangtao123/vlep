package com.anji.allways.common.config;

import com.anji.allways.common.entity.BaseResponseModel;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理器，如果没有特殊业务需求，普通Controller无需捕获异常直接抛出即可
 *
 * @author yibo
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler implements ErrorController {
    private static final String ERROR_PATH = "/error";

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @GetMapping(ERROR_PATH)
    @ExceptionHandler(Exception.class)
    public BaseResponseModel errorApiHandler(HttpServletRequest request, Exception e) {
        Integer status = getStatus(request);
        e.printStackTrace();
        return BaseResponseModel.ofFailedStatus(status, e.getMessage());
    }

    private Integer getStatus(HttpServletRequest request) {
        Integer status = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (null != status) {
            return status;
        }
        return 500;
    }
}
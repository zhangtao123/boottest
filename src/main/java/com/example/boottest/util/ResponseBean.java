package com.example.boottest.util;

import java.io.Serializable;

import static org.springframework.http.HttpStatus.OK;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/2/19 14:05
 * @Version: 1.0
 */
public class ResponseBean<T> implements Serializable {
    private static final long serialVersionUID = 1119225135561529601L;
    //返回状态编号
    private Integer repCode = OK.value();
    //返回提示信息
    private String repMsg = OK.getReasonPhrase();
    //返回主数据
    private T repData;

    /**
     * 没有返回信息
     */
    public ResponseBean() {
    }

    /**
     * 返回对象包含提示信息，一般用于增删改操作
     */
    public ResponseBean(String repMsg) {
        this.repMsg = repMsg;
    }


    /**
     * 返回对象包含对应的查询结果
     */
    public ResponseBean(T repData) {
        this.repData = repData;
    }

    public ResponseBean(Integer repCode, String repMsg) {
        this(repCode, repMsg, null);
    }

    public ResponseBean(Integer repCode, String repMsg, T repData) {
        this.repCode = repCode;
        this.repMsg = repMsg;
        this.repData = repData;
    }

    public Integer getRepCode() {
        return repCode;
    }

    public void setRepCode(Integer repCode) {
        this.repCode = repCode;
    }

    public String getRepMsg() {
        return repMsg;
    }

    public void setRepMsg(String repMsg) {
        this.repMsg = repMsg;
    }

    public T getRepData() {
        return repData;
    }

    public void setRepData(T repData) {
        this.repData = repData;
    }
}

package com.example.boottest.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/2/16 23:30
 * @Version: 1.0
 */
public class CommonBean implements Serializable {
    private Byte id;

    private String name;

    private String sex;

    private ArrayList idList;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ArrayList getIdList() {
        return idList;
    }

    public void setIdList(ArrayList idList) {
        this.idList = idList;
    }
}

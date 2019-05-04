package cn.bdqn.model;

import java.util.Date;
import java.util.List;

public class Role {
    private Integer id;

    private Date createDate;

    private Integer buId;

    private String name;

    private String nameZH;

    private String status;

    private List<Integer> mrids;

    public List<Integer> getMrids() {
        return mrids;
    }

    public void setMrids(List<Integer> mrids) {
        this.mrids = mrids;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getBuId() {
        return buId;
    }

    public void setBuId(Integer buId) {
        this.buId = buId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZH() {
        return nameZH;
    }

    public void setNameZH(String nameZH) {
        this.nameZH = nameZH;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
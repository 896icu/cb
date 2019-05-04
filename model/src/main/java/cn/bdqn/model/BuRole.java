package cn.bdqn.model;

import java.util.List;

public class BuRole {
    private Integer id;

    private Integer buId;

    private Integer rId;
    private List<Integer> rids;

    public List<Integer> getRids() {
        return rids;
    }

    public void setRids(List<Integer> rids) {
        this.rids = rids;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuId() {
        return buId;
    }

    public void setBuId(Integer buId) {
        this.buId = buId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }
}
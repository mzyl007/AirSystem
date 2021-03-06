package cn.wyx.entity;

import java.io.Serializable;

/**
 * 机型-舱位
 */
public class Mdsp implements Serializable {
    /**
     *机型
     */
    private Long modelId;
    /**
     *舱位
     */
    private String spaceId;
    /**
     *数量
     */
    private int nums;

    public Mdsp() {
    }

    public Mdsp(Long modelId, String spaceId, int nums) {
        this.modelId = modelId;
        this.spaceId = spaceId;
        this.nums = nums;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Mdsp{" +
                "modelId=" + modelId +
                ", spaceId='" + spaceId + '\'' +
                ", nums=" + nums +
                '}';
    }
}

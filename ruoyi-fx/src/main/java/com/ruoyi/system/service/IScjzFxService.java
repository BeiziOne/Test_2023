package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ScjzFx;

/**
 * 风险项点
Service接口
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
public interface IScjzFxService 
{
    /**
     * 查询风险项点

     * 
     * @param ID 风险项点
主键
     * @return 风险项点

     */
    public ScjzFx selectScjzFxByID(String ID);

    /**
     * 查询风险项点
列表
     * 
     * @param scjzFx 风险项点

     * @return 风险项点
集合
     */
    public List<ScjzFx> selectScjzFxList(ScjzFx scjzFx);

    /**
     * 新增风险项点

     * 
     * @param scjzFx 风险项点

     * @return 结果
     */
    public int insertScjzFx(ScjzFx scjzFx);

    /**
     * 修改风险项点

     * 
     * @param scjzFx 风险项点

     * @return 结果
     */
    public int updateScjzFx(ScjzFx scjzFx);

    /**
     * 批量删除风险项点

     * 
     * @param IDs 需要删除的风险项点
主键集合
     * @return 结果
     */
    public int deleteScjzFxByIDs(String[] IDs);

    /**
     * 删除风险项点信息
     * 
     * @param ID 风险项点主键
     * @return 结果
     */
    public int deleteScjzFxByID(String ID);
    /**
     *
     *
     *
    * @Description: 审核风险项点
     *
    * @Param:  风险项点主键
     *
    * @return:  返回审核项点本身
     *
    */
    public ScjzFx reviewScjzFx(String ID);
}

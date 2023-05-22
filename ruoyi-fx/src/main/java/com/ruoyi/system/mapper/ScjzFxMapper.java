package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ScjzFx;

/**
 * 风险项点
Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
public interface ScjzFxMapper 
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
     * 删除风险项点

     * 
     * @param ID 风险项点
主键
     * @return 结果
     */
    public int deleteScjzFxByID(String ID);

    /**
     * 批量删除风险项点

     * 
     * @param IDs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScjzFxByIDs(String[] IDs);
}

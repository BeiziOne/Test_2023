package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ScjzFxMapper;
import com.ruoyi.system.domain.ScjzFx;
import com.ruoyi.system.service.IScjzFxService;

/**
 * 风险项点
Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@Service
public class ScjzFxServiceImpl implements IScjzFxService 
{
    @Autowired
    private ScjzFxMapper scjzFxMapper;

    /**
     * 查询风险项点

     * 
     * @param ID 风险项点
主键
     * @return 风险项点

     */
    @Override
    public ScjzFx selectScjzFxByID(String ID)
    {

        return scjzFxMapper.selectScjzFxByID(ID);
    }

    /**
     * 查询风险项点
列表
     * 
     * @param scjzFx 风险项点

     * @return 风险项点

     */
    @Override
    public List<ScjzFx> selectScjzFxList(ScjzFx scjzFx)
    {

        return scjzFxMapper.selectScjzFxList(scjzFx);
    }

    /**
     * 新增风险项点

     * 
     * @param scjzFx 风险项点

     * @return 结果
     */
    @Override
    public int insertScjzFx(ScjzFx scjzFx)
    {
        return scjzFxMapper.insertScjzFx(scjzFx);
    }

    /**
     * 修改风险项点

     * 
     * @param scjzFx 风险项点

     * @return 结果
     */
    @Override
    public int updateScjzFx(ScjzFx scjzFx)
    {
        return scjzFxMapper.updateScjzFx(scjzFx);
    }

    /**
     * 批量删除风险项点

     * 
     * @param IDs 需要删除的风险项点
主键
     * @return 结果
     */
    @Override
    public int deleteScjzFxByIDs(String[] IDs)
    {
        return scjzFxMapper.deleteScjzFxByIDs(IDs);
    }

    /**
     * 删除风险项点
信息
     * 
     * @param ID 风险项点
主键
     * @return 结果
     */
    @Override
    public int deleteScjzFxByID(String ID)
    {
        return scjzFxMapper.deleteScjzFxByID(ID);
    }

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
    @Override
    public ScjzFx reviewScjzFx(String ID) {



        return selectScjzFxByID(ID);
    }


}



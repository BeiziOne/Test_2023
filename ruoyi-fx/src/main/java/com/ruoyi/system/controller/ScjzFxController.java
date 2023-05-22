package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ScjzFx;
import com.ruoyi.system.service.IScjzFxService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 风险项点
Controller
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/system/FX")
public class ScjzFxController extends BaseController
{
    @Autowired
    private IScjzFxService scjzFxService;

    /**
     * 查询风险项点
列表
     */
    @PreAuthorize("@ss.hasPermi('system:FX:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScjzFx scjzFx)
    {
        startPage();
        List<ScjzFx> list = scjzFxService.selectScjzFxList(scjzFx);
        return getDataTable(list);
    }

    /**
     * 导出风险项点
列表
     */
    @PreAuthorize("@ss.hasPermi('system:FX:export')")
    @Log(title = "风险项点 ", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScjzFx scjzFx)
    {
        List<ScjzFx> list = scjzFxService.selectScjzFxList(scjzFx);
        ExcelUtil<ScjzFx> util = new ExcelUtil<ScjzFx>(ScjzFx.class);
        util.exportExcel(response, list, "风险项点 数据");
    }

    /**
     * 获取风险项点
详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:FX:query')")
    @GetMapping(value = "/{ID}")
    public AjaxResult getInfo(@PathVariable("ID") String ID)
    {
        return success(scjzFxService.selectScjzFxByID(ID));
    }

    /**
     * 新增风险项点

     */
    @PreAuthorize("@ss.hasPermi('system:FX:add')")
    @Log(title = "风险项点 ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScjzFx scjzFx)
    {
        return toAjax(scjzFxService.insertScjzFx(scjzFx));
    }

    /**
     * 修改风险项点

     */
    @PreAuthorize("@ss.hasPermi('system:FX:edit')")
    @Log(title = "风险项点 ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScjzFx scjzFx)
    {
        return toAjax(scjzFxService.updateScjzFx(scjzFx));
    }

    /**
     * 删除风险项点

     */
    @PreAuthorize("@ss.hasPermi('system:FX:remove')")
    @Log(title = "风险项点 ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{IDs}")
    public AjaxResult remove(@PathVariable String[] IDs)
    {
        return toAjax(scjzFxService.deleteScjzFxByIDs(IDs));
    }
}

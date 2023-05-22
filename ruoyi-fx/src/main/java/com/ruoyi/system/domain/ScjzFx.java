package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 风险项点
对象 SCJZ_FX
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
public class ScjzFx extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String ID;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String FXBM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XT;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String LBBM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String LBMC;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String XM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String XD;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String DJ;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ZT;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String CZRDWBM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String CZRDWMC;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String CZRBM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String CZRXM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date CZSJ;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String SHRDWBM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String SHRDWMC;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String SHRBM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String SHRXM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date SHSJ;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String XTMC;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String DJMC;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String WHCDMC;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String JB;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String SFYH;

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public String getID() 
    {
        return ID;
    }
    public void setFXBM(String FXBM) 
    {
        this.FXBM = FXBM;
    }

    public String getFXBM() 
    {
        return FXBM;
    }
    public void setXT(Long XT) 
    {
        this.XT = XT;
    }

    public Long getXT() 
    {
        return XT;
    }
    public void setLBBM(String LBBM) 
    {
        this.LBBM = LBBM;
    }

    public String getLBBM() 
    {
        return LBBM;
    }
    public void setLBMC(String LBMC) 
    {
        this.LBMC = LBMC;
    }

    public String getLBMC() 
    {
        return LBMC;
    }
    public void setXM(String XM) 
    {
        this.XM = XM;
    }

    public String getXM() 
    {
        return XM;
    }
    public void setXD(String XD) 
    {
        this.XD = XD;
    }

    public String getXD() 
    {
        return XD;
    }
    public void setDJ(String DJ) 
    {
        this.DJ = DJ;
    }

    public String getDJ() 
    {
        return DJ;
    }
    public void setZT(String ZT) 
    {
        this.ZT = ZT;
    }

    public String getZT() 
    {
        return ZT;
    }
    public void setCZRDWBM(String CZRDWBM) 
    {
        this.CZRDWBM = CZRDWBM;
    }

    public String getCZRDWBM() 
    {
        return CZRDWBM;
    }
    public void setCZRDWMC(String CZRDWMC) 
    {
        this.CZRDWMC = CZRDWMC;
    }

    public String getCZRDWMC() 
    {
        return CZRDWMC;
    }
    public void setCZRBM(String CZRBM) 
    {
        this.CZRBM = CZRBM;
    }

    public String getCZRBM() 
    {
        return CZRBM;
    }
    public void setCZRXM(String CZRXM) 
    {
        this.CZRXM = CZRXM;
    }

    public String getCZRXM() 
    {
        return CZRXM;
    }
    public void setCZSJ(Date CZSJ) 
    {
        this.CZSJ = CZSJ;
    }

    public Date getCZSJ() 
    {
        return CZSJ;
    }
    public void setSHRDWBM(String SHRDWBM) 
    {
        this.SHRDWBM = SHRDWBM;
    }

    public String getSHRDWBM() 
    {
        return SHRDWBM;
    }
    public void setSHRDWMC(String SHRDWMC) 
    {
        this.SHRDWMC = SHRDWMC;
    }

    public String getSHRDWMC() 
    {
        return SHRDWMC;
    }
    public void setSHRBM(String SHRBM) 
    {
        this.SHRBM = SHRBM;
    }

    public String getSHRBM() 
    {
        return SHRBM;
    }
    public void setSHRXM(String SHRXM) 
    {
        this.SHRXM = SHRXM;
    }

    public String getSHRXM() 
    {
        return SHRXM;
    }
    public void setSHSJ(Date SHSJ) 
    {
        this.SHSJ = SHSJ;
    }

    public Date getSHSJ() 
    {
        return SHSJ;
    }
    public void setXTMC(String XTMC) 
    {
        this.XTMC = XTMC;
    }

    public String getXTMC() 
    {
        return XTMC;
    }
    public void setDJMC(String DJMC) 
    {
        this.DJMC = DJMC;
    }

    public String getDJMC() 
    {
        return DJMC;
    }
    public void setWHCDMC(String WHCDMC) 
    {
        this.WHCDMC = WHCDMC;
    }

    public String getWHCDMC() 
    {
        return WHCDMC;
    }
    public void setJB(String JB) 
    {
        this.JB = JB;
    }

    public String getJB() 
    {
        return JB;
    }
    public void setSFYH(String SFYH) 
    {
        this.SFYH = SFYH;
    }

    public String getSFYH() 
    {
        return SFYH;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("FXBM", getFXBM())
            .append("XT", getXT())
            .append("LBBM", getLBBM())
            .append("LBMC", getLBMC())
            .append("XM", getXM())
            .append("XD", getXD())
            .append("DJ", getDJ())
            .append("ZT", getZT())
            .append("CZRDWBM", getCZRDWBM())
            .append("CZRDWMC", getCZRDWMC())
            .append("CZRBM", getCZRBM())
            .append("CZRXM", getCZRXM())
            .append("CZSJ", getCZSJ())
            .append("SHRDWBM", getSHRDWBM())
            .append("SHRDWMC", getSHRDWMC())
            .append("SHRBM", getSHRBM())
            .append("SHRXM", getSHRXM())
            .append("SHSJ", getSHSJ())
            .append("XTMC", getXTMC())
            .append("DJMC", getDJMC())
            .append("WHCDMC", getWHCDMC())
            .append("JB", getJB())
            .append("SFYH", getSFYH())
            .toString();
    }
}

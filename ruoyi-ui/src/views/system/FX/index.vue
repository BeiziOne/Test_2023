<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="${comment}" prop="XT">
        <el-input
          v-model="queryParams.XT"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="LBBM">
        <el-input
          v-model="queryParams.LBBM"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="LBMC">
        <el-input
          v-model="queryParams.LBMC"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="DJ">
        <el-input
          v-model="queryParams.DJ"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="ZT">
        <el-input
          v-model="queryParams.ZT"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="CZRDWBM">
        <el-input
          v-model="queryParams.CZRDWBM"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="CZRDWMC">
        <el-input
          v-model="queryParams.CZRDWMC"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="CZRBM">
        <el-input
          v-model="queryParams.CZRBM"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="CZRXM">
        <el-input
          v-model="queryParams.CZRXM"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="CZSJ">
        <el-date-picker clearable
          v-model="queryParams.CZSJ"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="SHRDWBM">
        <el-input
          v-model="queryParams.SHRDWBM"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="SHRDWMC">
        <el-input
          v-model="queryParams.SHRDWMC"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="SHRBM">
        <el-input
          v-model="queryParams.SHRBM"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="SHRXM">
        <el-input
          v-model="queryParams.SHRXM"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="SHSJ">
        <el-date-picker clearable
          v-model="queryParams.SHSJ"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="XTMC">
        <el-input
          v-model="queryParams.XTMC"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="DJMC">
        <el-input
          v-model="queryParams.DJMC"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="WHCDMC">
        <el-input
          v-model="queryParams.WHCDMC"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="JB">
        <el-input
          v-model="queryParams.JB"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="SFYH">
        <el-input
          v-model="queryParams.SFYH"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:FX:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:FX:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:FX:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:FX:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="FXList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="ID" />
      <el-table-column label="${comment}" align="center" prop="FXBM" />
      <el-table-column label="${comment}" align="center" prop="XT" />
      <el-table-column label="${comment}" align="center" prop="LBBM" />
      <el-table-column label="${comment}" align="center" prop="LBMC" />
      <el-table-column label="${comment}" align="center" prop="XM" />
      <el-table-column label="${comment}" align="center" prop="XD" />
      <el-table-column label="${comment}" align="center" prop="DJ" />
      <el-table-column label="${comment}" align="center" prop="ZT" />
      <el-table-column label="${comment}" align="center" prop="CZRDWBM" />
      <el-table-column label="${comment}" align="center" prop="CZRDWMC" />
      <el-table-column label="${comment}" align="center" prop="CZRBM" />
      <el-table-column label="${comment}" align="center" prop="CZRXM" />
      <el-table-column label="${comment}" align="center" prop="CZSJ" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.CZSJ, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="SHRDWBM" />
      <el-table-column label="${comment}" align="center" prop="SHRDWMC" />
      <el-table-column label="${comment}" align="center" prop="SHRBM" />
      <el-table-column label="${comment}" align="center" prop="SHRXM" />
      <el-table-column label="${comment}" align="center" prop="SHSJ" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.SHSJ, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="XTMC" />
      <el-table-column label="${comment}" align="center" prop="DJMC" />
      <el-table-column label="${comment}" align="center" prop="WHCDMC" />
      <el-table-column label="${comment}" align="center" prop="JB" />
      <el-table-column label="${comment}" align="center" prop="SFYH" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:FX:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:FX:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改风险项点
对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="${comment}" prop="FXBM">
          <el-input v-model="form.FXBM" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="${comment}" prop="XT">
          <el-input v-model="form.XT" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="LBBM">
          <el-input v-model="form.LBBM" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="LBMC">
          <el-input v-model="form.LBMC" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="XM">
          <el-input v-model="form.XM" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="${comment}" prop="XD">
          <el-input v-model="form.XD" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="${comment}" prop="DJ">
          <el-input v-model="form.DJ" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="ZT">
          <el-input v-model="form.ZT" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="CZRDWBM">
          <el-input v-model="form.CZRDWBM" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="CZRDWMC">
          <el-input v-model="form.CZRDWMC" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="CZRBM">
          <el-input v-model="form.CZRBM" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="CZRXM">
          <el-input v-model="form.CZRXM" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="CZSJ">
          <el-date-picker clearable
            v-model="form.CZSJ"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="SHRDWBM">
          <el-input v-model="form.SHRDWBM" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="SHRDWMC">
          <el-input v-model="form.SHRDWMC" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="SHRBM">
          <el-input v-model="form.SHRBM" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="SHRXM">
          <el-input v-model="form.SHRXM" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="SHSJ">
          <el-date-picker clearable
            v-model="form.SHSJ"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="XTMC">
          <el-input v-model="form.XTMC" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="DJMC">
          <el-input v-model="form.DJMC" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="WHCDMC">
          <el-input v-model="form.WHCDMC" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="JB">
          <el-input v-model="form.JB" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="SFYH">
          <el-input v-model="form.SFYH" placeholder="请输入${comment}" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listFX, getFX, delFX, addFX, updateFX } from "@/api/system/FX";

export default {
  name: "FX",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 风险项点
表格数据
      FXList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        FXBM: null,
        XT: null,
        LBBM: null,
        LBMC: null,
        XM: null,
        XD: null,
        DJ: null,
        ZT: null,
        CZRDWBM: null,
        CZRDWMC: null,
        CZRBM: null,
        CZRXM: null,
        CZSJ: null,
        SHRDWBM: null,
        SHRDWMC: null,
        SHRBM: null,
        SHRXM: null,
        SHSJ: null,
        XTMC: null,
        DJMC: null,
        WHCDMC: null,
        JB: null,
        SFYH: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        FXBM: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
        XT: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
        LBBM: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
        XM: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
        XD: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询风险项点
列表 */
    getList() {
      this.loading = true;
      listFX(this.queryParams).then(response => {
        this.FXList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        ID: null,
        FXBM: null,
        XT: null,
        LBBM: null,
        LBMC: null,
        XM: null,
        XD: null,
        DJ: null,
        ZT: null,
        CZRDWBM: null,
        CZRDWMC: null,
        CZRBM: null,
        CZRXM: null,
        CZSJ: null,
        SHRDWBM: null,
        SHRDWMC: null,
        SHRBM: null,
        SHRXM: null,
        SHSJ: null,
        XTMC: null,
        DJMC: null,
        WHCDMC: null,
        JB: null,
        SFYH: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.ID)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加风险项点
";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const ID = row.ID || this.ids
      getFX(ID).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改风险项点
";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.ID != null) {
            updateFX(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addFX(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const IDs = row.ID || this.ids;
      this.$modal.confirm('是否确认删除风险项点
编号为"' + IDs + '"的数据项？').then(function() {
        return delFX(IDs);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/FX/export', {
        ...this.queryParams
      }, `FX_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>

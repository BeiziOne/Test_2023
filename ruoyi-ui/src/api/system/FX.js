import request from '@/utils/request'

// 查询风险项点
列表
export function listFX(query) {
  return request({
    url: '/system/FX/list',
    method: 'get',
    params: query
  })
}

// 查询风险项点
详细
export function getFX(ID) {
  return request({
    url: '/system/FX/' + ID,
    method: 'get'
  })
}

// 新增风险项点

export function addFX(data) {
  return request({
    url: '/system/FX',
    method: 'post',
    data: data
  })
}

// 修改风险项点

export function updateFX(data) {
  return request({
    url: '/system/FX',
    method: 'put',
    data: data
  })
}

// 删除风险项点

export function delFX(ID) {
  return request({
    url: '/system/FX/' + ID,
    method: 'delete'
  })
}

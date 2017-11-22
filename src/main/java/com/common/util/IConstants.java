/* 
 * @(#)ACTIONTYPE.java  2006-8-29
 * 
*/
package com.common.util;

/**
 * 
 * @author flying_fish
 *
 */
public final class IConstants {
    /** 业务表工作流审批状态与码表AA020一致*/
    public static final String TASK_TYPE_SAVE 		= "001" ;
    public static final String TASK_TYPE_BEGIN		= "002" ;
    public static final String TASK_TYPE_PROCESS 	= "003" ;
    public static final String TASK_TYPE_END 		= "004" ;   
    
    /** 角色资源ID*/
    public static final String RES_RES001 = "RES001";//角色资源-测试资源
    public static final String RES_RES002 = "RES002";//角色资源-DEMO测试
    public static final String RES_RES003 = "RES003";//角色资源-组织机构数据资源
    public static final String RES_RES004 = "RES004";//采购管理部门操作资源
    public static final String RES_RES005 = "RES005";//档案类型资源权限
    public static final String RES_RES006 = "RES006";//印章类别资源
    public static final String RES_RES007 = "RES007";//申请业务资源权限(fy01:印章跨部门申请权限)
    public static final String RES_RES008 = "RES008";//人力资源-员工信息管理-驳回按钮资源
    public static final String RES_RES009 = "RES009";//人力资源-补录考勤资源（全部时间）
    public static final String RES_RES010 = "RES010";//二级组织机构管理资源
    public static final String RES_RES011 = "RES011";//协同办公申请接收部门数据资源
    public static final String RES_RES012 = "RES012";//生产部门操作资源
    public static final String RES_RES013 = "RES013"; // 个人办公部门权限
    public static final String RES_RES014 = "RES014"; // 办公室用品设备查看权限
    
    /** 岗位资源ID*/
    public static final String RES_STA001 = "STA001";//岗位资源-主管领导岗位范围资源
    public static final String RES_STA002 = "STA002";//岗位资源-主管领导管辖部门资源
    
    public static final String ROOT_ORG_ID = "20090406063725";//组织机构登记org_id SELECT ORG_ID FROM S_ORG_INFO_VIEW WHERE UP_ORG_ID = '****'
}

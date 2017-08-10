package net.mingsoft.basic.biz;

import com.mingsoft.base.biz.IBaseBiz;
import com.mingsoft.util.*;
import java.util.*;

import org.apache.ibatis.annotations.Param;

import net.mingsoft.basic.entity.BasicPeopleEntity;
 
/**
 * 通用用户与信息一对多表业务
 * @author 伍晶晶
 * @version 
 * 版本号：100<br/>
 * 创建日期：2017-7-27 14:47:29<br/>
 * 历史修订：<br/>
 */
public interface IBasicPeopleBiz extends IBaseBiz {

	/**
	 * 读取用户预览记录
	 * @param appId 应用编号
	 * @param modelId 模块编号
	 * @param peopleId 用户编号
	 * @return
	 */
	List queryByPeople(int appId,int modelId,int peopleId);
	
	/**
	 * 删除用户浏览记录
	 * @param bpBasicIds 信息编号
	 * @param bpPeopleId 用户编号
	 */
	void delete(int[] bpBasicIds,  int bpPeopleId);
}
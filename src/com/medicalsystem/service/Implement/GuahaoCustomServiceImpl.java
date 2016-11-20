package com.medicalsystem.service.Implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medicalsystem.mapper.TGuahaoCustomMapper;
import com.medicalsystem.pojo.TGuahaoCustom;
import com.medicalsystem.service.GuahaoCustomService;


@Service("GuahaoCustomService")
public class GuahaoCustomServiceImpl implements GuahaoCustomService {

	@Autowired
	private TGuahaoCustomMapper guahaoCustomMapper;
	
	
	
	/*根据病人ID模糊查询挂号信息，返回一个 List
	 * @author hxiaope
	 * @param patientId
	 * @return
	 * @date 2016年11月20日上午9:06:57
	 */
	@Override
	public List<TGuahaoCustom> findGuahaoByPid(Long patientId) {
		List<TGuahaoCustom> list = guahaoCustomMapper.findGuahaoCustomList(patientId);
		return list;
	}

}

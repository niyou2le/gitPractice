import java.util.List;
import java.util.Map;


@MyBatisDao
public interface AlarmDao extends CrudDao<AlarmSearchDTO> {

	public List<AlarmInfo> findAlarmInfoByCondition(Map<String, String> condition);
	
	public List<AlarmData> findAlarmDataByCondition(Map<String, String> condition);
	
	public Integer insertAlarmInfo(AlarmInfo alarmInfo);
	
	public Integer insertAlarmData(AlarmData alarmData);
	
	public Integer updateAlarmInfo(AlarmInfo alarmInfo);
	
	public Integer updateAlarmLevel(AlarmInfo alarmInfo);
	
	public Integer insertAlarmDataHis (List<AlarmData> alarmDataList);
}

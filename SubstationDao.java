@MyBatisDao
public interface SubstationDao {
	
	/**
	 * @description 查询所有分站的坐标
	 * @return
	 */
	public List<SubstationCoordinate> findAllSubstation();
	
	/**
	 * @description 批量修改分站坐标
	 * @param substationList
	 */
	public void updateCoordinatBatch(List<SubstationCoordinate> substationList);
}

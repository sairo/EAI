package pwr.tin.tip.sw.pd.eai.dao;

import java.util.List;

import pwr.tin.tip.sw.pd.eai.model.Unit;

public interface IRouterDao {

	public List<Unit> getCentralUnitList();
	public List<Unit> getExecutiveUnitList();
}

package org.slsale.dao.userrefer;

import java.util.List;

import org.slsale.pojo.UserRefer;

/**
 * UserReferMapper
 * @author bdqn_shy
 * @date 2014-5-7
 */
public interface UserReferDAO {
	/**
	 * getUserReferList
	 * @return
	 */
	public List<UserRefer> getUserReferList(UserRefer refer) throws Exception;
	
	
	/**
	 * addUserRefer
	 * @param refer
	 * @return
	 */
	public int addUserRefer(UserRefer refer) throws Exception;
	
	/**
	 * modifyUserRefer
	 * @param refer
	 * @return
	 */
	public int modifyUserRefer(UserRefer refer);
	
	/**
	 * deleteUserRefer
	 * @param refer
	 * @return
	 */
	public int deleteUserRefer(UserRefer refer);
}

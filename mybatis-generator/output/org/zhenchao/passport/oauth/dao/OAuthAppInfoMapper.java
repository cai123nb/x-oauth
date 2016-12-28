package org.zhenchao.passport.oauth.dao;

import org.apache.ibatis.annotations.Param;
import org.zhenchao.passport.oauth.model.OAuthAppInfo;
import org.zhenchao.passport.oauth.model.OAuthAppInfoExample;

import java.util.List;

public interface OAuthAppInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    long countByExample(OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int deleteByExample(OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int deleteByPrimaryKey(Long appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int insert(OAuthAppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int insertSelective(OAuthAppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    List<OAuthAppInfo> selectByExample(OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    OAuthAppInfo selectByPrimaryKey(Long appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int updateByExampleSelective(@Param("record") OAuthAppInfo record, @Param("example") OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int updateByExample(@Param("record") OAuthAppInfo record, @Param("example") OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int updateByPrimaryKeySelective(OAuthAppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int updateByPrimaryKey(OAuthAppInfo record);
}
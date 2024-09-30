package com.web.hospital.mapper.dbo;

import com.web.hospital.model.hoso;
import com.web.hospital.model.hosoExample;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hosoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    long countByExample(hosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    int deleteByExample(hosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    int deleteByPrimaryKey(Integer idhoso);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    int insert(hoso row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    int insertSelective(hoso row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    List<hoso> selectByExample(hosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    hoso selectByPrimaryKey(Integer idhoso);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    int updateByExampleSelective(@Param("row") hoso row, @Param("example") hosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    int updateByExample(@Param("row") hoso row, @Param("example") hosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    int updateByPrimaryKeySelective(hoso row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.HoSo
     *
     * @mbg.generated Thu Jun 13 22:58:16 ICT 2024
     */
    int updateByPrimaryKey(hoso row);

    int insertHoso(@Param("hotenbenhnhan") String hotenbenhnhan,@Param("namsinh") String namsinh , @Param("gioitinh") String gioitinh,
                   @Param("sdt") String sdt , @Param("diachi") String diachi,@Param("day") Date day , @Param("idd") int idd ,
                   @Param("hotenbacsi") String hotenbacsi , @Param("chuandoan") String chuandan , @Param("donthuoc") String donthuoc); ;
    List<hoso> selectHosobyIDdoc(@Param("idd") int idd);
    hoso findHosoByID(@Param("idhoso") int idhoso);
    int deleteHosoByID(@Param("idhoso") int idhoso);
    int updateHosoByID(@Param("hoso") hoso hoso);
}
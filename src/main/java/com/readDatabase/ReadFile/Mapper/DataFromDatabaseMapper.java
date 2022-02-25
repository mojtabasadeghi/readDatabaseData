package com.readDatabase.ReadFile.Mapper;

import com.readDatabase.ReadFile.Model.DataFromDatabase;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DataFromDatabaseMapper {

    @Insert("INSERT INTO datasource (countryName, baseName, latitude,longitude,baseNumber,lilyPadsNumber,usFundedNumber,note,sources) VALUES" +
            "(#{countryName}, #{baseName}, #{latitude},#{longitude},#{baseNumber},#{lilyPadsNumber},#{usFundedNumber},#{note},#{sources})")
    @Options(useGeneratedKeys = true, keyProperty = "dataId")
    int insertData(DataFromDatabase dataFromDatabase);

    @Select("SELECT * FROM datasource")
    List<DataFromDatabase> getAlldata();

    @Select("SELECT * FROM datasource where countryName like #{searchInput} ")
    List<DataFromDatabase> getSearchResultByCountryAndBaseName(String searchInput);

    @Select("SELECT * FROM datasource where countryName=#{countryName}")
    List<DataFromDatabase> getAlldataByCountryName(String countryName);

    @Select("SELECT * FROM datasource where dataId=#{dataId}")
    DataFromDatabase getDataById(int dataId);

    @Delete("delete from datasource where dataId=#{dataId}")
    void deleteById(int dataId);

    @Update("update  datasource set  countryName=#{countryName}, baseName=#{baseName},latitude=#{latitude}, longitude=#{longitude}, baseNumber=#{baseNumber},lilyPadsNumber=#{lilyPadsNumber}, usFundedNumber=#{usFundedNumber}, note=#{note},sources=#{sources} where dataId=#{dataId}")
    int updateDataSource(DataFromDatabase dataFromDatabase);

    @Select("SELECT countryName FROM datasource group by countryName")
    List<String> getAllCountryNames();

}

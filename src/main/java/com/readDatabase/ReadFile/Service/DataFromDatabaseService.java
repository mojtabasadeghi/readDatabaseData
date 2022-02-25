package com.readDatabase.ReadFile.Service;

import com.readDatabase.ReadFile.Mapper.DataFromDatabaseMapper;
import com.readDatabase.ReadFile.Model.DataFromDatabase;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class DataFromDatabaseService {

    DataFromDatabaseMapper dataFromDatabaseMapper;

    public int insertData(DataFromDatabase dataFromDatabase) {
        return dataFromDatabaseMapper.insertData(dataFromDatabase);
    }

    public DataFromDatabaseService(DataFromDatabaseMapper dataFromDatabaseMapper) {
        this.dataFromDatabaseMapper = dataFromDatabaseMapper;
    }

    public List<DataFromDatabase> getAllData() {
        return dataFromDatabaseMapper.getAlldata();
    }

    public List<DataFromDatabase> getSearchResult(String searchInput) {
        if (StringUtils.hasText(searchInput))
            return dataFromDatabaseMapper.getSearchResultByCountryAndBaseName('%' + searchInput + '%');
        else
            return dataFromDatabaseMapper.getAlldata();
    }

    public List<DataFromDatabase> getAlldataByCountryName(String countryName) {
        return dataFromDatabaseMapper.getAlldataByCountryName(countryName);
    }

    public DataFromDatabase getDataById(int dataId) {
        return dataFromDatabaseMapper.getDataById(dataId);
    }

    public void deleteById(int dataId) {
        dataFromDatabaseMapper.deleteById(dataId);
    }

    public int updateDataSource(DataFromDatabase dataFromDatabase) {
        return dataFromDatabaseMapper.updateDataSource(dataFromDatabase);
    }
}

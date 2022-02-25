package com.readDatabase.ReadFile.Model;

public class SearchContext {
    private String searchTxt;

    public SearchContext(String searchTxt) {
        this.searchTxt = searchTxt;
    }

    public SearchContext() {
    }

    public String getSearchTxt() {
        return searchTxt;
    }

    public void setSearchTxt(String searchTxt) {
        this.searchTxt = searchTxt;
    }
}

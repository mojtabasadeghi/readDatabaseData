package com.readDatabase.ReadFile.Service;

public class MessageService {
    final private static String CLASS_ERROR_TYPE = "alert alert-danger";
    final private static String CLASS_SUCCESS_TYPE = "alert alert-success";


    public static String getEditSuccessMessage(String countyName,String baseName) {
        return String.format("Base %s Record Edited Successfully for %s Country.",baseName,countyName);
    }

    public static String getInsertSuccessMessage(String countyName,String baseName) {
        return String.format("Base %s Inserted Successfully for %s Country.",baseName,countyName);
    }

    public static String getDeleteSuccessMessage(String countyName,String baseName) {
        return String.format("Base %s Removed Successfully from %s Country." ,baseName,countyName);
    }
    public static String getErrorMessage() {
        return "Some thing went wrong.";
    }

    public static String getClassErrorType() {
        return CLASS_ERROR_TYPE;
    }

    public static String getClassSuccessType() {
        return CLASS_SUCCESS_TYPE;
    }
}

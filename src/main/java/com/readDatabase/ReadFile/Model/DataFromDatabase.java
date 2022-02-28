package com.readDatabase.ReadFile.Model;

public class DataFromDatabase {
    private int dataId;
    private String countryName;
    private String baseName;
    private String latitude;
    private String longitude;
    private int baseNumber;
    private int lilyPadsNumber;
    private int usFundedNumber;
    private String note;
    private String sources;
    private String dataInsOrUpd;

    public String getDataInsOrUpd() {
        return dataInsOrUpd;
    }

    public void setDataInsOrUpd(String dataInsOrUpd) {
        this.dataInsOrUpd = dataInsOrUpd;
    }

    private DataFromDatabase(DataFromDatabaseBuilder builder) {
        this.dataId = builder.dataId;
        this.countryName = builder.countryName;
        this.baseName = builder.baseName;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.baseNumber = builder.baseNumber;
        this.lilyPadsNumber = builder.lilyPadsNumber;
        this.usFundedNumber = builder.usFundedNumber;
        this.note = builder.note;
        this.sources = builder.sources;
        this.dataInsOrUpd = builder.dataInsOrUpd;
    }

    public DataFromDatabase() {
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getBaseNumber() {
        return baseNumber;
    }

    public void setBaseNumber(int baseNumber) {
        this.baseNumber = baseNumber;
    }

    public int getLilyPadsNumber() {
        return lilyPadsNumber;
    }

    public void setLilyPadsNumber(int lilyPadsNumber) {
        this.lilyPadsNumber = lilyPadsNumber;
    }

    public int getUsFundedNumber() {
        return usFundedNumber;
    }

    public void setUsFundedNumber(int usFundedNumber) {
        this.usFundedNumber = usFundedNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public static class DataFromDatabaseBuilder {
        private int dataId;
        private String countryName;
        private String baseName;
        private String latitude;
        private String longitude;
        private int baseNumber;
        private int lilyPadsNumber;
        private int usFundedNumber;
        private String note;
        private String sources;
        private String dataInsOrUpd;

        public DataFromDatabaseBuilder() {
        }

        public DataFromDatabaseBuilder dataId(int dataId) {
            this.dataId = dataId;
            return this;
        }

        public DataFromDatabaseBuilder countryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public DataFromDatabaseBuilder baseName(String baseName) {
            this.baseName = baseName;
            return this;
        }

        public DataFromDatabaseBuilder latitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        public DataFromDatabaseBuilder longitude(String longitude) {
            this.longitude = longitude;
            return this;
        }

        public DataFromDatabaseBuilder baseNumber(int baseNumber) {
            this.baseNumber = baseNumber;
            return this;
        }

        public DataFromDatabaseBuilder lilyPadsNumber(int lilyPadsNumber) {
            this.lilyPadsNumber = lilyPadsNumber;
            return this;
        }

        public DataFromDatabaseBuilder usFundedNumber(int usFundedNumber) {
            this.usFundedNumber = usFundedNumber;
            return this;
        }

        public DataFromDatabaseBuilder note(String note) {
            this.note = note;
            return this;
        }

        public DataFromDatabaseBuilder sources(String sources) {
            this.sources = sources;
            return this;
        }

        public DataFromDatabaseBuilder dataInsOrUpd(String dataInsOrUpd) {
            this.dataInsOrUpd = dataInsOrUpd;
            return this;
        }

        //Return the finally consrcuted User object
        public DataFromDatabase build() {
            DataFromDatabase dataFromDatabase = new DataFromDatabase(this);
            validateUserObject(dataFromDatabase);
            return dataFromDatabase;
        }

        private void validateUserObject(DataFromDatabase dataFromDatabase) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}

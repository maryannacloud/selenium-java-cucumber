package pages;

import utilities.ConfigReader;
import utilities.DBUtils;

public class DBQueriesPage {

    public void verifyUserRecordIsCreatedInDB(String userRecord){
        DBUtils.executeSQLQuery("select * from users where username = " + ConfigReader.getConfigProperty(userRecord) + ";");
    }
}

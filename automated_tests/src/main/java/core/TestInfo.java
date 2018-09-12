package core;

/**
 * Created by Kashif on 3/9/2018.
 */
public class TestInfo {

    private static String TIMESTAMP,
                          SUITE,
                          ID,
                          NAME,
                          NOTES,
                          ACTUAL,
                          EXPECTED,
                          VERSION;

    public void reset () {
                 TIMESTAMP = null;
                 SUITE = null;
                 ID = null;
                 NAME = null;
                 NOTES = null;
                 ACTUAL = null;
                 EXPECTED = null;
                 VERSION = null;
    }

    public TestInfo setTimeStamp (String value) {
        TIMESTAMP = value;
        return this;
    }

    public TestInfo setSuite (String value) {
        SUITE = value;
        return this;
    }

    public TestInfo setID (String value) {
        ID = value;
        return this;
    }

    public TestInfo setName (String value) {
        NAME = value;
        return this;
    }

    public TestInfo setNotes (String value) {
        NOTES = value;
        return this;
    }

    public TestInfo setActualResult (String value) {
        ACTUAL = value;
        return this;
    }

    public TestInfo setExpectedResult (String value) {
        EXPECTED = value;
        return this;
    }

    public TestInfo setVersion (String value) {
        VERSION = value;
        return this;
    }

    public String getTimeStamp () {
        return TIMESTAMP;
    }

    public String getSUITE () {
        return SUITE;
    }

    public String getID () {
        return ID;
    }

    public String getName () {
        return NAME;
    }

    public String getNotes () {
        return NOTES;
    }

    public String getActualResult () {
        return ACTUAL;
    }
    public String getExpectedResult () {
        return EXPECTED;
    }
    public String getVserion () {
        return VERSION;
    }

}

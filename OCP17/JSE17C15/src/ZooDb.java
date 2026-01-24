public enum ZooDb {

    ZOO_DB("jdbc:mysql://localhost:3306/zoo", "root", "123456789");

    private final String URL;
    private final String USERNAME;
    private final String PASSWORD;
    private ZooDb(String url, String username, String password){
        this.URL = url;
        this.USERNAME = username;
        this.PASSWORD = password;
    }

    public String getURL(){
        return this.URL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getUSERNAME() {
        return USERNAME;
    }
}

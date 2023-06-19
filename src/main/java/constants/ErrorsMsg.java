package constants;

/** Descriptions all errors. Merchant, market, admin **/
public enum ErrorsMsg {
    obligatory_name_field("Укажите имя"),
    error_data_not_match("Epic sadface: Username and password do not match any user in this service123");

    private String value;
    private ErrorsMsg(String value) {
        this.value = value; }

    public String getErrorMsg(){
        return value;
    }
}

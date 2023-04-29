package lab10;

public class MovieResponse {
    private String title;
    private Boolean response;
    private String errMsg;

    public MovieResponse(String title, Boolean response, String errMsg) {
        this.title = title;
        this.response = response;
        this.errMsg = errMsg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getResponse() {
        return response;
    }

    public void setResponse(Boolean response) {
        this.response = response;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return "MovieResponse{" +
                "title='" + title + '\'' +
                ", response=" + response +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }
}

package apiTesting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Activity {
    @JsonProperty
    int id;
    @JsonProperty
    int idBook;
    @JsonProperty
    String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", idBook=" + idBook +
                ", url='" + url + '\'' +
                '}';
    }
}

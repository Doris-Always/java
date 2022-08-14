package diary;
//ToDo entry id of the story
//ToDo entry description or title
//ToDo date created
//ToDo body of story

public class UserEntry {
    private int id;
    private String description;
    private String datecreated;
    private String entryBody;

    public UserEntry(int id,String entryBody){
        this.id = id;
        this.entryBody = entryBody;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(String datecreated) {
        this.datecreated = datecreated;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public void setEntryBody(String entryBody) {
        this.entryBody = entryBody;
    }
}

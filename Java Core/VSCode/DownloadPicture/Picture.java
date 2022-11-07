class Picture {

    private String link;
    private String Name;

    public Picture(String LineText) {
        setLink(LineText);
        setName(LineText);
    }

    public void setLink(String LineText) {
        this.link = LineText.substring(LineText.indexOf("https"));
    }

    public void setName(String LineText) {
        this.Name = LineText.substring(0, LineText.indexOf("https"));
    }

    public String getLink() {
        return link;
    }

    public String getName() {
        return Name;
    }
}

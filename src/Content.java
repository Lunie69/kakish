public abstract class Content {
    private String title;

    public Content(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void display();

    @Override
    public String toString() {
        return "Title: " + title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Content)) return false;
        Content content = (Content) o;
        return title.equals(content.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}


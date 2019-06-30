
public abstract class Information<T> {
    String from;
    String to;
    T context;

    public Information(String from, String to, T context) {
        this.context = context;
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public T getContent() {
        return context;
    }
}


import java.io.Serializable;
import java.util.List;
import java.util.StringJoiner;

public class Box implements Serializable {
    List<String> things;

    public Box(List<String> things) {
        this.things = things;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Box.class.getSimpleName() + "[", "]")
                .add("things=" + things)
                .toString();
    }
}

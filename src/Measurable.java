import java.util.List;

/**
 * interface Measurable
 */
public interface Measurable {
    float getMeasure();

    /**
     *
     * @param items list of Measurable
     * @return the average of measurable
     */
    static float average (List<Measurable> items) {
        float total=0.0f;
        for (Measurable m: items) {
            total=total+m.getMeasure();
        }
        return total/items.size();
    }
}

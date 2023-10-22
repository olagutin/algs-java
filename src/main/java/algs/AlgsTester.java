package algs;

import lombok.RequiredArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class AlgsTester {

    private final Algs algs;
    private Map<Integer, AlgsData> map;

    public void showOptions() {
        if (this.map == null) {
            this.map = new HashMap<>();
            for (Method method : this.algs.getClass().getMethods()) {
                UserChoice userChoice = method.getAnnotation(UserChoice.class);
                if (userChoice != null) {
                    String userRepresentation = userChoice.optionNumber() + " - " + userChoice.userFriendlyOption();
                    this.map.put(userChoice.optionNumber(), new AlgsData(userRepresentation, method));
                }
            }
        }
        this.map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getValue().getUserRepresentation()));
    }

    public void showOptionResult(int choice) {
        AlgsData methodData = this.map.get(choice);
        if (methodData == null) {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("Result");
        try {
            methodData.getMethod().invoke(this.algs);
        } catch (IllegalAccessException | InvocationTargetException ignore) {
            //should not happen
        }
    }
}

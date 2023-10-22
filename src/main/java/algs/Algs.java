package algs;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Algs {
    private final double data;

    @UserChoice(userFriendlyOption = "see result for option a", optionNumber = 1)
    public void methodA() {
        System.out.println(data + 1);
    }

    @UserChoice(userFriendlyOption = "see result for option b", optionNumber = 2)
    public void methodB() {
        System.out.println(data + 2);
    }

    @UserChoice(userFriendlyOption = "see result for option c", optionNumber = 3)
    public void methodC() {
        System.out.println(data);
    }

    public void methodNotForUser() {
        System.out.println("Should not be seen by users");
    }
}

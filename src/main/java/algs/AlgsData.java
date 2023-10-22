package algs;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.lang.reflect.Method;

@RequiredArgsConstructor
@Getter
public class AlgsData {

    private final String userRepresentation;
    private final Method method;
}

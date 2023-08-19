package Java8;

import com.sun.istack.internal.Nullable;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String st = null;
        Optional<String> op = Optional.ofNullable(st);
        if (op.isPresent()) {
            System.out.println(op.get());
        }
        else {
            String defalt=op.orElse("default");
            System.out.println("value is not preset"+defalt);
        }
    }
}

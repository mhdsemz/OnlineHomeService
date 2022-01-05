package validation;

import java.util.List;

public class ServiceValidation {

    public boolean validateNewName(String name, List<String> list) {
        if (list.contains(name))
            throw new RuntimeException("***duplicate name! please enter another name***");
        return true;
    }
}

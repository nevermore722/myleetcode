package leetcode.august;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Date26th690 {
    Map<Integer, Employee> collect;

    int result = 0;

    public int getImportance(List<Employee> employees, int id) {
        collect = employees.stream().collect(Collectors.toMap(employee -> employee.id, employee -> employee));
        dfs(id);
        return result;
    }

    public void dfs(int id) {
        result += collect.get(id).importance;
        List<Integer> subordinates = collect.get(id).subordinates;

        for (int i = 0; i < subordinates.size(); i++) {
            dfs(subordinates.get(i));
        }
    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public int getId() {
        return id;
    }
}
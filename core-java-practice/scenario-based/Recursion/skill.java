import java.util.ArrayList;

public class skill{
    public static void findTeams(int[] skills,
                                 int index,
                                 int target,
                                 ArrayList<Integer> team,
                                 int currentSum) {

       
        if (currentSum == target) {
            System.out.println(team);
            return;
        }

       
        if (index == skills.length || currentSum > target) {
            return;
        }

        // Include current employee
        team.add(skills[index]);
        findTeams(skills,
                  index + 1,
                  target,
                  team,
                  currentSum + skills[index]);

        // Backtrack
        team.remove(team.size() - 1);

        // Exclude current employee
        findTeams(skills,
                  index + 1,
                  target,
                  team,
                  currentSum);
    }
    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, 0, target,new ArrayList<>(), 0);
    }
}
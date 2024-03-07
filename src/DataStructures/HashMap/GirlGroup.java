package DataStructures.HashMap;

import java.util.*;

public class GirlGroup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, List<String>> team = new HashMap<>();
        HashMap<String, String> member = new HashMap<>();

        String[] line = sc.nextLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        for(int i = 0; i < N; i++) {
            String teamName = sc.nextLine();
            int teamSize = Integer.parseInt(sc.nextLine());

            List<String> memberList = new ArrayList<>();
            for(int j = 0; j < teamSize; j++) {
                String memberName = sc.nextLine();
                memberList.add(memberName);
                member.put(memberName, teamName);
            }
            team.put(teamName, memberList);
        }

        for(int i = 0; i < M; i++) {
            String search = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());

            // 팀명
            if(num == 1) {
                System.out.println(member.get(search));
            }
            // 팀 멤버 리스트
            else {
                List<String> memberList = team.get(search);
                memberList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
            }
        }
    }
}

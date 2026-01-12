// You are given an array prerequisites where prerequisites[i] = [a, b] indicates that you must take course b first if you want to take course a.
// The pair [0, 1], indicates that must take course 1 before taking course 0.
// There are a total of numCourses courses you are required to take, labeled from 0 to numCourses - 1.
// Return true if it is possible to finish all courses, otherwise return false.

// Example 1:
// Input: numCourses = 2, prerequisites = [[0,1]]
// Output: true
// Explanation: First take course 1 (no prerequisites) and then take course 0.

// Example 2:
// Input: numCourses = 2, prerequisites = [[0,1],[1,0]]
// Output: false
// Explanation: In order to take course 1 you must take course 0, and to take course 0 you must take course 1. So it is impossible.

// Constraints:
// 1 <= numCourses <= 1000
// 0 <= prerequisites.length <= 1000
// prerequisites[i].length == 2
// 0 <= a[i], b[i] < numCourses
// All prerequisite pairs are unique.

class course_schedule {
    // DEPTH FIRST SEARCH
    private Map<Integer, List<Integer>> preMap = new HashMap<>();
    private Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }
        for (int[] prereq : prerequisites) {
            preMap.get(prereq[0]).add(prereq[1]);
        }
        for (int c = 0; c < numCourses; c++) {
            if (!dfs(c)) return false;
        }
        return true;
    }

    private boolean dfs(int crs) {
        if (visiting.contains(crs)) return false;
        if (preMap.get(crs).isEmpty()) return true;
        visiting.add(crs);
        for (int pre : preMap.get(crs)) {
            if (!dfs(pre)) {
                return false;
            }
        }
        visiting.remove(crs);
        preMap.put(crs, new ArrayList<>());
        return true;
    }
}

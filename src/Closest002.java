public class Closest002 {

    public static float bruteForceSmallestDistance(Point[] points, int start, int end) {
        float smallest = Float.MAX_VALUE;

        // todo: 计算指定范围内的每一对点的距离并返回最小值
        

        return smallest;
    }

    public static void main(String[] args) {
        Point[] points = new Point[]{
                new Point(2, 3),
                new Point(12, 30),
                new Point(40, 50),
                new Point(5, 1),
                new Point(6, 2),
                new Point(3, 5)

        };

        float dist = bruteForceSmallestDistance(points, 0, 5);
        System.out.println(Float.compare(dist, 1.4142135f) == 0);

        dist = bruteForceSmallestDistance(points, 1, 2);
        System.out.println(Float.compare(dist, 34.4093f) == 0);
    }
}

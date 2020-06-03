class Add {
    public void add(int... arr) {
        int len = arr.length;
        int sum = arr[0];
        System.out.print(arr[0]);
        for (int i = 1; i < len; i++) {
            System.out.print("+" + arr[i]);
            sum += arr[i];
        }
        System.out.println("=" + sum);
    }

}

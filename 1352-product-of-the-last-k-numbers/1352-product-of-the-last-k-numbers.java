class ProductOfNumbers {
    ArrayList<Integer> list;
    public ProductOfNumbers() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int product = 1;
        for(int i = list.size() - k; i < list.size(); i++){
            product *= list.get(i);
        }

        return product;
    }
}


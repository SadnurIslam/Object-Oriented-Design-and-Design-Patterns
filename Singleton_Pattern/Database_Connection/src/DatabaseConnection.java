class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        // private constructor
        System.out.println("Database Connection created");
    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
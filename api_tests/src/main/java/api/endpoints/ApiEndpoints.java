package api.endpoints;

public enum ApiEndpoints {
    USERS("/public/v2/users"),
    POSTS("/public/v2/posts"),
    COMMENTS("/public/v2/comments"),
    TODOS("/public/v2/todos");

    private final String path;

    ApiEndpoints(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

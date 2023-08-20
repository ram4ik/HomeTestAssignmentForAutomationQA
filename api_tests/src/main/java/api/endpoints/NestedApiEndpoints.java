package api.endpoints;

public enum NestedApiEndpoints {
    USER_POSTS("/public/v2/users/2638/posts"),
    POST_COMMENTS("/public/v2/posts/2638/comments"),
    USER_TODOS("/public/v2/users/2638/todos");

    private final String path;

    NestedApiEndpoints(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

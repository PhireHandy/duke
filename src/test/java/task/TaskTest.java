package task;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @org.junit.jupiter.api.Test
    void setDone() {
        Task task = new Todo("name");
        task.setDone();
        assertEquals("[T][✓] name", task.toString());
    }
}
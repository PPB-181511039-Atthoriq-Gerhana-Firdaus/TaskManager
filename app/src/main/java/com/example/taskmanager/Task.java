package com.example.taskmanager;

public class Task {
    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getDeskripsiTugas() {
        return deskripsiTugas;
    }

    public void setDeskripsiTugas(String deskripsiTugas) {
        this.deskripsiTugas = deskripsiTugas;
    }

    private String namaMatkul;
    private String deskripsiTugas;

    public Task(String namaMatkul, String deskripsiTugas) {
        this.namaMatkul = namaMatkul;
        this.deskripsiTugas = deskripsiTugas;
    }
}

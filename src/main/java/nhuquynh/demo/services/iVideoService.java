package nhuquynh.demo.services;

import nhuquynh.demo.entity.Video;

import java.util.List;

public interface iVideoService {
    List<Video> findAll();
    Video findById(int id);
    void insert(Video video);
    void update(Video video);
    void delete(int id);
    List<Video> findTitle(String keyword);
    void updateStatus(int id, int status);
}

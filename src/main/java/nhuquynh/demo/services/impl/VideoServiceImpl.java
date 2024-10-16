package nhuquynh.demo.services.impl;

import nhuquynh.demo.dao.iVideoDAO;
import nhuquynh.demo.dao.impl.VideoDAOimpl;
import nhuquynh.demo.entity.Video;
import nhuquynh.demo.services.iVideoService;

import java.util.List;

public class VideoServiceImpl implements iVideoService {

    public iVideoDAO videoDAO = new VideoDAOimpl();

    @Override
    public List<Video> findAll() {
        return videoDAO.findAll();
    }

    @Override
    public Video findById(int id) {
        return videoDAO.findById(id);
    }

    @Override
    public void insert(Video video) {
        videoDAO.insert(video);
    }

    @Override
    public void update(Video video) {
        videoDAO.update(video);
    }

    @Override
    public void delete(int id) {
        videoDAO.delete(id);
    }

    @Override
    public List<Video> findTitle(String keyword) {
        return videoDAO.findTitle(keyword);
    }

    @Override
    public void updateStatus(int id, int status) {
        videoDAO.updateStatus(id, status);
    }

    public static void main(String[] args) {
        VideoServiceImpl videoService = new VideoServiceImpl();
        List<Video> videos = videoService.findAll();
        for (Video video : videos) {
            System.out.println(video);
        }
    }
}

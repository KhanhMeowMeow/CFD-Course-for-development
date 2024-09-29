package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.VideoDto;
import source.webcfd.entity.Video;


public interface VideoMapper {
    VideoMapper INSTANCE = Mappers.getMapper(VideoMapper.class);

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "lesson.id", target = "lessonId")
    VideoDto videoToVideoDto(Video video);

    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "lessonId", target = "lesson.id")
    Video videoDtoToVideo(VideoDto videoDto);
}

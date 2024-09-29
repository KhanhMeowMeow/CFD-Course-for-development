package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.SubmissionDto;
import source.webcfd.entity.Submission;

@Mapper
public interface SubmissionMapper {

    SubmissionMapper INSTANCE = Mappers.getMapper(SubmissionMapper.class);

    @Mapping(source = "assignment.id", target = "assignmentId")
    @Mapping(source = "user.id", target = "userId")
    SubmissionDto submissionToSubmissionDto(Submission submission);

    @Mapping(source = "assignmentId", target = "assignment.id")
    @Mapping(source = "userId", target = "user.id")
    Submission submissionDtoToSubmission(SubmissionDto submissionDto);
}

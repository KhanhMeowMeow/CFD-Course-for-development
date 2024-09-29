package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.PaymentDto;
import source.webcfd.entity.Payment;

@Mapper
public interface PaymentMapper {

    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);

    @Mapping(source = "course.id", target = "courseId")
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "paymentStatus.id", target = "paymentStatusId")
    PaymentDto paymentToPaymentDto(Payment payment);

    @Mapping(source = "courseId", target = "course.id")
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "paymentStatusId", target = "paymentStatus.id")
    Payment paymentDtoToPayment(PaymentDto paymentDto);
}

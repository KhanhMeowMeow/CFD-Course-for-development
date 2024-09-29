package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.PaymentStatusDto;
import source.webcfd.entity.PaymentStatus;

@Mapper
public interface PaymentStatusMapper {

    PaymentStatusMapper INSTANCE = Mappers.getMapper(PaymentStatusMapper.class);

    PaymentStatusDto paymentStatusToPaymentStatusDto(PaymentStatus paymentStatus);

    PaymentStatus paymentStatusDtoToPaymentStatus(PaymentStatusDto paymentStatusDto);
}

package org.openapitools.api;

import org.openapitools.model.ApiHealth;
import org.openapitools.model.Error;
import org.openapitools.model.PostAspspsOKBody;
import org.openapitools.model.PostAspspsParamsBody;
import org.openapitools.model.PostPaymentsConsentsRawOKBody;
import org.openapitools.model.PostPaymentsConsentsRawParamsBody;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsOKBody;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsParamsBody;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersOKBody;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersParamsBody;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersPaymentStatusOKBody;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersConsentsOKBody;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersConsentsParamsBody;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersOKBody;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersParamsBody;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersPaymentStatusOKBody;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersPaymentStatusParamsBody;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsOKBody;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBody;
import org.openapitools.model.PostPaymentsSepaCreditTransfersOKBody;
import org.openapitools.model.PostPaymentsSepaCreditTransfersParamsBody;
import org.openapitools.model.PostPaymentsSepaCreditTransfersPaymentStatusOKBody;
import org.openapitools.model.PostPaymentsSepaCreditTransfersPaymentStatusParamsBody;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
@Controller
@RequestMapping("${openapi.openBankingPaymentsInitiationService.base-path:/openbanking/sandbox/connect/api}")
public class PaymentsApiController implements PaymentsApi {

    private final NativeWebRequest request;

    @Autowired
    public PaymentsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}

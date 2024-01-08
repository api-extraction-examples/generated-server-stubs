from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.payment_consent import PaymentConsent
from openapi_server.models.post_payments_domestic_credit_transfers_ok_body_original_request_info import PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo
from openapi_server.models.post_payments_domestic_credit_transfers_ok_body_transfer import PostPaymentsDomesticCreditTransfersOKBodyTransfer
from openapi_server import util

from openapi_server.models.payment_consent import PaymentConsent  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_ok_body_original_request_info import PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_ok_body_transfer import PostPaymentsDomesticCreditTransfersOKBodyTransfer  # noqa: E501

class PostPaymentsDomesticCreditTransfersOKBody(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, consent=None, original_request_info=None, transfer=None):  # noqa: E501
        """PostPaymentsDomesticCreditTransfersOKBody - a model defined in OpenAPI

        :param consent: The consent of this PostPaymentsDomesticCreditTransfersOKBody.  # noqa: E501
        :type consent: PaymentConsent
        :param original_request_info: The original_request_info of this PostPaymentsDomesticCreditTransfersOKBody.  # noqa: E501
        :type original_request_info: PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo
        :param transfer: The transfer of this PostPaymentsDomesticCreditTransfersOKBody.  # noqa: E501
        :type transfer: PostPaymentsDomesticCreditTransfersOKBodyTransfer
        """
        self.openapi_types = {
            'consent': PaymentConsent,
            'original_request_info': PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo,
            'transfer': PostPaymentsDomesticCreditTransfersOKBodyTransfer
        }

        self.attribute_map = {
            'consent': 'consent',
            'original_request_info': 'originalRequestInfo',
            'transfer': 'transfer'
        }

        self._consent = consent
        self._original_request_info = original_request_info
        self._transfer = transfer

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsDomesticCreditTransfersOKBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsDomesticCreditTransfersOKBody of this PostPaymentsDomesticCreditTransfersOKBody.  # noqa: E501
        :rtype: PostPaymentsDomesticCreditTransfersOKBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def consent(self) -> PaymentConsent:
        """Gets the consent of this PostPaymentsDomesticCreditTransfersOKBody.


        :return: The consent of this PostPaymentsDomesticCreditTransfersOKBody.
        :rtype: PaymentConsent
        """
        return self._consent

    @consent.setter
    def consent(self, consent: PaymentConsent):
        """Sets the consent of this PostPaymentsDomesticCreditTransfersOKBody.


        :param consent: The consent of this PostPaymentsDomesticCreditTransfersOKBody.
        :type consent: PaymentConsent
        """
        if consent is None:
            raise ValueError("Invalid value for `consent`, must not be `None`")  # noqa: E501

        self._consent = consent

    @property
    def original_request_info(self) -> PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo:
        """Gets the original_request_info of this PostPaymentsDomesticCreditTransfersOKBody.


        :return: The original_request_info of this PostPaymentsDomesticCreditTransfersOKBody.
        :rtype: PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo
        """
        return self._original_request_info

    @original_request_info.setter
    def original_request_info(self, original_request_info: PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo):
        """Sets the original_request_info of this PostPaymentsDomesticCreditTransfersOKBody.


        :param original_request_info: The original_request_info of this PostPaymentsDomesticCreditTransfersOKBody.
        :type original_request_info: PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo
        """
        if original_request_info is None:
            raise ValueError("Invalid value for `original_request_info`, must not be `None`")  # noqa: E501

        self._original_request_info = original_request_info

    @property
    def transfer(self) -> PostPaymentsDomesticCreditTransfersOKBodyTransfer:
        """Gets the transfer of this PostPaymentsDomesticCreditTransfersOKBody.


        :return: The transfer of this PostPaymentsDomesticCreditTransfersOKBody.
        :rtype: PostPaymentsDomesticCreditTransfersOKBodyTransfer
        """
        return self._transfer

    @transfer.setter
    def transfer(self, transfer: PostPaymentsDomesticCreditTransfersOKBodyTransfer):
        """Sets the transfer of this PostPaymentsDomesticCreditTransfersOKBody.


        :param transfer: The transfer of this PostPaymentsDomesticCreditTransfersOKBody.
        :type transfer: PostPaymentsDomesticCreditTransfersOKBodyTransfer
        """
        if transfer is None:
            raise ValueError("Invalid value for `transfer`, must not be `None`")  # noqa: E501

        self._transfer = transfer

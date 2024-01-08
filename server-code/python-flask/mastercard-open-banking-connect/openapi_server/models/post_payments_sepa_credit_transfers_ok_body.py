from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.post_payments_sepa_credit_transfers_ok_body_original_request_info import PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo
from openapi_server.models.post_payments_sepa_credit_transfers_ok_body_transfer import PostPaymentsSepaCreditTransfersOKBodyTransfer
from openapi_server.models.sepa_payment_consent import SepaPaymentConsent
from openapi_server import util

from openapi_server.models.post_payments_sepa_credit_transfers_ok_body_original_request_info import PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_ok_body_transfer import PostPaymentsSepaCreditTransfersOKBodyTransfer  # noqa: E501
from openapi_server.models.sepa_payment_consent import SepaPaymentConsent  # noqa: E501

class PostPaymentsSepaCreditTransfersOKBody(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, consent=None, original_request_info=None, transfer=None):  # noqa: E501
        """PostPaymentsSepaCreditTransfersOKBody - a model defined in OpenAPI

        :param consent: The consent of this PostPaymentsSepaCreditTransfersOKBody.  # noqa: E501
        :type consent: SepaPaymentConsent
        :param original_request_info: The original_request_info of this PostPaymentsSepaCreditTransfersOKBody.  # noqa: E501
        :type original_request_info: PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo
        :param transfer: The transfer of this PostPaymentsSepaCreditTransfersOKBody.  # noqa: E501
        :type transfer: PostPaymentsSepaCreditTransfersOKBodyTransfer
        """
        self.openapi_types = {
            'consent': SepaPaymentConsent,
            'original_request_info': PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo,
            'transfer': PostPaymentsSepaCreditTransfersOKBodyTransfer
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
    def from_dict(cls, dikt) -> 'PostPaymentsSepaCreditTransfersOKBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsSepaCreditTransfersOKBody of this PostPaymentsSepaCreditTransfersOKBody.  # noqa: E501
        :rtype: PostPaymentsSepaCreditTransfersOKBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def consent(self) -> SepaPaymentConsent:
        """Gets the consent of this PostPaymentsSepaCreditTransfersOKBody.


        :return: The consent of this PostPaymentsSepaCreditTransfersOKBody.
        :rtype: SepaPaymentConsent
        """
        return self._consent

    @consent.setter
    def consent(self, consent: SepaPaymentConsent):
        """Sets the consent of this PostPaymentsSepaCreditTransfersOKBody.


        :param consent: The consent of this PostPaymentsSepaCreditTransfersOKBody.
        :type consent: SepaPaymentConsent
        """
        if consent is None:
            raise ValueError("Invalid value for `consent`, must not be `None`")  # noqa: E501

        self._consent = consent

    @property
    def original_request_info(self) -> PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo:
        """Gets the original_request_info of this PostPaymentsSepaCreditTransfersOKBody.


        :return: The original_request_info of this PostPaymentsSepaCreditTransfersOKBody.
        :rtype: PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo
        """
        return self._original_request_info

    @original_request_info.setter
    def original_request_info(self, original_request_info: PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo):
        """Sets the original_request_info of this PostPaymentsSepaCreditTransfersOKBody.


        :param original_request_info: The original_request_info of this PostPaymentsSepaCreditTransfersOKBody.
        :type original_request_info: PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo
        """
        if original_request_info is None:
            raise ValueError("Invalid value for `original_request_info`, must not be `None`")  # noqa: E501

        self._original_request_info = original_request_info

    @property
    def transfer(self) -> PostPaymentsSepaCreditTransfersOKBodyTransfer:
        """Gets the transfer of this PostPaymentsSepaCreditTransfersOKBody.


        :return: The transfer of this PostPaymentsSepaCreditTransfersOKBody.
        :rtype: PostPaymentsSepaCreditTransfersOKBodyTransfer
        """
        return self._transfer

    @transfer.setter
    def transfer(self, transfer: PostPaymentsSepaCreditTransfersOKBodyTransfer):
        """Sets the transfer of this PostPaymentsSepaCreditTransfersOKBody.


        :param transfer: The transfer of this PostPaymentsSepaCreditTransfersOKBody.
        :type transfer: PostPaymentsSepaCreditTransfersOKBodyTransfer
        """
        if transfer is None:
            raise ValueError("Invalid value for `transfer`, must not be `None`")  # noqa: E501

        self._transfer = transfer

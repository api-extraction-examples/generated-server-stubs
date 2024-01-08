from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.post_payments_domestic_credit_transfers_payment_status_ok_body_original_request_info import PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo
from openapi_server.models.post_payments_domestic_credit_transfers_payment_status_ok_body_payments import PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments
from openapi_server import util

from openapi_server.models.post_payments_domestic_credit_transfers_payment_status_ok_body_original_request_info import PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_payment_status_ok_body_payments import PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments  # noqa: E501

class PostPaymentsDomesticCreditTransfersPaymentStatusOKBody(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, original_request_info=None, payments=None):  # noqa: E501
        """PostPaymentsDomesticCreditTransfersPaymentStatusOKBody - a model defined in OpenAPI

        :param original_request_info: The original_request_info of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.  # noqa: E501
        :type original_request_info: PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo
        :param payments: The payments of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.  # noqa: E501
        :type payments: PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments
        """
        self.openapi_types = {
            'original_request_info': PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo,
            'payments': PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments
        }

        self.attribute_map = {
            'original_request_info': 'originalRequestInfo',
            'payments': 'payments'
        }

        self._original_request_info = original_request_info
        self._payments = payments

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsDomesticCreditTransfersPaymentStatusOKBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsDomesticCreditTransfersPaymentStatusOKBody of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.  # noqa: E501
        :rtype: PostPaymentsDomesticCreditTransfersPaymentStatusOKBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def original_request_info(self) -> PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo:
        """Gets the original_request_info of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.


        :return: The original_request_info of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.
        :rtype: PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo
        """
        return self._original_request_info

    @original_request_info.setter
    def original_request_info(self, original_request_info: PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo):
        """Sets the original_request_info of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.


        :param original_request_info: The original_request_info of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.
        :type original_request_info: PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo
        """
        if original_request_info is None:
            raise ValueError("Invalid value for `original_request_info`, must not be `None`")  # noqa: E501

        self._original_request_info = original_request_info

    @property
    def payments(self) -> PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments:
        """Gets the payments of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.


        :return: The payments of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.
        :rtype: PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments
        """
        return self._payments

    @payments.setter
    def payments(self, payments: PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments):
        """Sets the payments of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.


        :param payments: The payments of this PostPaymentsDomesticCreditTransfersPaymentStatusOKBody.
        :type payments: PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments
        """

        self._payments = payments
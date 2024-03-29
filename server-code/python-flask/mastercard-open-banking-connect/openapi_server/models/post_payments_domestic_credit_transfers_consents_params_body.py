from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.post_payments_domestic_credit_transfers_consents_params_body_payments import PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments
from openapi_server.models.post_payments_domestic_credit_transfers_consents_params_body_request_info import PostPaymentsDomesticCreditTransfersConsentsParamsBodyRequestInfo
from openapi_server import util

from openapi_server.models.post_payments_domestic_credit_transfers_consents_params_body_payments import PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_consents_params_body_request_info import PostPaymentsDomesticCreditTransfersConsentsParamsBodyRequestInfo  # noqa: E501

class PostPaymentsDomesticCreditTransfersConsentsParamsBody(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, payments=None, request_info=None):  # noqa: E501
        """PostPaymentsDomesticCreditTransfersConsentsParamsBody - a model defined in OpenAPI

        :param payments: The payments of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.  # noqa: E501
        :type payments: PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments
        :param request_info: The request_info of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.  # noqa: E501
        :type request_info: PostPaymentsDomesticCreditTransfersConsentsParamsBodyRequestInfo
        """
        self.openapi_types = {
            'payments': PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments,
            'request_info': PostPaymentsDomesticCreditTransfersConsentsParamsBodyRequestInfo
        }

        self.attribute_map = {
            'payments': 'payments',
            'request_info': 'requestInfo'
        }

        self._payments = payments
        self._request_info = request_info

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsDomesticCreditTransfersConsentsParamsBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsDomesticCreditTransfersConsentsParamsBody of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.  # noqa: E501
        :rtype: PostPaymentsDomesticCreditTransfersConsentsParamsBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def payments(self) -> PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments:
        """Gets the payments of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.


        :return: The payments of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.
        :rtype: PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments
        """
        return self._payments

    @payments.setter
    def payments(self, payments: PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments):
        """Sets the payments of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.


        :param payments: The payments of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.
        :type payments: PostPaymentsDomesticCreditTransfersConsentsParamsBodyPayments
        """
        if payments is None:
            raise ValueError("Invalid value for `payments`, must not be `None`")  # noqa: E501

        self._payments = payments

    @property
    def request_info(self) -> PostPaymentsDomesticCreditTransfersConsentsParamsBodyRequestInfo:
        """Gets the request_info of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.


        :return: The request_info of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.
        :rtype: PostPaymentsDomesticCreditTransfersConsentsParamsBodyRequestInfo
        """
        return self._request_info

    @request_info.setter
    def request_info(self, request_info: PostPaymentsDomesticCreditTransfersConsentsParamsBodyRequestInfo):
        """Sets the request_info of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.


        :param request_info: The request_info of this PostPaymentsDomesticCreditTransfersConsentsParamsBody.
        :type request_info: PostPaymentsDomesticCreditTransfersConsentsParamsBodyRequestInfo
        """
        if request_info is None:
            raise ValueError("Invalid value for `request_info`, must not be `None`")  # noqa: E501

        self._request_info = request_info

from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_request_info import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo
from openapi_server import util

from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_request_info import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo  # noqa: E501

class PostPaymentsCrossBorderCreditTransfersConsentsParamsBody(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, payments=None, request_info=None):  # noqa: E501
        """PostPaymentsCrossBorderCreditTransfersConsentsParamsBody - a model defined in OpenAPI

        :param payments: The payments of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.  # noqa: E501
        :type payments: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments
        :param request_info: The request_info of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.  # noqa: E501
        :type request_info: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo
        """
        self.openapi_types = {
            'payments': PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments,
            'request_info': PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo
        }

        self.attribute_map = {
            'payments': 'payments',
            'request_info': 'requestInfo'
        }

        self._payments = payments
        self._request_info = request_info

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsCrossBorderCreditTransfersConsentsParamsBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsCrossBorderCreditTransfersConsentsParamsBody of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.  # noqa: E501
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def payments(self) -> PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments:
        """Gets the payments of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.


        :return: The payments of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments
        """
        return self._payments

    @payments.setter
    def payments(self, payments: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments):
        """Sets the payments of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.


        :param payments: The payments of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.
        :type payments: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments
        """
        if payments is None:
            raise ValueError("Invalid value for `payments`, must not be `None`")  # noqa: E501

        self._payments = payments

    @property
    def request_info(self) -> PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo:
        """Gets the request_info of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.


        :return: The request_info of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo
        """
        return self._request_info

    @request_info.setter
    def request_info(self, request_info: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo):
        """Sets the request_info of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.


        :param request_info: The request_info of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.
        :type request_info: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo
        """
        if request_info is None:
            raise ValueError("Invalid value for `request_info`, must not be `None`")  # noqa: E501

        self._request_info = request_info

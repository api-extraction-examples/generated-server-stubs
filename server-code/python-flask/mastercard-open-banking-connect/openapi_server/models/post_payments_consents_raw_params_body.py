from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.post_payments_consents_raw_params_body_request_info import PostPaymentsConsentsRawParamsBodyRequestInfo
from openapi_server import util

from openapi_server.models.post_payments_consents_raw_params_body_request_info import PostPaymentsConsentsRawParamsBodyRequestInfo  # noqa: E501

class PostPaymentsConsentsRawParamsBody(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, request_info=None):  # noqa: E501
        """PostPaymentsConsentsRawParamsBody - a model defined in OpenAPI

        :param request_info: The request_info of this PostPaymentsConsentsRawParamsBody.  # noqa: E501
        :type request_info: PostPaymentsConsentsRawParamsBodyRequestInfo
        """
        self.openapi_types = {
            'request_info': PostPaymentsConsentsRawParamsBodyRequestInfo
        }

        self.attribute_map = {
            'request_info': 'requestInfo'
        }

        self._request_info = request_info

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsConsentsRawParamsBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsConsentsRawParamsBody of this PostPaymentsConsentsRawParamsBody.  # noqa: E501
        :rtype: PostPaymentsConsentsRawParamsBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def request_info(self) -> PostPaymentsConsentsRawParamsBodyRequestInfo:
        """Gets the request_info of this PostPaymentsConsentsRawParamsBody.


        :return: The request_info of this PostPaymentsConsentsRawParamsBody.
        :rtype: PostPaymentsConsentsRawParamsBodyRequestInfo
        """
        return self._request_info

    @request_info.setter
    def request_info(self, request_info: PostPaymentsConsentsRawParamsBodyRequestInfo):
        """Sets the request_info of this PostPaymentsConsentsRawParamsBody.


        :param request_info: The request_info of this PostPaymentsConsentsRawParamsBody.
        :type request_info: PostPaymentsConsentsRawParamsBodyRequestInfo
        """
        if request_info is None:
            raise ValueError("Invalid value for `request_info`, must not be `None`")  # noqa: E501

        self._request_info = request_info

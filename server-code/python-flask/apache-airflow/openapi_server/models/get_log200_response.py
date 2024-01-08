from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetLog200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, content=None, continuation_token=None):  # noqa: E501
        """GetLog200Response - a model defined in OpenAPI

        :param content: The content of this GetLog200Response.  # noqa: E501
        :type content: str
        :param continuation_token: The continuation_token of this GetLog200Response.  # noqa: E501
        :type continuation_token: str
        """
        self.openapi_types = {
            'content': str,
            'continuation_token': str
        }

        self.attribute_map = {
            'content': 'content',
            'continuation_token': 'continuation_token'
        }

        self._content = content
        self._continuation_token = continuation_token

    @classmethod
    def from_dict(cls, dikt) -> 'GetLog200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The get_log_200_response of this GetLog200Response.  # noqa: E501
        :rtype: GetLog200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def content(self) -> str:
        """Gets the content of this GetLog200Response.


        :return: The content of this GetLog200Response.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content: str):
        """Sets the content of this GetLog200Response.


        :param content: The content of this GetLog200Response.
        :type content: str
        """

        self._content = content

    @property
    def continuation_token(self) -> str:
        """Gets the continuation_token of this GetLog200Response.


        :return: The continuation_token of this GetLog200Response.
        :rtype: str
        """
        return self._continuation_token

    @continuation_token.setter
    def continuation_token(self, continuation_token: str):
        """Sets the continuation_token of this GetLog200Response.


        :param continuation_token: The continuation_token of this GetLog200Response.
        :type continuation_token: str
        """

        self._continuation_token = continuation_token

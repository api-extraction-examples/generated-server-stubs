from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetServiceLastAccessedDetailsResponseError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, message=None, code=None):  # noqa: E501
        """GetServiceLastAccessedDetailsResponseError - a model defined in OpenAPI

        :param message: The message of this GetServiceLastAccessedDetailsResponseError.  # noqa: E501
        :type message: str
        :param code: The code of this GetServiceLastAccessedDetailsResponseError.  # noqa: E501
        :type code: str
        """
        self.openapi_types = {
            'message': str,
            'code': str
        }

        self.attribute_map = {
            'message': 'Message',
            'code': 'Code'
        }

        self._message = message
        self._code = code

    @classmethod
    def from_dict(cls, dikt) -> 'GetServiceLastAccessedDetailsResponseError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetServiceLastAccessedDetailsResponse_Error of this GetServiceLastAccessedDetailsResponseError.  # noqa: E501
        :rtype: GetServiceLastAccessedDetailsResponseError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def message(self) -> str:
        """Gets the message of this GetServiceLastAccessedDetailsResponseError.


        :return: The message of this GetServiceLastAccessedDetailsResponseError.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this GetServiceLastAccessedDetailsResponseError.


        :param message: The message of this GetServiceLastAccessedDetailsResponseError.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")  # noqa: E501

        self._message = message

    @property
    def code(self) -> str:
        """Gets the code of this GetServiceLastAccessedDetailsResponseError.


        :return: The code of this GetServiceLastAccessedDetailsResponseError.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code: str):
        """Sets the code of this GetServiceLastAccessedDetailsResponseError.


        :param code: The code of this GetServiceLastAccessedDetailsResponseError.
        :type code: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")  # noqa: E501

        self._code = code

from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ErrorResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, error=None):  # noqa: E501
        """ErrorResponse - a model defined in OpenAPI

        :param error: The error of this ErrorResponse.  # noqa: E501
        :type error: str
        """
        self.openapi_types = {
            'error': str
        }

        self.attribute_map = {
            'error': 'error'
        }

        self._error = error

    @classmethod
    def from_dict(cls, dikt) -> 'ErrorResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ErrorResponse of this ErrorResponse.  # noqa: E501
        :rtype: ErrorResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def error(self) -> str:
        """Gets the error of this ErrorResponse.

        Error message.  # noqa: E501

        :return: The error of this ErrorResponse.
        :rtype: str
        """
        return self._error

    @error.setter
    def error(self, error: str):
        """Sets the error of this ErrorResponse.

        Error message.  # noqa: E501

        :param error: The error of this ErrorResponse.
        :type error: str
        """
        if error is None:
            raise ValueError("Invalid value for `error`, must not be `None`")  # noqa: E501

        self._error = error

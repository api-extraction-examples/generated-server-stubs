from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Error(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, error=None, error_description=None):  # noqa: E501
        """Error - a model defined in OpenAPI

        :param error: The error of this Error.  # noqa: E501
        :type error: str
        :param error_description: The error_description of this Error.  # noqa: E501
        :type error_description: str
        """
        self.openapi_types = {
            'error': str,
            'error_description': str
        }

        self.attribute_map = {
            'error': 'error',
            'error_description': 'error_description'
        }

        self._error = error
        self._error_description = error_description

    @classmethod
    def from_dict(cls, dikt) -> 'Error':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Error of this Error.  # noqa: E501
        :rtype: Error
        """
        return util.deserialize_model(dikt, cls)

    @property
    def error(self) -> str:
        """Gets the error of this Error.


        :return: The error of this Error.
        :rtype: str
        """
        return self._error

    @error.setter
    def error(self, error: str):
        """Sets the error of this Error.


        :param error: The error of this Error.
        :type error: str
        """
        if error is None:
            raise ValueError("Invalid value for `error`, must not be `None`")  # noqa: E501

        self._error = error

    @property
    def error_description(self) -> str:
        """Gets the error_description of this Error.


        :return: The error_description of this Error.
        :rtype: str
        """
        return self._error_description

    @error_description.setter
    def error_description(self, error_description: str):
        """Sets the error_description of this Error.


        :param error_description: The error_description of this Error.
        :type error_description: str
        """

        self._error_description = error_description

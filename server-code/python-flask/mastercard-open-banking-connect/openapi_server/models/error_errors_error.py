from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ErrorErrorsError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, details=None, reason_code=None, recoverable=None, source=None):  # noqa: E501
        """ErrorErrorsError - a model defined in OpenAPI

        :param description: The description of this ErrorErrorsError.  # noqa: E501
        :type description: str
        :param details: The details of this ErrorErrorsError.  # noqa: E501
        :type details: str
        :param reason_code: The reason_code of this ErrorErrorsError.  # noqa: E501
        :type reason_code: str
        :param recoverable: The recoverable of this ErrorErrorsError.  # noqa: E501
        :type recoverable: bool
        :param source: The source of this ErrorErrorsError.  # noqa: E501
        :type source: str
        """
        self.openapi_types = {
            'description': str,
            'details': str,
            'reason_code': str,
            'recoverable': bool,
            'source': str
        }

        self.attribute_map = {
            'description': 'Description',
            'details': 'Details',
            'reason_code': 'ReasonCode',
            'recoverable': 'Recoverable',
            'source': 'Source'
        }

        self._description = description
        self._details = details
        self._reason_code = reason_code
        self._recoverable = recoverable
        self._source = source

    @classmethod
    def from_dict(cls, dikt) -> 'ErrorErrorsError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Error_Errors_Error of this ErrorErrorsError.  # noqa: E501
        :rtype: ErrorErrorsError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this ErrorErrorsError.


        :return: The description of this ErrorErrorsError.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ErrorErrorsError.


        :param description: The description of this ErrorErrorsError.
        :type description: str
        """

        self._description = description

    @property
    def details(self) -> str:
        """Gets the details of this ErrorErrorsError.


        :return: The details of this ErrorErrorsError.
        :rtype: str
        """
        return self._details

    @details.setter
    def details(self, details: str):
        """Sets the details of this ErrorErrorsError.


        :param details: The details of this ErrorErrorsError.
        :type details: str
        """

        self._details = details

    @property
    def reason_code(self) -> str:
        """Gets the reason_code of this ErrorErrorsError.


        :return: The reason_code of this ErrorErrorsError.
        :rtype: str
        """
        return self._reason_code

    @reason_code.setter
    def reason_code(self, reason_code: str):
        """Sets the reason_code of this ErrorErrorsError.


        :param reason_code: The reason_code of this ErrorErrorsError.
        :type reason_code: str
        """

        self._reason_code = reason_code

    @property
    def recoverable(self) -> bool:
        """Gets the recoverable of this ErrorErrorsError.


        :return: The recoverable of this ErrorErrorsError.
        :rtype: bool
        """
        return self._recoverable

    @recoverable.setter
    def recoverable(self, recoverable: bool):
        """Sets the recoverable of this ErrorErrorsError.


        :param recoverable: The recoverable of this ErrorErrorsError.
        :type recoverable: bool
        """

        self._recoverable = recoverable

    @property
    def source(self) -> str:
        """Gets the source of this ErrorErrorsError.


        :return: The source of this ErrorErrorsError.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source: str):
        """Sets the source of this ErrorErrorsError.


        :param source: The source of this ErrorErrorsError.
        :type source: str
        """

        self._source = source

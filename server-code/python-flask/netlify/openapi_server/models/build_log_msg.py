from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BuildLogMsg(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, error=None, message=None, section=None):  # noqa: E501
        """BuildLogMsg - a model defined in OpenAPI

        :param error: The error of this BuildLogMsg.  # noqa: E501
        :type error: bool
        :param message: The message of this BuildLogMsg.  # noqa: E501
        :type message: str
        :param section: The section of this BuildLogMsg.  # noqa: E501
        :type section: str
        """
        self.openapi_types = {
            'error': bool,
            'message': str,
            'section': str
        }

        self.attribute_map = {
            'error': 'error',
            'message': 'message',
            'section': 'section'
        }

        self._error = error
        self._message = message
        self._section = section

    @classmethod
    def from_dict(cls, dikt) -> 'BuildLogMsg':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The buildLogMsg of this BuildLogMsg.  # noqa: E501
        :rtype: BuildLogMsg
        """
        return util.deserialize_model(dikt, cls)

    @property
    def error(self) -> bool:
        """Gets the error of this BuildLogMsg.


        :return: The error of this BuildLogMsg.
        :rtype: bool
        """
        return self._error

    @error.setter
    def error(self, error: bool):
        """Sets the error of this BuildLogMsg.


        :param error: The error of this BuildLogMsg.
        :type error: bool
        """

        self._error = error

    @property
    def message(self) -> str:
        """Gets the message of this BuildLogMsg.


        :return: The message of this BuildLogMsg.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this BuildLogMsg.


        :param message: The message of this BuildLogMsg.
        :type message: str
        """

        self._message = message

    @property
    def section(self) -> str:
        """Gets the section of this BuildLogMsg.


        :return: The section of this BuildLogMsg.
        :rtype: str
        """
        return self._section

    @section.setter
    def section(self, section: str):
        """Sets the section of this BuildLogMsg.


        :param section: The section of this BuildLogMsg.
        :type section: str
        """
        allowed_values = ["initializing", "building", "deploying", "cleanup", "postprocessing"]  # noqa: E501
        if section not in allowed_values:
            raise ValueError(
                "Invalid value for `section` ({0}), must be one of {1}"
                .format(section, allowed_values)
            )

        self._section = section

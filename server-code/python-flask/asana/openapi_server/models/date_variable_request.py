from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DateVariableRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, value=None):  # noqa: E501
        """DateVariableRequest - a model defined in OpenAPI

        :param gid: The gid of this DateVariableRequest.  # noqa: E501
        :type gid: str
        :param value: The value of this DateVariableRequest.  # noqa: E501
        :type value: datetime
        """
        self.openapi_types = {
            'gid': str,
            'value': datetime
        }

        self.attribute_map = {
            'gid': 'gid',
            'value': 'value'
        }

        self._gid = gid
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'DateVariableRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DateVariableRequest of this DateVariableRequest.  # noqa: E501
        :rtype: DateVariableRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this DateVariableRequest.

        Globally unique identifier of the date field in the project template. A value of `1` refers to the project start date, while `2` refers to the project due date.  # noqa: E501

        :return: The gid of this DateVariableRequest.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this DateVariableRequest.

        Globally unique identifier of the date field in the project template. A value of `1` refers to the project start date, while `2` refers to the project due date.  # noqa: E501

        :param gid: The gid of this DateVariableRequest.
        :type gid: str
        """

        self._gid = gid

    @property
    def value(self) -> datetime:
        """Gets the value of this DateVariableRequest.

        The date with which the date variable should be replaced when instantiating a project. This takes a date with `YYYY-MM-DD` format.  # noqa: E501

        :return: The value of this DateVariableRequest.
        :rtype: datetime
        """
        return self._value

    @value.setter
    def value(self, value: datetime):
        """Sets the value of this DateVariableRequest.

        The date with which the date variable should be replaced when instantiating a project. This takes a date with `YYYY-MM-DD` format.  # noqa: E501

        :param value: The value of this DateVariableRequest.
        :type value: datetime
        """

        self._value = value

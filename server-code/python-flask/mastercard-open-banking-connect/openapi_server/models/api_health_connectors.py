from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ApiHealthConnectors(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, status=None, status_message=None):  # noqa: E501
        """ApiHealthConnectors - a model defined in OpenAPI

        :param name: The name of this ApiHealthConnectors.  # noqa: E501
        :type name: str
        :param status: The status of this ApiHealthConnectors.  # noqa: E501
        :type status: str
        :param status_message: The status_message of this ApiHealthConnectors.  # noqa: E501
        :type status_message: str
        """
        self.openapi_types = {
            'name': str,
            'status': str,
            'status_message': str
        }

        self.attribute_map = {
            'name': 'name',
            'status': 'status',
            'status_message': 'statusMessage'
        }

        self._name = name
        self._status = status
        self._status_message = status_message

    @classmethod
    def from_dict(cls, dikt) -> 'ApiHealthConnectors':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ApiHealth_connectors of this ApiHealthConnectors.  # noqa: E501
        :rtype: ApiHealthConnectors
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this ApiHealthConnectors.

        Connector name  # noqa: E501

        :return: The name of this ApiHealthConnectors.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ApiHealthConnectors.

        Connector name  # noqa: E501

        :param name: The name of this ApiHealthConnectors.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def status(self) -> str:
        """Gets the status of this ApiHealthConnectors.

        Overall connect platform availability status  # noqa: E501

        :return: The status of this ApiHealthConnectors.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this ApiHealthConnectors.

        Overall connect platform availability status  # noqa: E501

        :param status: The status of this ApiHealthConnectors.
        :type status: str
        """
        allowed_values = ["UP", "DOWN", "DEGRADED"]  # noqa: E501
        if status not in allowed_values:
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"
                .format(status, allowed_values)
            )

        self._status = status

    @property
    def status_message(self) -> str:
        """Gets the status_message of this ApiHealthConnectors.

        Additional informational message  # noqa: E501

        :return: The status_message of this ApiHealthConnectors.
        :rtype: str
        """
        return self._status_message

    @status_message.setter
    def status_message(self, status_message: str):
        """Sets the status_message of this ApiHealthConnectors.

        Additional informational message  # noqa: E501

        :param status_message: The status_message of this ApiHealthConnectors.
        :type status_message: str
        """

        self._status_message = status_message

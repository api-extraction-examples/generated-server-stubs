from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Body4(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, action=None, elapsed_time=None, pid=None, resource_type=None, version_pid=None):  # noqa: E501
        """Body4 - a model defined in OpenAPI

        :param action: The action of this Body4.  # noqa: E501
        :type action: str
        :param elapsed_time: The elapsed_time of this Body4.  # noqa: E501
        :type elapsed_time: int
        :param pid: The pid of this Body4.  # noqa: E501
        :type pid: str
        :param resource_type: The resource_type of this Body4.  # noqa: E501
        :type resource_type: str
        :param version_pid: The version_pid of this Body4.  # noqa: E501
        :type version_pid: str
        """
        self.openapi_types = {
            'action': str,
            'elapsed_time': int,
            'pid': str,
            'resource_type': str,
            'version_pid': str
        }

        self.attribute_map = {
            'action': 'action',
            'elapsed_time': 'elapsed_time',
            'pid': 'pid',
            'resource_type': 'resource_type',
            'version_pid': 'version_pid'
        }

        self._action = action
        self._elapsed_time = elapsed_time
        self._pid = pid
        self._resource_type = resource_type
        self._version_pid = version_pid

    @classmethod
    def from_dict(cls, dikt) -> 'Body4':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Body_4 of this Body4.  # noqa: E501
        :rtype: Body4
        """
        return util.deserialize_model(dikt, cls)

    @property
    def action(self) -> str:
        """Gets the action of this Body4.


        :return: The action of this Body4.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action: str):
        """Sets the action of this Body4.


        :param action: The action of this Body4.
        :type action: str
        """
        allowed_values = ["started", "ended", "paused", "heartbeat"]  # noqa: E501
        if action not in allowed_values:
            raise ValueError(
                "Invalid value for `action` ({0}), must be one of {1}"
                .format(action, allowed_values)
            )

        self._action = action

    @property
    def elapsed_time(self) -> int:
        """Gets the elapsed_time of this Body4.


        :return: The elapsed_time of this Body4.
        :rtype: int
        """
        return self._elapsed_time

    @elapsed_time.setter
    def elapsed_time(self, elapsed_time: int):
        """Sets the elapsed_time of this Body4.


        :param elapsed_time: The elapsed_time of this Body4.
        :type elapsed_time: int
        """
        if elapsed_time is None:
            raise ValueError("Invalid value for `elapsed_time`, must not be `None`")  # noqa: E501

        self._elapsed_time = elapsed_time

    @property
    def pid(self) -> str:
        """Gets the pid of this Body4.


        :return: The pid of this Body4.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this Body4.


        :param pid: The pid of this Body4.
        :type pid: str
        """
        if pid is None:
            raise ValueError("Invalid value for `pid`, must not be `None`")  # noqa: E501

        self._pid = pid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this Body4.


        :return: The resource_type of this Body4.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this Body4.


        :param resource_type: The resource_type of this Body4.
        :type resource_type: str
        """
        allowed_values = ["episode", "clip"]  # noqa: E501
        if resource_type not in allowed_values:
            raise ValueError(
                "Invalid value for `resource_type` ({0}), must be one of {1}"
                .format(resource_type, allowed_values)
            )

        self._resource_type = resource_type

    @property
    def version_pid(self) -> str:
        """Gets the version_pid of this Body4.


        :return: The version_pid of this Body4.
        :rtype: str
        """
        return self._version_pid

    @version_pid.setter
    def version_pid(self, version_pid: str):
        """Sets the version_pid of this Body4.


        :param version_pid: The version_pid of this Body4.
        :type version_pid: str
        """
        if version_pid is None:
            raise ValueError("Invalid value for `version_pid`, must not be `None`")  # noqa: E501

        self._version_pid = version_pid

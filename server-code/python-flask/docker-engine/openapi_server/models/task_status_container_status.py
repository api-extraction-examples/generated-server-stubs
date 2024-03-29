from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TaskStatusContainerStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, container_id=None, exit_code=None, pid=None):  # noqa: E501
        """TaskStatusContainerStatus - a model defined in OpenAPI

        :param container_id: The container_id of this TaskStatusContainerStatus.  # noqa: E501
        :type container_id: str
        :param exit_code: The exit_code of this TaskStatusContainerStatus.  # noqa: E501
        :type exit_code: int
        :param pid: The pid of this TaskStatusContainerStatus.  # noqa: E501
        :type pid: int
        """
        self.openapi_types = {
            'container_id': str,
            'exit_code': int,
            'pid': int
        }

        self.attribute_map = {
            'container_id': 'ContainerID',
            'exit_code': 'ExitCode',
            'pid': 'PID'
        }

        self._container_id = container_id
        self._exit_code = exit_code
        self._pid = pid

    @classmethod
    def from_dict(cls, dikt) -> 'TaskStatusContainerStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Task_Status_ContainerStatus of this TaskStatusContainerStatus.  # noqa: E501
        :rtype: TaskStatusContainerStatus
        """
        return util.deserialize_model(dikt, cls)

    @property
    def container_id(self) -> str:
        """Gets the container_id of this TaskStatusContainerStatus.


        :return: The container_id of this TaskStatusContainerStatus.
        :rtype: str
        """
        return self._container_id

    @container_id.setter
    def container_id(self, container_id: str):
        """Sets the container_id of this TaskStatusContainerStatus.


        :param container_id: The container_id of this TaskStatusContainerStatus.
        :type container_id: str
        """

        self._container_id = container_id

    @property
    def exit_code(self) -> int:
        """Gets the exit_code of this TaskStatusContainerStatus.


        :return: The exit_code of this TaskStatusContainerStatus.
        :rtype: int
        """
        return self._exit_code

    @exit_code.setter
    def exit_code(self, exit_code: int):
        """Sets the exit_code of this TaskStatusContainerStatus.


        :param exit_code: The exit_code of this TaskStatusContainerStatus.
        :type exit_code: int
        """

        self._exit_code = exit_code

    @property
    def pid(self) -> int:
        """Gets the pid of this TaskStatusContainerStatus.


        :return: The pid of this TaskStatusContainerStatus.
        :rtype: int
        """
        return self._pid

    @pid.setter
    def pid(self, pid: int):
        """Sets the pid of this TaskStatusContainerStatus.


        :param pid: The pid of this TaskStatusContainerStatus.
        :type pid: int
        """

        self._pid = pid

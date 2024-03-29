from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ServiceDependency(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, message=None, service=None, status=None):  # noqa: E501
        """ServiceDependency - a model defined in OpenAPI

        :param message: The message of this ServiceDependency.  # noqa: E501
        :type message: str
        :param service: The service of this ServiceDependency.  # noqa: E501
        :type service: str
        :param status: The status of this ServiceDependency.  # noqa: E501
        :type status: str
        """
        self.openapi_types = {
            'message': str,
            'service': str,
            'status': str
        }

        self.attribute_map = {
            'message': 'message',
            'service': 'service',
            'status': 'status'
        }

        self._message = message
        self._service = service
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'ServiceDependency':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ServiceDependency of this ServiceDependency.  # noqa: E501
        :rtype: ServiceDependency
        """
        return util.deserialize_model(dikt, cls)

    @property
    def message(self) -> str:
        """Gets the message of this ServiceDependency.

        Human-readable message for explaining the current state.  # noqa: E501

        :return: The message of this ServiceDependency.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this ServiceDependency.

        Human-readable message for explaining the current state.  # noqa: E501

        :param message: The message of this ServiceDependency.
        :type message: str
        """

        self._message = message

    @property
    def service(self) -> str:
        """Gets the service of this ServiceDependency.


        :return: The service of this ServiceDependency.
        :rtype: str
        """
        return self._service

    @service.setter
    def service(self, service: str):
        """Sets the service of this ServiceDependency.


        :param service: The service of this ServiceDependency.
        :type service: str
        """

        self._service = service

    @property
    def status(self) -> str:
        """Gets the status of this ServiceDependency.


        :return: The status of this ServiceDependency.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this ServiceDependency.


        :param status: The status of this ServiceDependency.
        :type status: str
        """

        self._status = status
